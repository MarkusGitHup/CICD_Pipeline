package main.java;
import com.sun.jersey.api.container.httpserver.HttpServerFactory;

import com.sun.net.httpserver.HttpServer;


@SuppressWarnings("restriction")
public class ParcelsizeServer {
	
// change
	public static void main(String[] args) throws Exception {
		try {
		HttpServer server = HttpServerFactory.create( "http://localhost:4711/rest");
		server.start();
		System.out.println("[info] server started successfully");
		}catch(Exception e) {
			System.err.println("[error] Failed to start server");
			System.err.println(e);
		}
		
    }


}
