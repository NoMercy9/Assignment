package com.spring.database.springbootassignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.database.springbootassignment.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
