package com.example.embeddedspringbootreactjs;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class EmbeddedSpringbootReactjsApplicationTests {

	@Test
	void contextLoads() {
		System.setProperty("javax.net.ssl.trustStore", "truststore.ts");
		System.setProperty("javax.net.ssl.trustStorePassword", "password");
		RestTemplate template = new RestTemplate();
		String data = template.getForObject("https://localhost:8443/api/users/messages", String.class);
		System.out.println(data);
	}

}
