package org.restful.spring.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.restful.spring.bean.Employee;

public class EmployeeServices {

	static HashMap<Integer, Employee> employeeIDMap = getEmployeeIDMap();

	public EmployeeServices() {
		super();

		if (employeeIDMap == null) {
			employeeIDMap = new HashMap<Integer, Employee>();

			Employee empPoonam = new Employee(1, "Poonam", 100000);
			Employee empPooja = new Employee(4, "Pooja", 200000);
			Employee empSuraj = new Employee(3, "Suraj", 80000);
			Employee empMona = new Employee(2, "Mona", 70000);

			employeeIDMap.put(1, empPoonam);
			employeeIDMap.put(4, empPooja);
			employeeIDMap.put(3, empSuraj);
			employeeIDMap.put(2, empMona);
		}
	}

	public List<Employee> getAllEmployeeList() {
		return new ArrayList<Employee>(employeeIDMap.values());
		// return employees;
	}

	public Employee getEmployee(int id) {
		return employeeIDMap.get(id);
	}

	public Employee addEmployee(Employee employee) {
		employee.setId(getMaxId() + 1);
		employeeIDMap.put(employee.getId(), employee);
		return employee;
	}

	public Employee updateEmployeeRecord(Employee employee) {
		if (employee.getId() <= 0)
			return null;
		employeeIDMap.put(employee.getId(), employee);
		return employee;

	}

	public void deleteEmployee(int id) {
		employeeIDMap.remove(id);
	}

	public static HashMap<Integer, Employee> getEmployeeIDMap() {
		return employeeIDMap;
	}

	public static int getMaxId() {
		int max = 0;
		for (int id : employeeIDMap.keySet()) {
			if (max <= id)
				max = id;
		}
		return max;
	}
}
