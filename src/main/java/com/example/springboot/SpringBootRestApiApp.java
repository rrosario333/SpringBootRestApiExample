package com.example.springboot;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;


@SpringBootApplication(scanBasePackages={"com.example.springboot"})// same as @Configuration @EnableAutoConfiguration @ComponentScan combined
public class SpringBootRestApiApp {
	
	public static void main(String[] args) throws IOException {
		SpringApplication.run(SpringBootRestApiApp.class, args);
		
		System.setProperty("javax.net.ssl.trustStore", new ClassPathResource("xsd/Request.xsd").getFile().getPath());
		System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
		
	}
	
	
	
	
}
