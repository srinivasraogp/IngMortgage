package com.hcl.ingmortgages.repository;

import com.hcl.ingmortgages.entity.TransactionAccount;

public interface TransactionAccountRepository {

	TransactionAccount findByCustomerId(long l);

}
