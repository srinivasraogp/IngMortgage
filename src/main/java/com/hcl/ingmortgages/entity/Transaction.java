package com.hcl.ingmortgages.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = "Transactions")
@NoArgsConstructor
@Setter
@Getter
public class Transaction {
	
	@Id
	private int transactionId;
	private Long accountNo;
	private String comment;
	private Double amount;
	private  LocalDate date;
	private LocalDateTime time;


}
