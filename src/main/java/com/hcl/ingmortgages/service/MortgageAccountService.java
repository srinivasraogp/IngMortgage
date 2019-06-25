package com.hcl.ingmortgages.service;

import com.hcl.ingmortgages.dto.MortgageAccountRequestDTO;
import com.hcl.ingmortgages.entity.MortgageAccount;

public interface MortgageAccountService {
	
	MortgageAccount createMortgageAccount(MortgageAccountRequestDTO mortgageAccountRequestDto);

}
