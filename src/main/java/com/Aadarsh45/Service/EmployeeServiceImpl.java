package com.Aadarsh45.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Aadarsh45.Entity.Employee;
import com.Aadarsh45.Repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}
	@Override
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
		
		
	}
	@Override
	public Employee updateEmployee(int id) {
		Optional<Employee>optional=employeeRepository.findById(id);
		Employee employee=null;
		employee=optional.get();
		return employee;
	}
	@Override
	public void deleteEmployee(int id) {
		this.employeeRepository.deleteById(id);
		
	}

}
