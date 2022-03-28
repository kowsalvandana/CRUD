package com.sree.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sree.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

}
