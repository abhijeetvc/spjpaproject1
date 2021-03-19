package com.spjpaproject.spjpaproject1.repository;

import com.spjpaproject.spjpaproject1.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
