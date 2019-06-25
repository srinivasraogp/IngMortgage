package com.hcl.ingmortgages.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Getter @Setter @ToString @NoArgsConstructor
public class TransactionAccount {
	@Id
	private int id;
	private Long transactionAccountNo;
	private double transactionBalance;
	private int customerId;
	

}
