package com.Aadarsh45.Service;

import java.util.List;

import com.Aadarsh45.Entity.Employee;

public interface EmployeeService {
	List<Employee>getAllEmployee();
	void saveEmployee(Employee employee);
	Employee updateEmployee(int id);
	void deleteEmployee(int id);

}
