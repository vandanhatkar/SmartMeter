package com.scottishpower.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scottishpower.entity.Customer;

@Repository
public interface SmartMeterRepository extends JpaRepository<Customer, Long> {

	Customer findByAccountNumber(Long accountNumber);

}
