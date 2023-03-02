package com.Shopping.onlineshopping.repo;

import com.Shopping.onlineshopping.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@EnableJpaRepositories
@Repository
@Transactional
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

    Employee findAllByEmployeeNameEquals(String name);
}
