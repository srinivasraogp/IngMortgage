package com.hcl.ingmortgages.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ingmortgages.dto.StatementResDTO;
import com.hcl.ingmortgages.entity.Transaction;
import com.hcl.ingmortgages.repository.MortgageAccountRepository;
import com.hcl.ingmortgages.repository.TransactionAccountRepository;
import com.hcl.ingmortgages.repository.TransactionRepository;

@Service
public class StatementServiceImpl implements StatementService {
	private Logger logger = LoggerFactory.getLogger(StatementServiceImpl.class);
	
	@Autowired 
	TransactionRepository transactionRepository;
	
	@Autowired 
	MortgageAccountRepository mortgageAccountRepository;
	
	@Autowired 
	TransactionAccountRepository transactionAccountRepository;

	@Override
	public List<StatementResDTO> getTransactions(Long accountId) {
		
		logger.info("statements service starts");
		List<Transaction> transactions = transactionRepository.findByAccountNo(accountId);
		logger.info("statements service ends");
		List<StatementResDTO> statementsDtos = new ArrayList<>(); 
		for(Transaction transaction : transactions) {
			StatementResDTO statementsDto = new StatementResDTO();
			statementsDto.setDate(transaction.getDate());
			statementsDto.setAmount(transaction.getAmount());
			statementsDto.setComment(transaction.getComment());
			statementsDto.setTime(transaction.getTime());
			statementsDtos.add(statementsDto);
		
	}
		return statementsDtos;

}
}