package com.example.EmolyeeService.Dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EmployeeDto {

	private String name;

	private String email;
	private String mobile;
	private String address;
	private String gender;
	private int designation_id;
	private String password;
}
