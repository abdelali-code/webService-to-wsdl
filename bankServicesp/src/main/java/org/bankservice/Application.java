package org.bankservice;

import jakarta.xml.ws.Endpoint;
import org.bankservice.services.BankAccountService;

public class Application {

	public static void main(String[] args) {
        String url = "http://localhost:9000/";
        Endpoint.publish(url, new BankAccountService());
        System.out.println("web server is deployed ");
	}
	
}
