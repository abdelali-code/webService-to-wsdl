package org.bankservice;

import jakarta.xml.ws.Endpoint;
import org.bankservice.services.BankAccountService;

public class Application {

	public static void main(String[] args) {
        String port = "9000";
        String url = "http://localhost:"+ port + "/";
        Endpoint.publish(url, new BankAccountService());
        System.out.println("server is deployed on port " + port);
	}
	
}
