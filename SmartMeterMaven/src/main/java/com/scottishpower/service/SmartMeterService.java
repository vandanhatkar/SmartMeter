package com.scottishpower.service;

import com.scottishpower.representation.CustomerRepresentation;

public interface SmartMeterService {

	CustomerRepresentation getCustomerDetail(long accountNumber);

}