package com.hcl.ingmortgages.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ingmortgages.dto.MortgageAccountRequestDTO;
import com.hcl.ingmortgages.dto.MortgageAccountResponseDTO;
import com.hcl.ingmortgages.entity.MortgageAccount;
import com.hcl.ingmortgages.entity.TransactionAccount;
import com.hcl.ingmortgages.repository.MortgageAccountRepository;
import com.hcl.ingmortgages.repository.TransactionAccountRepository;

@Service
public class MortgageAccountServiceImpl implements MortgageAccountService{

	@Autowired
	MortgageAccountRepository mortgageAccountRepository;
	@Autowired
	TransactionAccountRepository transactionAccountRepository;
	
	public MortgageAccountResponseDTO create(MortgageAccountRequestDTO mortgageAccountRequestDTO) {
		
		long propertyCost=mortgageAccountRequestDTO.getPropertyCost();
		double deposit=mortgageAccountRequestDTO.getDeposit();
		double transactionbalance=propertyCost-deposit;
		double mortgagebalance=-(propertyCost-deposit);
		MortgageAccount mortgageAccount=mortgageAccountRepository.findById(1L).orElse(null);
		//mortgageAccount.set
		TransactionAccount  transactionAccount=transactionAccountRepository.findByCustomerId(1L);
		transactionAccount.setTransactionBalance(transactionBalance);
		
		return null;
	}

}
