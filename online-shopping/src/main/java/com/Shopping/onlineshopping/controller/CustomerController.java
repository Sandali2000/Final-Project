package com.Shopping.onlineshopping.controller;


import com.Shopping.onlineshopping.dto.CustomerDto;
import com.Shopping.onlineshopping.dto.paginate.PaginateResponseCustomerDTO;
import com.Shopping.onlineshopping.dto.request.RequestSaveCustomerDTO;
import com.Shopping.onlineshopping.dto.request.UpdateCustomerDTO;
import com.Shopping.onlineshopping.dto.response.ResponseSaveCustomerDTO;
import com.Shopping.onlineshopping.service.CustomerService;
import com.Shopping.onlineshopping.service.impl.CustomerServiceIMPL;
import org.aspectj.weaver.loadtime.Options;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Max;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "api/v1/customer")


public class CustomerController {
    @Autowired
    private CustomerService CustomerService;

    @PostMapping (path = "/save")
    public RequestSaveCustomerDTO saveCustomer( @RequestBody RequestSaveCustomerDTO requestSaveCustomerDTO){
      CustomerService.saveCustomer(requestSaveCustomerDTO);
        return requestSaveCustomerDTO;
    }

    @GetMapping(path = "/getCustomer-by-id", params = "id")
    public CustomerDto getCustomer(@RequestParam(value = "id") int customerId ){
        CustomerDto customerDto =CustomerService.getCustomer(customerId);
        return customerDto;

    }

    @GetMapping(path = "/get-all-customer" )
    public List<CustomerDto> getAllCustomer(){
        List<CustomerDto> allCustomers = CustomerService.getAllCustomer();
        return allCustomers;
    }

    @GetMapping(value = "/get-all-customer-by-paginate",
            params = {"size", "page"})
    public PaginateResponseCustomerDTO getAllCustomerByPaginate(@RequestParam (value = "page")   int page,
                                                                @RequestParam(value = "size")@Max(50) int size){
        PaginateResponseCustomerDTO paginateResponseCustomerDTO= CustomerService.getAllCustomerByPaginate(page, size);
        return paginateResponseCustomerDTO;
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

    @GetMapping(path = "/login",
               params = {"email", "password"})
    public CustomerDto login(@RequestParam (value = "email") String email,
                             @RequestParam (value = "password")String password){
       CustomerDto customerDto= CustomerService.login(email,password);
        return customerDto;
    }




}
