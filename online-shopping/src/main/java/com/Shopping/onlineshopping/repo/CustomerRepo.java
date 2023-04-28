package com.Shopping.onlineshopping.repo;


import com.Shopping.onlineshopping.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@EnableJpaRepositories
@Repository
@Transactional
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

    List<Customer> findAllByActiveStateEquals (boolean activeState);

    //Customer findByCustomerEmailAndCustomerPassword(String email, String password);

    Customer findByCustomerName(String customerName);

    Customer findByCustomerEmail(String customerEmail);

    Optional<Customer> findByCustomerEmailAndCustomerPassword(String customerEmail, String password);

    //Customer findByCustomerName(String customerName);
}
