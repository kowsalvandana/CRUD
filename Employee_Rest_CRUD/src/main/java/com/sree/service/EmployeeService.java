package com.sree.service;

import java.util.List;

import com.sree.model.Employee;

public interface EmployeeService {

	Integer saveEmployee(Employee e);
	
	List<Employee> getAllEmployees();
	
	Employee getOneEmployee(Integer id);
	
	void deleteEmployee(Integer id);
	
	

}
