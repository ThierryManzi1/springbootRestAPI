package com.letsstartcoding.springbootrestAPI.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.letsstartcoding.springbootrestAPI.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
