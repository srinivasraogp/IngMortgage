
package com.hcl.ingmortgages.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.ingmortgages.entity.TransactionAccount;

@Repository
public interface TransactionAccountRepository extends JpaRepository<TransactionAccount, Integer> {

	@Query(value="select * from TransactionAccount where customer_id=?1",nativeQuery=true)
	TransactionAccount findByCustomerId(int customerId);
	
	TransactionAccount fingByCustomerId(int customerId);


}

