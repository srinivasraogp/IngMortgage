package com.hcl.ingmortgages.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.google.common.net.MediaType;
import com.hcl.ingmortgages.dto.MortgageAccountRequestDTO;
import com.hcl.ingmortgages.dto.MortgageAccountResponseDTO;
import com.hcl.ingmortgages.service.MortgageAccountServiceImpl;

@RunWith(SpringRunner.class)
@WebMvcTest(value=MortgageAccountController.class)
public class MortgageAccountControllerTest {
	

	@Autowired 
	MockMvc mockMvc;
	
	@MockBean
	MortgageAccountServiceImpl mortgageAccountServiceImpl;
	
	@Test
	public void registerCustomerTest() throws Exception{
		
		MortgageAccountRequestDTO mortgageAccountRequestDTO=new MortgageAccountRequestDTO();
		MortgageAccountResponseDTO mortgageAccountResponseDTO=new MortgageAccountResponseDTO();
		
		Mockito.when(mortgageAccountServiceImpl.createMortgageAccount(mortgageAccountRequestDTO)).thenReturn(mortgageAccountResponseDTO);
		Mockito.when(mortgageAccountServiceImpl.createMortgageAccount(mortgageAccountRequestDTO)).thenReturn(mortgageAccountResponseDTO);
	/*	mockMvc.perform(
				MockMvcRequestBuilders.post("/mortgages/")
				.accept(MediaType.APPLICATION_JSON)
				.contentType(MediaType.APPLICATION_JSON)
				.content(mapToJson(userDto)))
				.andExpect(MockMvcResultMatchers.status().isCreated());
		
*/
		}
	
}
