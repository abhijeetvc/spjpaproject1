package com.spjpaproject.spjpaproject1.repository;

import com.spjpaproject.spjpaproject1.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department,Integer> {
}
