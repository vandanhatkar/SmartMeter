package com.scottishpower.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.scottishpower.entity.Customer;
import com.scottishpower.mapper.SmartMeterMapper;
import com.scottishpower.repository.SmartMeterRepository;
import com.scottishpower.representation.CustomerRepresentation;


public class SmartMeterServiceTest {
	
	@InjectMocks
	private SmartMeterServiceImpl smartMeterService;
	
	@Mock
	private SmartMeterRepository smartMeterRepository;
	
	@Mock
	private SmartMeterMapper smartMeterMapper;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
	
	@Test
	public void testShouldSucceedWhenCustomerDetailsReturnsValidSearch() {
		
		CustomerRepresentation customerRep =new CustomerRepresentation();
		customerRep.setElecSmartRead("2345");
		customerRep.setGasSmartRead("123");
    	
		when(smartMeterMapper.mapCustomer(any(Customer.class))).thenReturn(customerRep);

		CustomerRepresentation customerRepresentation = smartMeterService.getCustomerDetail(1L);
		
		assertEquals("Electric reading should match","2345", customerRepresentation.getElecSmartRead());
		assertEquals("Gas reading should match","123", customerRepresentation.getGasSmartRead());

		verify(smartMeterRepository).findByAccountNumber(1l);				
	}

}
