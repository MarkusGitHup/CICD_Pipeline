package main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("parcel")
public class ParcelsizeResource {

	//@GET
	//@Consumes(MediaType.APPLICATION_JSON)
	//@Produces(MediaType.APPLICATION_JSON)
	//@Path("size/")
	//public Response getSize(@QueryParam("length") String length, @QueryParam("width") String width,
		//	@QueryParam("height") String height, @QueryParam("size") String size) {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("length/{length}/width/{width}/height/{height}")
	public Response getSize(@PathParam("length") String length,
							@PathParam("width") String width,
							@PathParam("height") String height) {
		//Parcelsize parcelsize = new Parcelsize(length, width, height, "");
		//parcelsize.calculateSize();
		//return Response.ok().entity(parcelsize).build();
	//}

	
		System.out.println("[info] received length " + length + ", width " + width + ", height " + height);

		Parcel parcel = null;
		int gurtmaß = 0;

		// break if input is not a number
		try {
			gurtmaß = 1 * Integer.parseInt(length) + 2 * Integer.parseInt(width) + 2 * Integer.parseInt(height);
		} catch (Exception e) {
			System.out.println("[info] no valid input");
		}

		// open database connection
		try {
			System.out.println("Bin jetzt bei database connection");
			Connection con = DataBase.openConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT id, size, min_size, max_size " + "FROM packagesize "
					+ "WHERE min_size < '" + gurtmaß + "'" + "AND max_size >= '" + gurtmaß + "'");

			while (rs.next()) {
				parcel = new Parcel(Integer.parseInt(length), Integer.parseInt(width), Integer.parseInt(height),
						rs.getString("size"));
				System.out.println("[info] sending response with size " + parcel.getSize());
			}

		} catch (Exception e) {
			System.out.println("DB-Fehler!" +e.getMessage());
		}
		return Response.ok().entity(parcel).build();

		//return Response.status(200).header("Access-Control-Allow-Origin", "*")
			//	.header("Access-Control-Allow-Credentials", "true")
			//	.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
			//	.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD").entity(parcel).build();
	}

	// only for Test
	public Response getParcel(@QueryParam("length") String length, @QueryParam("width") String width,
			@QueryParam("height") String height, @QueryParam("size") String size) {

		System.out.println("[info] received test length " + length + ", width " + width + ", height " + height);

		Parcel parcel = null;
		int gurtmaß = 0;

		// break if input is not a number
		try {
			gurtmaß = 1 * Integer.parseInt(length) + 2 * Integer.parseInt(width) + 2 * Integer.parseInt(height);
			String testSize = null;
			if(gurtmaß > 0 & gurtmaß <= 35) testSize = "XS";
			if(gurtmaß > 35 & gurtmaß <= 50) testSize = "S";
			if(gurtmaß > 50 & gurtmaß <= 65) testSize = "M";
			if(gurtmaß > 65 & gurtmaß <= 80) testSize = "L";
			if(gurtmaß > 80 & gurtmaß <= 300) testSize = "XL";

			if(testSize != null) parcel = new Parcel(Integer.parseInt(length), Integer.parseInt(width), Integer.parseInt(height),testSize);
		} catch (Exception e) {
			System.out.println("[info] no valid input");
		}


		return Response.status(200).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD").entity(parcel).build();
	}

}