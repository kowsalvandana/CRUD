package com.sree.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sree.model.Employee;
import com.sree.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepo repo;

	@Override
	public Integer saveEmployee(Employee e) {
		
		Integer id=repo.save(e).getId();
		
		return id;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list=repo.findAll();
		return list;
	}

	@Override
	public Employee getOneEmployee(Integer id) {
		Optional<Employee> opt=repo.findById(id);
		
		Employee emp = opt.orElseThrow(
				()-> new EmployeeNotFoundException("Employee Not Exist")
				);
		
		
		return emp;
	}

	@Override
	public void deleteEmployee(Integer id) {
		Employee emp=getOneEmployee(id);
		repo.delete(emp);
	}

}
