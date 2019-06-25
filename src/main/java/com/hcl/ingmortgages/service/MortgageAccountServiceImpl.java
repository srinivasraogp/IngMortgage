package com.hcl.ingmortgages.service;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ingmortgages.dto.MortgageAccountRequestDTO;
import com.hcl.ingmortgages.dto.MortgageAccountResponseDTO;
import com.hcl.ingmortgages.entity.Customer;
import com.hcl.ingmortgages.entity.MortgageAccount;
import com.hcl.ingmortgages.entity.Transaction;
import com.hcl.ingmortgages.entity.TransactionAccount;
import com.hcl.ingmortgages.repository.CustomerRepository;
import com.hcl.ingmortgages.repository.MortgageAccountRepository;
import com.hcl.ingmortgages.repository.TransactionAccountRepository;
import com.hcl.ingmortgages.repository.TransactionRepository;
import com.hcl.ingmortgages.util.RandomNumberGen;

@Service
@Transactional

public class MortgageAccountServiceImpl implements MortgageAccountService {

	@Autowired
	MortgageAccountRepository mortgageAccountRepository;
	@Autowired
	TransactionAccountRepository tansactionAccountRepository;
	@Autowired
	TransactionRepository  transactionRepository;
	@Autowired
	CustomerRepository customerRepository;

	@Transactional
		public MortgageAccountResponseDTO createMortgageAccount(MortgageAccountRequestDTO mortgageAccountRequestDto) {

			{
				
				long propertyCost = mortgageAccountRequestDto.getPropertyCost();
				double deposit = mortgageAccountRequestDto.getDeposit();
				double transactionBalance = propertyCost - deposit;
				double mortgageBalance = -(propertyCost - deposit);

         MortgageAccount mortgageAccount=new MortgageAccount();
         BeanUtils.copyProperties(mortgageAccountRequestDto, mortgageAccount);
				mortgageAccount.setMortgageBalance(mortgageBalance);
				mortgageAccount.setMortgageAccountNo(RandomNumberGen.getAccountNumber());
				
				mortgageAccountRepository.save(mortgageAccount);

				TransactionAccount transactionAccount = new TransactionAccount();
				transactionAccount.setTransactionBalance(transactionBalance);
				transactionAccount.setTransactionAccountNo(RandomNumberGen.getAccountNumber());
				transactionAccount.setCustomerId(mortgageAccountRequestDto.getCustomerId());
				
				tansactionAccountRepository.save(transactionAccount);

				Transaction transaction = new Transaction();
				LocalDate localDate = LocalDate.now();
				transaction.setDate(localDate);
				LocalTime localTime = LocalTime.now();
				transaction.setTime(localTime);
				transaction.setAmount(transactionBalance);
				transaction.setAccountNo(transactionAccount.getTransactionAccountNo());
				transaction.setComment(mortgageAccountRequestDto.getComment());
				transactionRepository.save(transaction);

				Transaction mortgageTransaction = new Transaction();
				mortgageTransaction.setDate(localDate);
				mortgageTransaction.setTime(localTime);
				mortgageTransaction.setAmount(mortgageBalance);
				mortgageTransaction.setAccountNo(mortgageAccount.getMortgageAccountNo());
				mortgageTransaction.setComment(mortgageAccountRequestDto.getComment());
				transactionRepository.save(mortgageTransaction);
				
				Customer customer=new Customer();
				customer.setCustomerId(mortgageAccountRequestDto.getCustomerId());
				customer.setEmail(mortgageAccountRequestDto.getEmail());
				customer.setFirstName(mortgageAccountRequestDto.getFirstName());
				customer.setSurName(mortgageAccountRequestDto.getSurName());
				customer.setContactNo(mortgageAccountRequestDto.getContactNo());
				customer.setPassword(RandomNumberGen.getPassWord("ab"));
				customerRepository.save(customer);
				
				MortgageAccountResponseDTO mortgageAccountResponseDTO=new MortgageAccountResponseDTO();
				mortgageAccountResponseDTO.setMessage("congradulations , your mortgage has been granted");
				mortgageAccountResponseDTO.setMortgageAccountNo(mortgageAccount.getMortgageAccountNo());
				mortgageAccountResponseDTO.setTransactionAccountNo(transactionAccount.getTransactionAccountNo());
				mortgageAccountResponseDTO.setPassword(customer.getPassword());
				
					return mortgageAccountResponseDTO;

			}


	

	}

}
