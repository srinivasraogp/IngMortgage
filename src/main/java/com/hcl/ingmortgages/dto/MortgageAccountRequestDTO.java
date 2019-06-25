package com.hcl.ingmortgages.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MortgageAccountRequestDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty
	private long customerId;
	@JsonProperty

	private String operationType;
	@JsonProperty

	private long propertyCost;
	@JsonProperty

	private double deposit;
	@JsonProperty

	private String employmentStatus;
	@JsonProperty

	private String occupation;
	@JsonProperty

	private String contactType;
	@JsonProperty

	private LocalDate jobStartedDate;
	@JsonProperty

	private String firstName;
	@JsonProperty

	private String middleName;
	@JsonProperty

	private String surName;
	@JsonProperty

	private LocalDate dob;
	@JsonProperty

	private String email;
	@JsonProperty

	private String contactNo;

}
