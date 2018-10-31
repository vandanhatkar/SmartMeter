package com.scottishpower.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scottishpower.mapper.SmartMeterMapper;
import com.scottishpower.repository.SmartMeterRepository;
import com.scottishpower.representation.CustomerRepresentation;

@Service
public class SmartMeterServiceImpl implements SmartMeterService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SmartMeterServiceImpl.class);
	
	@Autowired
	private SmartMeterRepository smartMeterRepository;
	
	@Autowired
	private SmartMeterMapper responseMapper;

	public CustomerRepresentation getCustomerDetail(long accountNumber){
		LOGGER.info("Fetching details for {}",accountNumber);
		return responseMapper.mapCustomer(smartMeterRepository.findByAccountNumber(accountNumber));
	}
}


