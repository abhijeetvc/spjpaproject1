package com.spjpaproject.spjpaproject1.controller;

import com.spjpaproject.spjpaproject1.model.Employee;
import com.spjpaproject.spjpaproject1.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping("/save")
    public String saveEmployee(@RequestBody Employee employee){
        employeeRepo.save(employee);
        return "Employee saved";
    }
}
