package com.Aadarsh45.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Aadarsh45.Entity.Employee;
import com.Aadarsh45.Service.EmployeeService;
@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public String showAllEmployees(Model model) {
		model.addAttribute("listEmployees", employeeService.getAllEmployee());
		return"index";
	}
	@GetMapping("/addEmployee")
	public String showNewEmpoyeeForm(Model model) {
		Employee employee=new Employee();
		model.addAttribute("employee", employee);
		return"add_employee";
	}
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		employeeService.saveEmployee(employee);
		return"redirect:/";
	}
	@GetMapping("/updateEmployee/{id}")
	public String updateEmployee(@PathVariable int id, Model model) {
		model.addAttribute("employee", employeeService.updateEmployee(id));
		return"update_employee";
	}
	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		employeeService.deleteEmployee(id);
		return"redirect:/";
	}

}
