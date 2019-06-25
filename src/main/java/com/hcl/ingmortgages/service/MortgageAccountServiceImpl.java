package com.hcl.ingmortgages.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ingmortgages.dto.MortgageAccountRequestDTO;
import com.hcl.ingmortgages.dto.MortgageAccountResponseDTO;
import com.hcl.ingmortgages.entity.MortgageAccount;
import com.hcl.ingmortgages.repository.MortgageAccountRepository;

@Service
public class MortgageAccountServiceImpl implements MortgageAccountService{

	@Autowired
	MortgageAccountRepository mortgageAccountRepository;
	
	
	public MortgageAccountResponseDTO create(MortgageAccountRequestDTO mortgageAccountRequestDTO) {
		
		MortgageAccount mortgageAccount=new MortgageAccount();
		//mortgageAccount.setContactNo(mortgageAccountRequestDTO2.get);
		
		
		return null;
	}

}
