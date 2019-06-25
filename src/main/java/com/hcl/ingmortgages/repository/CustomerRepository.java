package com.hcl.ingmortgages.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.ingmortgages.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	Customer findByCustomerId(int customerId);

}
