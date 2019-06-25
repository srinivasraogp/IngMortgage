package com.hcl.ingmortgages.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor

public class MortgageAccount implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
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

}
