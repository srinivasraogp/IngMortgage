package com.hcl.ingmortgages.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hcl.ingmortgages.dto.LoginResDTO;
import com.hcl.ingmortgages.service.LoginService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = LoginController.class)
public class LoginControllerTest {

	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private LoginService loginService;

	@Test
	public void login() throws Exception {
		LoginResDTO loginResDto = new LoginResDTO();
		
		 loginResDto.setMessage("message");
		  loginResDto.setMortgageAccountNumber(123456L);
		  loginResDto.setTransactionAccountNumber(2355654L);
		 
		
		  mockMvc.perform(post("/ingmortgage/login").contentType(MediaType.APPLICATION_JSON)
		  .content(asJsonString(loginResDto))).andExpect(status().isNotFound());
		 

		/* Mockito.when(loginService.login(123, "good").thenReturn(loginResDto); */

	/*	String URI = "/ingmortgage/login";
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(URI).accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		String outputInJson = result.getResponse().getContentAsString();
		String inputInJson = this.mapToJson(loginResDto);
		Assert.assertEquals(outputInJson, inputInJson);*/
	}

	private byte[] asJsonString(LoginResDTO loginResDto) {
		// TODO Auto-generatedmethod stub
		return null;
	}

	private String mapToJson(Object object) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(object);
	}
}