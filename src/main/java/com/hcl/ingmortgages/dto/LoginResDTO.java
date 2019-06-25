package com.hcl.ingmortgages.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LoginResDTO {
	private String message;
	private Long transactionAccountNumber;
	private Long mortgageAccountNumber;
}
