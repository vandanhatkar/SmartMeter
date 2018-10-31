package com.scottishpower.controller;

import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.scottishpower.service.SmartMeterService;


@RestController
@RequestMapping("/api/smart/")
public class SmartMeterController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SmartMeterController.class);
	
	@Autowired
	SmartMeterService smartMeterService;
	
	
	@RequestMapping(value = "reads/{ACCOUNTNUMBER}", method = RequestMethod.GET)
	@Produces("application/json")
	public Response getCustomer(@PathVariable Long ACCOUNTNUMBER) {
		try {
			LOGGER.info("Request received for account number {}",ACCOUNTNUMBER);
			return Response.ok(smartMeterService.getCustomerDetail(ACCOUNTNUMBER)).build();
		} catch(Exception ex) {	
			LOGGER.error("Service returned exception for account number {}",ACCOUNTNUMBER,ex);
		    return Response.status(406).build();
		}
		
	}
}
