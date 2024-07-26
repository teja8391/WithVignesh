package com.example.CrudOperations.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CrudOperations.Model.Employee;
import com.example.CrudOperations.Repo.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees()
	{
		return employeeRepository.findAll();
	}
	

	public Employee createEmployee(Employee emp)
	{
		return employeeRepository.save(emp);
		
	}

	public Employee updateEmployee(Long id , Employee empl)
	{
		
		Employee employeeObj =   employeeRepository.findById(id)
				.orElseThrow(()->new RuntimeException("user not there")) ;
		
		employeeObj.setAge(empl.getAge());
		employeeObj.setName(empl.getName());
		
	
		return employeeRepository.save(employeeObj);
		
	}
	
	public List<Employee> getEmployeeBySalary()
	
	{
		List<Employee>  emp =  employeeRepository.findAll();
		
		List<Employee>  maxSalaryEmployee=emp.stream().filter(employee -> employee.getSalary() > 60000 ).collect(Collectors.toList());
		
		return maxSalaryEmployee;
		
	}
}
