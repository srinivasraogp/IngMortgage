package com.hcl.ingmortgages.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ingmortgages.dto.StatementResDTO;
import com.hcl.ingmortgages.service.StatementService;

@RestController
@RequestMapping("/statement")
@CrossOrigin(allowedHeaders= {"*", "*/"}, origins = {"*", "*/"})
public class StatementController {
	
	private Logger logger = LoggerFactory.getLogger(StatementController.class);

	@Autowired
	StatementService statementService;
	
	@GetMapping("/{accountId}")
	public ResponseEntity<List<StatementResDTO>> getStatements(@PathVariable Long accountId) {
		logger.info("getStatements starts here");
		List<StatementResDTO> statementsDtos = statementService.getTransactions(accountId);
		logger.info("getStatements ends here");
		return new ResponseEntity<>(statementsDtos, HttpStatus.OK);
	}

}
