package com.hcl.ingmortgages.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name="mortgageaccount")
public class MortgageAccount  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int customerId;
	private String operationType;
	private long propertyCost;
	private double deposit;
	private String employmentStatus;
	private String occupation;
	private String contractType;
	private  String jobStartedDate;
	private String firstName;
	private String middleName;
	private String surName;
	private String dob;
	private String email;
	private String contactNo;
	private long mortgageAccountNo;
	private double mortgageBalance;
	private String comment;

}