package com.example.EmolyeeService.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Data
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

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

	@NotBlank
	private String designation;

}
