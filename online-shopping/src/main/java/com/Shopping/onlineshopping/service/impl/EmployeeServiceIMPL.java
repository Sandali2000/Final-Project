package com.Shopping.onlineshopping.service.impl;

import com.Shopping.onlineshopping.Util.mappers.EmployeeMapper;
import com.Shopping.onlineshopping.dto.EmployeeDto;
import com.Shopping.onlineshopping.dto.ItemDTO;
import com.Shopping.onlineshopping.dto.request.SaveEmployeeDTO;
import com.Shopping.onlineshopping.dto.request.UpdateEmployeeDTO;
import com.Shopping.onlineshopping.entity.Employee;
import com.Shopping.onlineshopping.repo.EmployeeRepo;
import com.Shopping.onlineshopping.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceIMPL implements EmployeeService {

    @Autowired
    public EmployeeRepo employeeRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public String saveEmployee(SaveEmployeeDTO saveEmployeeDTO) {
        Employee employee = modelMapper.map(saveEmployeeDTO, Employee.class);
        employee.isActiveState();
        if (!employeeRepo.existsById(employee.getEmployeeId())) {
            employeeRepo.save(employee);
            return "saved";
        } else {
            throw new RuntimeException("Not Saved");
        }

    }

    @Override
    public UpdateEmployeeDTO updateEmployee(String name) {
        Employee employee = employeeRepo.findAllByEmployeeNameEquals(name);
        UpdateEmployeeDTO updateEmployeeDTO = modelMapper.map(employee, UpdateEmployeeDTO.class);
        return updateEmployeeDTO;

    }

    @Override
    public List<EmployeeDto> gelAllEmployee() {
        List<Employee> employees = employeeRepo.findAll();
        List<EmployeeDto> dtos = employeeMapper.entityListToDtoList(employees);
        return dtos;


    }

    @Override
    public List<EmployeeDto> gelAllEmployee1ecking() {
        List<Employee> getemployees = employeeRepo.findAll();
       // List<EmployeeDto> employeeDtoList = new ArrayList<>();
        List<EmployeeDto> employeeDtos = modelMapper.map(gelAllEmployee(),new TypeToken<List<EmployeeDto>>(){}.getType());
        return employeeDtos;
    }


}
