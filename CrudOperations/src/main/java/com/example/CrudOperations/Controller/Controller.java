package com.example.CrudOperations.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.CrudOperations.Model.Employee;
import com.example.CrudOperations.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class Controller {

	@Autowired 
	private EmployeeService employeeService ;
	
	@GetMapping("/getAllUsers")
	public List<Employee> getApllEmployees()
	{
		return employeeService.getAllEmployees();
		
	}
	
	
	@PostMapping("/createUser")
	public Employee createUser(@RequestBody Employee emp)
	{
		return employeeService.createEmployee(emp);
		
	}
	
	@PutMapping("/updateEmployee/{id}")
	public Employee updateEmployee(@PathVariable Long id,@RequestBody Employee emp)
	{
		return  employeeService.updateEmployee(id, emp);
	}
	
	@GetMapping("/getMaxSalary")
	public List<Employee> getMaxSalaryEmployee()
	{
		return employeeService.getEmployeeBySalary();
	}
}
