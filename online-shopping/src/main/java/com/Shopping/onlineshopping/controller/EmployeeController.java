package com.Shopping.onlineshopping.controller;

import com.Shopping.onlineshopping.dto.request.SaveEmployeeDTO;
import com.Shopping.onlineshopping.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/employee")
@CrossOrigin

public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping(path = "/save")
    public String saveEmployee(@RequestBody SaveEmployeeDTO saveEmployeeDTO){
        return employeeService.saveEmployee(saveEmployeeDTO);

    }

}