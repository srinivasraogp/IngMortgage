package com.hcl.ingmortgages.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class StatementResDTO {
	private Long accountNo;
	private String comment;
	private Double amount;
	private  LocalDate date;
	private LocalTime time;

}
