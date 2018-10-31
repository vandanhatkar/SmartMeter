package com.scottishpower.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ACCOUNT_NUMBER", nullable = false)
	Long accountNumber;
	
	@Column(name = "GAS_ID", nullable = false)
	String gasId;
	
	@Column(name = "ELEC_ID", nullable = false)
	String elecId;
	
	@Column(name = "ELEC_SMART_READ", nullable = false)
	String elecSmartRead;
	
	@Column(name = "GAS_SMART_READ", nullable = false)
	String gasSmartRead;
	

	public Customer() { }

	public Customer(Long accountNumber, String gasId, String elecId, String elecSmartRead, String gasSmartRead) {
		this.accountNumber = accountNumber;
		this.gasId = gasId;
		this.elecId = elecId;
		this.elecSmartRead = elecSmartRead;
		this.gasSmartRead = gasSmartRead;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getGasId() {
		return gasId;
	}

	public void setGasId(String gasId) {
		this.gasId = gasId;
	}

	public String getElecId() {
		return elecId;
	}

	public void setElecId(String elecId) {
		this.elecId = elecId;
	}

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
