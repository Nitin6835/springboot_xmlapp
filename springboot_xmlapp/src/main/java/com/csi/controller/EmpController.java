package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class EmpController {

    @Autowired
    EmployeeServiceImpl employeeService;

    @PostMapping("/savedata")
    public ResponseEntity<String> saveData(@RequestBody Employee employee)
    {
        employeeService.signUp(employee);
        return ResponseEntity.ok("SignUp Done Successfully!!");
    }

    @GetMapping("/findall")
    public ResponseEntity<List<Employee>> findAll()
    {
        return ResponseEntity.ok(employeeService.findAll());
    }

}
