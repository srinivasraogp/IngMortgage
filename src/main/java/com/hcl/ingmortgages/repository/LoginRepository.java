package com.hcl.ingmortgages.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.ingmortgages.entity.Customer;

@Repository
public interface LoginRepository extends JpaRepository<Customer, Integer> {

	

	Customer findByCustomerIdAndPassword(int customerId, String password);

}
