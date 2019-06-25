
package com.hcl.ingmortgages.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MortgageAccountRequestDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty
	private int customerId;
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

	private String contractType;
	@JsonProperty

	private String jobStartedDate;
	@JsonProperty

	private String firstName;
	@JsonProperty

	private String middleName;
	@JsonProperty

	private String surName;
	@JsonProperty

	private String dob;
	@JsonProperty

	private String email;
	@JsonProperty

	private String contactNo;

}

