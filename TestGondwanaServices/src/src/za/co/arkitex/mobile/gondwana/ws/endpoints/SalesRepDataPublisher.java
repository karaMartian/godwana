package za.co.arkitex.mobile.gondwana.ws.endpoints;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.xml.ws.Endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import za.co.arkitex.mobile.gondwana.ws.impl.SalesRepresentativeServiceImpl;

public class SalesRepDataPublisher {
	private final static Logger log = LoggerFactory.getLogger(SalesRepDataPublisher.class);
	public static void main(String[] args) {
		Properties prop = new Properties();
		FileInputStream inputstream = null;
		 
		try {
			inputstream = new FileInputStream("config.properties");
			prop.load(inputstream);
			
			String hostURL = prop.getProperty("webserviceEndpoint");
			if (!hostURL.isEmpty()) {
				hostURL  += "/com/arkitex/mobile";
				Endpoint.publish(hostURL, new SalesRepresentativeServiceImpl());
				log.info("Gondwana WebServices Started...");
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (inputstream != null) {
				try {
					inputstream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
