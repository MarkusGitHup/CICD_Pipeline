package main;

import java.io.IOException;

import javax.swing.JOptionPane;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;


@Path("message")
public class RestService {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String message() {
		return "hello";

	}

public static void main(String[]args) {
	HttpServer server;
	try {
		server = HttpServerFactory.create("http://localhost:8080/rest");
		server.start();
		JOptionPane.showMessageDialog(null, "Ende");
		server.stop(0);
	} catch (IllegalArgumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}

