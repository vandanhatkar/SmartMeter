package com.scottishpower.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import javax.ws.rs.core.Response;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.scottishpower.controller.SmartMeterController;
import com.scottishpower.representation.CustomerRepresentation;


public class SmartMeterControllerTest {
	
	@InjectMocks
	private SmartMeterController smartMeterController;
	
	@Mock
	private SmartMeterService smartMeterService;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
	
	@Test
	public void testShouldSucceedWhenGetCustomerReturnsValidResponse() {
    	
		when(smartMeterService.getCustomerDetail(anyLong())).thenReturn(new CustomerRepresentation());
		Response response = smartMeterController.getCustomer(1L);
		assertEquals("Response should be 200",200, response.getStatus());
		verify(smartMeterService).getCustomerDetail(1l);				
	}
	
	@Test
	public void testShouldFailWhenGetCustomerReturnsException() {
    	
		when(smartMeterService.getCustomerDetail(anyLong())).thenThrow(Exception.class);
		Response response = smartMeterController.getCustomer(1L);
		assertEquals("Response should be 406",406, response.getStatus());
		verify(smartMeterService).getCustomerDetail(1l);				
	}

}
