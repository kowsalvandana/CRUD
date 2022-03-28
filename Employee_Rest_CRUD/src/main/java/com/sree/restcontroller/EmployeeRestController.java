package com.sree.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sree.model.Employee;
import com.sree.service.EmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/employee")
public class EmployeeRestController {
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveEmployee(@RequestBody Employee employee){
		Integer id=service.saveEmployee(employee);
		return new ResponseEntity<String>("Employee'"+id+"'Saved",HttpStatus.OK);	
		
	}

	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		
		List<Employee> list = service.getAllEmployees();
		
		return new ResponseEntity<List<Employee>>(list,HttpStatus.OK);
	}
	@GetMapping("/one/{id}")
	public ResponseEntity<Employee> getOneEmployees(
			@PathVariable Integer id
			) 
	{
		
		Employee employee = service.getOneEmployee(id);
		
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
	}
	//4. delete
		@DeleteMapping("/remove/{id}")
		public ResponseEntity<String> deleteEmployee(
				@PathVariable Integer id
				) 
		{
			service.deleteEmployee(id);
			return new ResponseEntity<String>(
					"Employee '"+id+"' Deleted",
					HttpStatus.OK);
		}
		//5. update
		@PutMapping("/modify/{id}")
		public ResponseEntity<String> updateEmployee(
				@PathVariable Integer id,
				@RequestBody Employee employee
				)
		{
			Employee db = service.getOneEmployee(id);
			
			db.setName(employee.getName());
			db.setSal(employee.getSal());
			db.setDept(employee.getDept());
			
			service.saveEmployee(db);
			
			return new ResponseEntity<String>(
					"Employee '"+id+"' Updated",
					HttpStatus.OK);
		}
		
}
