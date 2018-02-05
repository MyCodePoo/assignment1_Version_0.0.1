package org.restful.spring.controller;


import java.util.List;

import org.restful.spring.bean.Employee;
import org.restful.spring.service.EmployeeServices;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	EmployeeServices empService = new EmployeeServices();

	@RequestMapping(value = "/employees", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Employee> getEmployeeList() {
		return empService.getAllEmployeeList();
	}

	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Employee getEmployeeByID(@PathVariable int id) {
		return empService.getEmployee(id);
	}

	@RequestMapping(value = "/employees", method = RequestMethod.POST, headers = "Accept=application/json")
	public Employee addEmployee(@RequestBody Employee employee) {
		return empService.addEmployee(employee);
	}

	@RequestMapping(value = "/employees", method = RequestMethod.PUT, headers = "Accept=application/json")
	public Employee updateEmployeeRecord(@RequestBody Employee employee) {
		return empService.updateEmployeeRecord(employee);

	}

	@RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteEmployee(@PathVariable("id") int id) {
		empService.deleteEmployee(id);

	}	
}
