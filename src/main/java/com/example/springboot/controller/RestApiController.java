package com.example.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.interceptor.BasicAuthRestTemplate;
import com.example.springboot.model.req.Request;
import com.example.springboot.model.res.InsuranceAdditionalInformation;
import com.example.springboot.model.res.MessageSegment;
import com.example.springboot.model.res.Response;
import com.example.springboot.model.res.ResponseHeader;

@RestController
@RequestMapping("/api")
public class RestApiController {

	public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);
	public static final String REST_SERVICE_URI = "http://localhost:8080/SpringBootRestApi/api";

	@RequestMapping(value = "/request/", method = RequestMethod.POST, produces = { "application/json",
			"application/xml" })
	public ResponseEntity<?> postRequest(@RequestBody Request request) {

		BasicAuthRestTemplate restTemplate = new BasicAuthRestTemplate("admin", "admin");

		ResponseEntity<Response> res = restTemplate.postForEntity(REST_SERVICE_URI + "/response/", request,
				Response.class);

		return res;
	}

	@RequestMapping(value = "/response/", method = RequestMethod.POST, produces = { "application/json",
			"application/xml" })
	public ResponseEntity<?> getResponse(@RequestBody Request request) {
		logger.info("Creating User : {}", request);

		Response response = new Response();

		ResponseHeader responseHeader = new ResponseHeader();
		responseHeader.setDateOfService("20170627");
		responseHeader.setHeaderResponseStatus("A");
		responseHeader.setServiceProviderid("1629029251");
		responseHeader.setTransactionCode("E1");
		responseHeader.setTransactionCount("1");
		responseHeader.setVersionReleaseNumber("DO");
		MessageSegment messageSegment = new MessageSegment();
		messageSegment
				.setMessage("ERX128: COMMERCIAL ELIGIBILITY PARTNER HAS INDICATED PRIMARY COVERAGE AS MEDICARE PART D");
		InsuranceAdditionalInformation insuranceAdditionalInformation = new InsuranceAdditionalInformation();
		insuranceAdditionalInformation.setBenefitId("20170701");
		insuranceAdditionalInformation.setcMSLowIncomeCostSharing("Y");
		insuranceAdditionalInformation.setContractNumber("23893783");
		insuranceAdditionalInformation.setFormularyId("1238347");
		insuranceAdditionalInformation.setMedicarePartDCoverageCode("10");
		insuranceAdditionalInformation.setNextMedicarePartDTerminationDate("20190701");
		response.setResponseHeader(responseHeader);
		response.setInsuranceAdditionalInformation(insuranceAdditionalInformation);
		response.setMessageSegment(messageSegment);

		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}

}