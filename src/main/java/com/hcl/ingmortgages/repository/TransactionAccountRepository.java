package com.hcl.ingmortgages.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.ingmortgages.entity.TransactionAccount;

@Repository
public interface TransactionAccountRepository extends JpaRepository<TransactionAccount, Integer> {

	TransactionAccount findByCustomerId(long customerId);

	

}
