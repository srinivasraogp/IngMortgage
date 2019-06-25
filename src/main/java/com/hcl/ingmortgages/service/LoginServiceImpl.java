package com.hcl.ingmortgages.service;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ingmortgages.dto.LoginResDTO;
import com.hcl.ingmortgages.entity.Customer;
import com.hcl.ingmortgages.entity.MortgageAccount;
import com.hcl.ingmortgages.entity.TransactionAccount;
import com.hcl.ingmortgages.exception.DataNotFoundException;
import com.hcl.ingmortgages.repository.LoginRepository;
import com.hcl.ingmortgages.repository.MortgageAccountRepository;
import com.hcl.ingmortgages.repository.TransactionAccountRepository;

@Service
public class LoginServiceImpl implements LoginService {
	
	private static final Logger lOGGER = LoggerFactory.getLogger(LoginServiceImpl.class);
	
	@Autowired
	private LoginRepository loginRepository;
	@Autowired
	private MortgageAccountRepository mortgageAccountRepository;
	@Autowired
	private TransactionAccountRepository transactionAccountRepository;

	@Override
	public LoginResDTO login(int customerId, String password) {
		lOGGER.info("login Service Starts");
		LoginResDTO loginResDto=new LoginResDTO();
		
		Customer customer = loginRepository.findByCustomerIdAndPassword(customerId, password);
		lOGGER.info("login Service ends");
		if (customer != null) {
			BeanUtils.copyProperties(customer, loginResDto);
			} else {
					throw new DataNotFoundException("Customer not found for "+customerId);
			}
		MortgageAccount mortgageAccount= mortgageAccountRepository.findByCustomerId(customerId);
		loginResDto.setMortgageAccountNumber(mortgageAccount.getMortgageAccountNo());
		
		TransactionAccount transactionAccount=transactionAccountRepository.findByCustomerId(customerId);
		loginResDto.setTransactionAccountNumber(transactionAccount.getTransactionAccountNo());
		
		loginResDto.setMessage("Login Successfull");
		return loginResDto;
		
	}

}







