package com.Shopping.onlineshopping.service;

import com.Shopping.onlineshopping.dto.CustomerDto;
import com.Shopping.onlineshopping.dto.paginate.PaginateResponseCustomerDTO;
import com.Shopping.onlineshopping.dto.request.RequestSaveCustomerDTO;
import com.Shopping.onlineshopping.dto.request.UpdateCustomerDTO;
import com.Shopping.onlineshopping.dto.response.ResponseSaveCustomerDTO;

import java.util.List;

public interface CustomerService {


  RequestSaveCustomerDTO saveCustomer(RequestSaveCustomerDTO requestSaveCustomerDTO);

  CustomerDto getCustomer(int customerId);

  String updateCustomer(int customerId);

  String  update(UpdateCustomerDTO updateCustomerDTO);



  List<CustomerDto> getAllCustomer();

  String deleteCustomer(int customerId);

  List<CustomerDto> getAllCustomerUseActiveState(boolean activeState);

  CustomerDto login(String email, String password);

  PaginateResponseCustomerDTO getAllCustomerByPaginate(int page, int size);
}
