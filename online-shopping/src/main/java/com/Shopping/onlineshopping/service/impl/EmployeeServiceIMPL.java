package com.Shopping.onlineshopping.service.impl;

import com.Shopping.onlineshopping.dto.request.SaveEmployeeDTO;
import com.Shopping.onlineshopping.entity.Employee;
import com.Shopping.onlineshopping.repo.EmployeeRepo;
import com.Shopping.onlineshopping.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceIMPL implements EmployeeService {

    @Autowired
    public EmployeeRepo employeeRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public String saveEmployee(SaveEmployeeDTO saveEmployeeDTO) {
        Employee employee = modelMapper.map(saveEmployeeDTO,Employee.class);
        employee.isActiveState();
        if(!employeeRepo.existsById(employee.getEmployeeId())){
            employeeRepo.save(employee);
            return "saved";
        }else {
            throw new RuntimeException("Not Saved");
        }

    }
}
