package unit;

import static org.junit.jupiter.api.Assertions.*;

import javax.ws.rs.core.MediaType;

import org.junit.jupiter.api.Test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import main.Parcel;
import main.ParcelsizeServer;

class UnitTest {

	@Test
	//mein Test - funktioniert!
	//void TestXS_lower() 
	//{
	//	String s = "XS";
	//	assertEquals(s, "XS");
	//}
	
	void xsPackage() {
        Parcel p = new Parcel();
        p.setHeight(5);
        p.setLength(5);
        p.setWidth(5);
        p.calculateSize();
        assertEquals("XS", p.getSize());
}
	
	void sPackage() {
        Parcel p = new Parcel();
        p.setHeight(5);
        p.setLength(6);
        p.setWidth(10);
        p.calculateSize();
        assertEquals("S", p.getSize());
}
	
	void mPackage() {
        Parcel p = new Parcel();
        p.setHeight(5);
        p.setLength(11);
        p.setWidth(15);
        p.calculateSize();
        assertEquals("M", p.getSize());
}
	
	void lPackage() {
        Parcel p = new Parcel();
        p.setHeight(25);
        p.setLength(6);
        p.setWidth(5);
        p.calculateSize();
        assertEquals("L", p.getSize());
}
	
	void xlPackage() {
        Parcel p = new Parcel();
        p.setHeight(25);
        p.setLength(50);
        p.setWidth(10);
        p.calculateSize();
        assertEquals("XL", p.getSize());
}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*//Tests von Flo
	@Test
	void TestS_lower() 
	{
		try {
			ParcelsizeServer.Run();
		} catch (Exception ex) {
			
		}
		JSONObject js = new JSONObject();
		try {
			js.append("length", "15");
			js.append("width", "5");
			js.append("height", "5");
			js.append("size", "0");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String result = GetSize(js.toString());
		System.out.println(result);
		assertEquals("S", result, "Size differs!");
		try {
			ParcelsizeServer.StopRestServer();
		} catch(Exception ex) {
			
		}
	}
	
	@Test
	void TestM_lower() 
	{
		try {
			ParcelsizeServer.Run();
		} catch (Exception ex) {
			
		}
		JSONObject js = new JSONObject();
		try {
			js.append("length", "15");
			js.append("width", "10");
			js.append("height", "10");
			js.append("size", "0");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String result = GetSize(js.toString());
		System.out.println(result);
		assertEquals("M", result, "Size differs!");
		try {
			ParcelsizeServer.StopRestServer();
		} catch(Exception ex) {
			
		}
	}
	
	@Test
	void TestL_lower() 
	{
		try {
			ParcelsizeServer.Run();
		} catch (Exception ex) {
			
		}
		JSONObject js = new JSONObject();
		try {
			js.append("length", "25");
			js.append("width", "15");
			js.append("height", "10");
			js.append("size", "0");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String result = GetSize(js.toString());
		System.out.println(result);
		assertEquals("L", result, "Size differs!");
		try {
			ParcelsizeServer.StopRestServer();
		} catch(Exception ex) {
			
		}
	}
	
	@Test
	void TestXL_lower() 
	{
		try {
			ParcelsizeServer.Run();
		} catch (Exception ex) {
			
		}
		JSONObject js = new JSONObject();
		try {
			js.append("length", "25");
			js.append("width", "15");
			js.append("height", "15");
			js.append("size", "0");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String result = GetSize(js.toString());
		
		System.out.println(result);
		assertEquals("XL", result, "Size differs!");
		try {
			ParcelsizeServer.StopRestServer();
		} catch(Exception ex) {
			
		}
	}	

	static String GetSize(String json)
	{
		String response = TestSize(json);
		JSONObject obj;
		String result;
		try {
			obj = new JSONObject(response);
			result = obj.getString("parcelSize");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "";
		}
		return result;
	}
	
	static String TestSize(String json)
	{
		
		
		Client create = Client.create();
		WebResource service = create.resource(ParcelsizeServer.m_restServerAddress + "rest");
		
		ClientResponse response = service.type("application/json")
				   .post(ClientResponse.class, json);
		
		String result = response.getEntity(String.class);
		
		return result;		
	}
*/
		
	
}
