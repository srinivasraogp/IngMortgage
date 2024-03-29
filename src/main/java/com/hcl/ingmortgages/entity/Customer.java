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
public class Customer {
	
	@Id
	private int customerId;
	private String firstName;
	private String surName;
	private String city;
	private String email;
	private String contactNo;
	private String password;
}