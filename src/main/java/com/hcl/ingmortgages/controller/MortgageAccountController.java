package com.hcl.ingmortgages.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.hcl.ingmortgages.dto.MortgageAccountRequestDTO;
import com.hcl.ingmortgages.dto.MortgageAccountResponseDTO;

import com.hcl.ingmortgages.service.MortgageAccountService;

@RestController
@RequestMapping("/mortgages")
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
public class MortgageAccountController {
	private Logger logger = LoggerFactory.getLogger(MortgageAccountController.class);

	
	@Autowired

	MortgageAccountService mortgageAccountService;

	@PostMapping("/mortgage")

	public ResponseEntity<MortgageAccountResponseDTO> registerCustomer(
			@RequestBody MortgageAccountRequestDTO mortgageAccountRequestDto) {

		mortgageAccountService.createMortgageAccount(mortgageAccountRequestDto);
		MortgageAccountResponseDTO mortgageAccountResponseDto = new MortgageAccountResponseDTO();
		mortgageAccountResponseDto.setMessage("Congratulations,your mortgage has been granted");
		logger.info("MortgageAccountController is called");
		
		return new ResponseEntity<>(mortgageAccountResponseDto, HttpStatus.CREATED);

	}
}
