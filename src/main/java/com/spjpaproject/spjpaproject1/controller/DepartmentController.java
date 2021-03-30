package com.spjpaproject.spjpaproject1.controller;

import com.spjpaproject.spjpaproject1.model.Department;
import com.spjpaproject.spjpaproject1.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

     @Autowired
     private DepartmentRepo departmentRepo;

     @PostMapping(value = "/saveDept")
     public String saveDept(@RequestBody Department department){
         departmentRepo.save(department);
         return "Dept saved";
     }
}
