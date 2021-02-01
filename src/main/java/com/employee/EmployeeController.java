package com.employee;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	private final EmployeeRepository employeeRepository;

	public EmployeeController(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}
	
	@RequestMapping("/all")
	public List<Employee> all() {
		return employeeRepository.findAll();
	}
	
	@PostMapping("/add")
	public void postEmployee(@RequestBody Employee employee) {
		employeeRepository.save(employee);
	}	

}
