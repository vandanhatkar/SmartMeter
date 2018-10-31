package com.scottishpower.mapper;

import javax.inject.Named;

import com.scottishpower.entity.Customer;
import com.scottishpower.representation.CustomerRepresentation;

@Named
public class SmartMeterMapper {
	
	public CustomerRepresentation mapCustomer(Customer customer) {
		
		CustomerRepresentation customerRepresentation = new CustomerRepresentation();

		customerRepresentation.setElecSmartRead(customer.getElecSmartRead());
		customerRepresentation.setGasSmartRead(customer.getGasSmartRead());
		
		return customerRepresentation;
	}

}
