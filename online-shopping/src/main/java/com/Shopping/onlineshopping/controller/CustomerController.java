package com.Shopping.onlineshopping.controller;


import com.Shopping.onlineshopping.dto.CustomerDto;
import com.Shopping.onlineshopping.dto.request.RequestSaveCustomerDTO;
import com.Shopping.onlineshopping.dto.request.UpdateCustomerDTO;
import com.Shopping.onlineshopping.dto.response.ResponseSaveCustomerDTO;
import com.Shopping.onlineshopping.service.CustomerService;
import com.Shopping.onlineshopping.service.impl.CustomerServiceIMPL;
import org.aspectj.weaver.loadtime.Options;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "api/v1/customer")


public class CustomerController {
    @Autowired
    private CustomerService CustomerService;

    @PostMapping (path = "/save")
    public String saveCustomer( @RequestBody RequestSaveCustomerDTO requestSaveCustomerDTO){
     return CustomerService.saveCustomer(requestSaveCustomerDTO);

    }

    @GetMapping(path = "/getCustomer-by-id", params = "id")
    public CustomerDto getCustomer(@RequestParam(value = "id") int customerId ){
        CustomerDto customerDto =CustomerService.getCustomer(customerId);
        return customerDto;

    }

    @GetMapping(path = "/get-all-customer")
    public List<CustomerDto> getAllCustomer(){
        List<CustomerDto> allCustomers = CustomerService.getAllCustomer();
        return allCustomers;
    }

    @PutMapping(path = "/update", params = "id")
    public  String updateCustomer(@RequestParam (value = "id") int customerId){
        CustomerService.updateCustomer(customerId);
        return "";
    }

    @PutMapping(path = "/updateCustomer")
    public String update(@RequestBody UpdateCustomerDTO updateCustomerDTO){
        return   CustomerService.update(updateCustomerDTO);
    }

    @DeleteMapping(path = "deleteCustomer/{id}")
    public String deleteCustomer(@PathVariable (value = "id") int customerId){
        return  CustomerService.deleteCustomer(customerId);

    }

    @GetMapping(path = "/get-all-customer/{status}")
    public List<CustomerDto> getAllCustomersByUsingStatus(@RequestParam (value = "status") boolean activeState){
        List<CustomerDto> allCustomers = CustomerService.getAllCustomerUseActiveState(activeState);
        return allCustomers;
    }




}
