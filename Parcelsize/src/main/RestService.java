package main;

import java.io.IOException;

import javax.swing.JOptionPane;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlRootElement;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;


@Path("message")
public class RestService {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String message() {
		return "hello";

	}
	
	@GET
	@Produces( MediaType.APPLICATION_JSON )
	@Path("length/{length}/width/{width}/height/{height}")
	public Response message( @PathParam("length") int length,
	                       @PathParam("width") int width,
	                       @PathParam("height") int height)
	{
	  int gurtmas = (height + width)*2 + length;
	  OutputObject retVal = new OutputObject();
	  retVal.length = length;
	  retVal.width = width;
	  retVal.height = height;
	  if (0 <= gurtmas && gurtmas < 35)
	  {
		  retVal.size = "XS";
	  }
	  else if (35 <= gurtmas && gurtmas < 50)
	  {
		  retVal.size = "S";
	  
	  }
	  else if (50 <= gurtmas && gurtmas < 65)
	  {
		  retVal.size = "M";
  
	  }
	  else if (65 <= gurtmas && gurtmas < 80)
	  {
		  retVal.size = "L";
 
	  }
	  else if (80 <= gurtmas && gurtmas < 300)
	  {
		  retVal.size = "XL";

	  }
	  return Response.ok()
              .entity(retVal)
              .header("Access-Control-Allow-Origin", "*")
              .build();

	}
}

@XmlRootElement
class OutputObject
{
	public int length;
	public int width;
	public int height;
	public String size;
}

