package com.hcl.ingmortgages.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.ingmortgages.entity.MortgageAccount;

@Repository
public interface MortgageAccountRepository extends JpaRepository<MortgageAccount, Long> {

	@Query(value="select * from MortgageAccount where customer_id=?1",nativeQuery=true)
	MortgageAccount findByCustomerId(long customerId);

}
