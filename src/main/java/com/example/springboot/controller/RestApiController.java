package com.example.springboot.controller;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.interceptor.BasicAuthRestTemplate;
import com.example.springboot.requestxsd.Request;
import com.example.springboot.responsexsd.Response;

@RestController
@RequestMapping("/api")
public class RestApiController {

	public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);
	public static final String REST_SERVICE_URI = "http://localhost:8080/SpringBootRestApi/api";

	@RequestMapping(value = "/request/", method = RequestMethod.POST, consumes={"application/json","application/xml" },produces = { "application/json","application/xml" })
	public ResponseEntity<?> postRequest(@RequestBody Request request) {

		marshaller(request);
		BasicAuthRestTemplate restTemplate = new BasicAuthRestTemplate("admin", "admin");
		
		ResponseEntity<Response> res = restTemplate.postForEntity(REST_SERVICE_URI + "/response/", request,
				Response.class);
		
		return res;
	}

	@RequestMapping(value = "/response/", method = RequestMethod.POST, consumes={"application/json","application/xml" },produces = { "application/json","application/xml" })
	public ResponseEntity<?> getResponse(@RequestBody Request request) {
		logger.info("Creating User : {}", request);
		
		marshaller(request);

		Response response = new Response();
		response.setCode("436554");
		response.setMessage("Success");
		response.setUniqueId("436554");
		String[] funResponse = {"Cheese", "Pepperoni", "Black Olives"};
		response.setFunResponse(funResponse);
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}
public void marshaller(Request request){
	JAXBContext jaxbContext;
	try {
		jaxbContext = JAXBContext.newInstance(Request.class);
	
    Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
 
    jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
     
    //Marshal the employees list in console
    jaxbMarshaller.marshal(request, System.out);
	} catch (JAXBException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}