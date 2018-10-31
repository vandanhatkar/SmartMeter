package com.scottishpower.representation;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy.class)
public class CustomerRepresentation {
	
	private String elecSmartRead;
	private String gasSmartRead;
	
	public String getElecSmartRead() {
		return elecSmartRead;
	}
	public void setElecSmartRead(String elecSmartRead) {
		this.elecSmartRead = elecSmartRead;
	}
	public String getGasSmartRead() {
		return gasSmartRead;
	}
	public void setGasSmartRead(String gasSmartRead) {
		this.gasSmartRead = gasSmartRead;
	}

}
