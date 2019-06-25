package com.hcl.ingmortgages.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private long transactionAccountNo;
	private double transactionBalance;
	private int customerId;
	

}
