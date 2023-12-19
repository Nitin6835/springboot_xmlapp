package com.csi.service;

import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl {

    @Autowired
    private EmployeeRepo employeeRepo;

    public void signUp(Employee employee)
    {
        employeeRepo.save(employee);
    }

    public List<Employee> findAll()
    {
       return employeeRepo.findAll();
    }
}
