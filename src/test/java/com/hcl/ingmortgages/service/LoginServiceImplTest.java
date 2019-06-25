package com.hcl.ingmortgages.service;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hcl.ingmortgages.dto.LoginResDTO;
import com.hcl.ingmortgages.entity.Customer;
import com.hcl.ingmortgages.entity.MortgageAccount;
import com.hcl.ingmortgages.entity.TransactionAccount;
import com.hcl.ingmortgages.repository.LoginRepository;
import com.hcl.ingmortgages.repository.MortgageAccountRepository;
import com.hcl.ingmortgages.repository.TransactionAccountRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginServiceImplTest {
/*
	@InjectMocks
	private LoginServiceImpl loginServiceImp;

	@Mock
	private LoginRepository loginRepository;
	
	@Mock
	private MortgageAccountRepository mortgageAccountRepository;


	@Mock
	private TransactionAccountRepository transactionAccountRepository;

	@Test
	public void login() {
		Customer customer = new Customer();
		
		customer.setCustomerId(123);
		customer.setFirstName("Test");
		customer.setPassword("admin");
		
		MortgageAccount mortgageAccount=new MortgageAccount();
		mortgageAccount.setCustomerId(123);
		mortgageAccount.setContactNo("1234");
		
		TransactionAccount transactionAccount=new TransactionAccount();
		transactionAccount.setCustomerId(123);
		transactionAccount.setTransactionAccountNo(123445);
	
		when(loginRepository.findByCustomerIdAndPassword(123,"admin")).thenReturn(customer);
		
		
		when(mortgageAccountRepository.findByCustomerId(123)).thenReturn(mortgageAccount);
		when(mortgageAccountRepository.findByCustomerId(123)).thenReturn(null);
		
		LoginResDTO customer2 = loginServiceImp.login(123, "admin");
	
		Assert.assertEquals("Test", customer.getFirstName());
	}

}*/