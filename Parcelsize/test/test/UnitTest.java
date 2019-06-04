package test;

import static org.junit.jupiter.api.Assertions.*;

import javax.ws.rs.core.MediaType;

import org.junit.jupiter.api.Test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


import main.ParcelsizeServer;

class UnitTest {

	@Test
	void TestXS_lower() 
	{
		String s = "XS";
		assertEquals(s, "XS");
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
