package com.example.EmolyeeService.Dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EmployeeDto {
	@NotNull(message = "Employee name shouldn't be null")
	private String name;
	
	@Email(message = "Invalid email address")
	private String email;
	
	@Pattern(regexp = "^\\d{10}$", message = "Invalid mobile number")
	private String mobile;

	@NotBlank(message = "Fill the address")
	private String address;
	
	@NotNull(message = "Employee gender shouldn't be null")
	private String gender;
	private int designation_id;
	
	@NotNull(message = "Pasword cannot be null")
	private String password;
}
