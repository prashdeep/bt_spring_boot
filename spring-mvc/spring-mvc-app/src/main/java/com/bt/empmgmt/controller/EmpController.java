package com.bt.empmgmt.controller;

import com.bt.empmgmt.model.Employee;
import com.bt.empmgmt.service.EmployeeService;
import org.springframework.stereotype.Controller;

@Controller
public class EmpController {

    private EmployeeService employeeService;

    public EmpController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    public String saveEmployee(Employee employee){
       return null;
    }

    public String listAll(){
        return null;
    }

    public String findById(long empId){
        return null;
    }

    public String deleteEmployeeById(long empId){
        return null;
    }

    public String updateEmployee(long empId, Employee employee){
        return null;
    }
}