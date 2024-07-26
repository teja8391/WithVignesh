package com.example.CrudOperations.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name = "employee_vignesh")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private String name;
	
	private Float salary;
	
	private Long age;
	
	@Column( name = "DateOfJoining" , updatable = false, insertable = true)
	@Temporal(TemporalType.DATE)
	private Date joning;

	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Float getSalary() {
		return salary;
	}


	public void setSalary(Float salary) {
		this.salary = salary;
	}


	public Long getAge() {
		return age;
	}


	public void setAge(Long age) {
		this.age = age;
	}


	public Date getJoning() {
		return joning;
	}


	public void setJoning(Date joning) {
		this.joning = joning;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", joning=" + joning
				+ "]";
	}


	public Employee(Long id, String name, Float salary, Long age, Date joning) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.joning = joning;
	}
}
