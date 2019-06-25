package com.hcl.ingmortgages.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MortgageAccount implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long customerId;
	private String operationType;
	private long propertyCost;
	private double deposit;
	private String employmentStatus;
	private String occupation;
	private String contactType;
	private LocalDate jobStartedDate;
	private String firstName;
	private String middleName;
	private String surName;
	private LocalDate dob;
	private String email;
	private String contactNo;

}