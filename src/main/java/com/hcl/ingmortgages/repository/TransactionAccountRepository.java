package com.hcl.ingmortgages.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.ingmortgages.entity.TransactionAccount;

public interface TransactionAccountRepository extends JpaRepository<TransactionAccount, Integer> {

	TransactionAccount fingByCustomerId(int customerId);

}
