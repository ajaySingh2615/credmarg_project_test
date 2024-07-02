package com.example.employeevendormanagement.repository;

import com.example.employeevendormanagement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
