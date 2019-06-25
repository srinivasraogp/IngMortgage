package com.hcl.ingmortgages.service;

import com.hcl.ingmortgages.dto.MortgageAccountRequestDTO;
import com.hcl.ingmortgages.dto.MortgageAccountResponseDTO;

public interface MortgageAccountService {
	public MortgageAccountResponseDTO create(MortgageAccountRequestDTO mortgageAccountRequestDTO);

}
