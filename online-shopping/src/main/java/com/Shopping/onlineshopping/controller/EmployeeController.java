package com.Shopping.onlineshopping.controller;

import com.Shopping.onlineshopping.Util.StandardResponse;
import com.Shopping.onlineshopping.dto.EmployeeDto;
import com.Shopping.onlineshopping.dto.request.SaveEmployeeDTO;
import com.Shopping.onlineshopping.dto.request.UpdateEmployeeDTO;
import com.Shopping.onlineshopping.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/employee")
@CrossOrigin

public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping(path = "/save")
    public ResponseEntity<StandardResponse> saveEmployee(@RequestBody SaveEmployeeDTO saveEmployeeDTO) {
        String message = employeeService.saveEmployee(saveEmployeeDTO);

        return new ResponseEntity<StandardResponse>(
                new StandardResponse(200, "success", message),
                HttpStatus.OK
        );


    }

    @GetMapping(path = "/getAllEmployee1")
    public ResponseEntity<StandardResponse> getAllCustomer() {
        List<EmployeeDto> allEmployee = employeeService.gelAllEmployee();
        return new ResponseEntity<StandardResponse>(
                new StandardResponse(201, "success", allEmployee),
                HttpStatus.OK);

    }

    @GetMapping(path = "/update", params = "name")
    public UpdateEmployeeDTO employeeUpdate(@RequestParam(value = "name") String name) {
        return employeeService.updateEmployee(name);
    }


}
