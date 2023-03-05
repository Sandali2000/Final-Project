package com.Shopping.onlineshopping.service;

import com.Shopping.onlineshopping.dto.EmployeeDto;
import com.Shopping.onlineshopping.dto.request.SaveEmployeeDTO;
import com.Shopping.onlineshopping.dto.request.UpdateEmployeeDTO;

import java.util.List;

public interface EmployeeService {
    
    String saveEmployee(SaveEmployeeDTO saveEmployee);

    UpdateEmployeeDTO updateEmployee(String name);


    List<EmployeeDto> gelAllEmployee();

    List<EmployeeDto> gelAllEmployee1ecking();
}
