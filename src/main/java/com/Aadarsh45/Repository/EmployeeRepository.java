package com.Aadarsh45.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Aadarsh45.Entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
