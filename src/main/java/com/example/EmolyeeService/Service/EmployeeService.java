package com.example.EmolyeeService.Service;

import com.example.EmolyeeService.Dto.EmployeeDto;
import com.example.EmolyeeService.Dto.UserDto;
import com.example.EmolyeeService.Entity.Employee;

import java.util.List;

public interface EmployeeService {
    String SaveEmp(EmployeeDto employeeDto);
    Employee getEmpById(int id);
    String deleteEmpById(int id);
    String editEmpById(int id, EmployeeDto employeeDto);
    List<Employee> getAllEmployees();








}
