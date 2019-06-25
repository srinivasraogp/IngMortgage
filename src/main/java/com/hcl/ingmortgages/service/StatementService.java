package com.hcl.ingmortgages.service;

import java.util.List;

import com.hcl.ingmortgages.dto.StatementResDTO;

public interface StatementService {

	List<StatementResDTO> getTransactions(Long accountId);

}
