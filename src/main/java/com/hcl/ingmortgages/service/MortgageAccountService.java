
package com.hcl.ingmortgages.service;

import com.hcl.ingmortgages.dto.MortgageAccountRequestDTO;
import com.hcl.ingmortgages.dto.MortgageAccountResponseDTO;

public interface MortgageAccountService {
	
	MortgageAccountResponseDTO createMortgageAccount(MortgageAccountRequestDTO mortgageAccountRequestDto);

}

