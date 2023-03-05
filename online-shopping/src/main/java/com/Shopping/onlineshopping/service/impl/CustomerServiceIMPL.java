package com.Shopping.onlineshopping.service.impl;

import com.Shopping.onlineshopping.Util.mappers.CustomerMapper;
import com.Shopping.onlineshopping.dto.CustomerDto;
import com.Shopping.onlineshopping.dto.ItemDTO;
import com.Shopping.onlineshopping.dto.paginate.PaginateResponseCustomerDTO;
import com.Shopping.onlineshopping.dto.request.RequestSaveCustomerDTO;
import com.Shopping.onlineshopping.dto.request.UpdateCustomerDTO;
import com.Shopping.onlineshopping.entity.Customer;
import com.Shopping.onlineshopping.exception.NotFoundException;
import com.Shopping.onlineshopping.repo.CustomerRepo;
import com.Shopping.onlineshopping.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CustomerServiceIMPL implements CustomerService {
    @Autowired
    private CustomerRepo customerRepo;


    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CustomerMapper customerMapper;


    @Override
    public RequestSaveCustomerDTO saveCustomer(RequestSaveCustomerDTO requestSaveCustomerDTO){
        Customer customer = modelMapper.map(requestSaveCustomerDTO,Customer.class);
        customer.isActiveState();
        if(!customerRepo.existsById(customer.getCustomerId())){
            customerRepo.save(customer);
            return requestSaveCustomerDTO ;
        }else {

            return null;
        }

    }

    @Override
    public CustomerDto getCustomer(int customerId){
     //   Optional<Customer> customer = customerRepo.findById(customerId);
     //   CustomerDto customerDto= modelMapper.map(customer.get(),CustomerDto.class);
        if(customerRepo.existsById(customerId)){
            Customer customer= customerRepo.getById(customerId);
            CustomerDto customerDto= new CustomerDto(
                    customer.getCustomerId(),
                    customer.getCustomerName(),
                    customer.getCustomerPassword(),
                    customer.getCustomerEmail(),
                    customer.isActiveState()
            );
            return customerDto;
            }else {
            throw new RuntimeException("No customer");
        }


    }

    @Override
    public String updateCustomer(int customerId){
        if(customerRepo.existsById(customerId)){

        }
        return "updated";
    }

    @Override
    public String update(UpdateCustomerDTO updateCustomerDTO) {
        if(customerRepo.existsById(updateCustomerDTO.getCustomerId())){
            Customer customer = customerRepo.getById(updateCustomerDTO.getCustomerId());

            customer.setCustomerEmail(updateCustomerDTO.getCustomerEmail());
            customer.setCustomerName(updateCustomerDTO.getCustomerName());
            customer.setCustomerPassword(updateCustomerDTO.getCustomerPassword());

            customerRepo.save(customer);
            return updateCustomerDTO.getCustomerName() +" updated";
        }else {
            throw  new RuntimeException("Not Found");

        }

    }

    @Override
    public List<CustomerDto> getAllCustomer() {
        List<Customer> getAllCustomer = customerRepo.findAll();

        List<CustomerDto> customerDtoList= modelMapper.map(getAllCustomer,new TypeToken<List<CustomerDto>>(){}.getType());
        return customerDtoList;
    }

    @Override
    public String deleteCustomer(int customerId) {
        if(customerRepo.existsById(customerId)){
            customerRepo.deleteById(customerId);
            return  customerId+ " delete successfully";
        }else {
            throw new   RuntimeException ("No customer Found ");
        }

    }

    @Override
    public List<CustomerDto> getAllCustomerUseActiveState(boolean activeState) {
        List<Customer> getAllCustomerUseActiveState = customerRepo.findAllByActiveStateEquals(activeState);

        List<CustomerDto> customerDtoList = new ArrayList<>();

        for (Customer customer:getAllCustomerUseActiveState){
            CustomerDto customerDto = new CustomerDto(
                    customer.getCustomerId(),
                    customer.getCustomerName(),
                    customer.getCustomerPassword(),
                    customer.getCustomerEmail(),
                    customer.isActiveState()
            );
            customerDtoList.add(customerDto);
        }
        return customerDtoList;
    }

    @Override
    public CustomerDto login(String email, String password) {
        Customer customer= customerRepo.findByCustomerEmailAndCustomerPassword(email,password);
        if(customer.equals(customer)){
            CustomerDto customerDto= modelMapper.map(customer,CustomerDto.class);
            return customerDto;
        }else {
            throw new NotFoundException( "Not Found");
        }

    }

    @Override
    public PaginateResponseCustomerDTO getAllCustomerByPaginate(int page, int size) {
        Page<Customer> customer = customerRepo.findAll(PageRequest.of(page ,size));

        PaginateResponseCustomerDTO paginateResponseCustomerDTO=new  PaginateResponseCustomerDTO(
                customerMapper.pageToDto(customer),
                customerRepo.count()

        );
        return paginateResponseCustomerDTO;
    }


}
