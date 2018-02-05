package org.restful.spring.bean;


public class Employee{
	
	int id;
	String employeeName;	
	long EmployeeSalary;
	
	public Employee() {
		super();
	}
	public Employee(int id, String employeeName,long EmployeeSalary) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.EmployeeSalary=EmployeeSalary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public long getEmployeeSalary() {
		return EmployeeSalary;
	}
	public void setEmployeeSalary(long employeeSalary) {
		EmployeeSalary = employeeSalary;
	}
	
	
}