package com.hcl.ingmortgages.service;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ingmortgages.dto.MortgageAccountRequestDTO;

import com.hcl.ingmortgages.entity.MortgageAccount;
import com.hcl.ingmortgages.repository.MortgageAccountRepository;

@Service
@Transactional

public class MortgageAccountServiceImpl implements MortgageAccountService {

	@Autowired
	MortgageAccountRepository mortgageAccountRepository;

	public MortgageAccount createMortgageAccount(MortgageAccountRequestDTO mortgageAccountRequestDto) {

		{

			MortgageAccount mortgageAccount = new MortgageAccount();

			BeanUtils.copyProperties(mortgageAccountRequestDto, mortgageAccount);
			return mortgageAccountRepository.save(mortgageAccount);
			
 
		}

	

	}

}
