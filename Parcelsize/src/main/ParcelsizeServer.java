package main;

import java.io.IOException;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.api.core.ResourceConfig;
import com.sun.net.httpserver.HttpServer;

public class ParcelsizeServer {

	public static void main(String[]args) {
		
		ResourceConfig rc = new PackagesResourceConfig("main");
		rc.getProperties().put(
				"com.sun.jersey.spi.container.ContainerResponseFilters",
				"main.CORSFilter");
		
		HttpServer server = null;
		try {
			server = HttpServerFactory.create("http://localhost:8082/rest", rc);
			server.start();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}