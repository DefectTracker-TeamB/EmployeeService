package com.example.EmolyeeService.Dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDto {
    private String name;
    private String email;
    private String address;
    private String gender;
    private int designation_id;
    private String password;
}
