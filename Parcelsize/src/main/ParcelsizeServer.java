package main;

import java.io.IOException;

import javax.swing.JOptionPane;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;

public class ParcelsizeServer {

	public static void main(String[]args) {
		
		HttpServer server;
		try {
			server = HttpServerFactory.create("http://localhost:8082/rest");
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
