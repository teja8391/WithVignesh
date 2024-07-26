package com.example.CrudOperations.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CrudOperations.Model.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long>{

}
