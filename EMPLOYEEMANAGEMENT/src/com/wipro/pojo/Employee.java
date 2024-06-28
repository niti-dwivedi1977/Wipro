package com.wipro.pojo;

import java.time.LocalDate;


//pojo , entity , bean
public class Employee {
	
	//Encapsulation
	private int id, salary , age;
	private String name, dept;
	private LocalDate doj;
	private LocalDate dor;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public LocalDate getDor() {
		return dor;
	}
	public void setDor(LocalDate dor) {
		this.dor = dor;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", age=" + age + ", name=" + name + ", dept=" + dept
				+ ", doj=" + doj + ", dor=" + dor + "]";
	}
	
	
	

}
