package com.hcl.ingmortgages.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ingmortgages.dto.MortgageAccountRequestDTO;
import com.hcl.ingmortgages.dto.MortgageAccountResponseDTO;
import com.hcl.ingmortgages.service.MortgageAccountServiceImpl;

@RestController
@RequestMapping(value="/ingmortgage")
public class MortgageAccountController {
	@Autowired
	MortgageAccountServiceImpl mortgageAccountServiceImpl;
	
	@PostMapping(value="/mortgage")
	public ResponseEntity<MortgageAccountResponseDTO> create(@RequestBody MortgageAccountRequestDTO mortgageAccountRequestDTO) 
	{
		MortgageAccountResponseDTO mortgageAccountResponseDTO=mortgageAccountServiceImpl.create(mortgageAccountRequestDTO);
		return new ResponseEntity<>(mortgageAccountResponseDTO,HttpStatus.OK);
		
	}

}
