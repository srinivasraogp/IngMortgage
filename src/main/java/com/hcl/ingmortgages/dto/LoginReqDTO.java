package com.hcl.ingmortgages.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

public class LoginReqDTO {

	private int customerId;
	private String password;
}
