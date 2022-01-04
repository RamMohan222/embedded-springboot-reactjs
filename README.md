# Read Me First

In this springboot example, it enables the https and run on the port 8443. And in test case there is an example to call the secured (https) endpoint with rest template.
For that we have already created keystore.p12 for server side configuration. And also create the turststore.ts for client side configuration.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.2/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.2/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.6.2/reference/htmlsingle/#using-boot-devtools)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

### APP URI
https://localhost:8443/api/

### Calling the secured endpoint with truststore and RestTemplate.
```java
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
```
