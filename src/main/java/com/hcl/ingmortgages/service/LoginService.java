package com.hcl.ingmortgages.service;

import com.hcl.ingmortgages.dto.LoginResDTO;

public interface LoginService {

	LoginResDTO login(int customerId, String password);

}
