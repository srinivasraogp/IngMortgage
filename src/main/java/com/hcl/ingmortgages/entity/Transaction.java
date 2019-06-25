package com.hcl.ingmortgages.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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

	@GeneratedValue(strategy=GenerationType.AUTO)
	private int transactionId;
	private Long accountNo;
	private String comment;
	private Double amount;
	private  LocalDate date;
	private LocalTime time;

}