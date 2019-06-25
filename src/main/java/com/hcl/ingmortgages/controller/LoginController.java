package com.hcl.ingmortgages.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ingmortgages.dto.LoginReqDTO;
import com.hcl.ingmortgages.dto.LoginResDTO;
import com.hcl.ingmortgages.service.LoginService;

@RestController
@CrossOrigin(allowedHeaders = { "*", "/" }, origins = { "*", "/" })
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@PostMapping("/")
	public ResponseEntity<LoginResDTO> login(@RequestBody LoginReqDTO loginReqDto) {
		LoginResDTO loginResDto = loginService.login(loginReqDto.getCustomerId(), loginReqDto.getPassword());
		return new ResponseEntity<>(loginResDto, HttpStatus.OK);
	}
}
