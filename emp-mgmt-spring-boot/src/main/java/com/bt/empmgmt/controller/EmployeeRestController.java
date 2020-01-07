package com.bt.empmgmt.controller;

import com.bt.empmgmt.model.Employee;
import com.bt.empmgmt.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

@RestController
        @RequestMapping("/api/v1/employees/")
public class EmployeeRestController {

    private EmployeeService employeeService;


    public EmployeeRestController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @PostMapping(value = "/",
            consumes = {APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE},
            produces = {APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE})

    @ResponseStatus(CREATED)

    public Employee saveEmployee( @Valid @RequestBody Employee employee){
        return this.employeeService.saveEmployee(employee);
    }

    @GetMapping
    public List<Employee> listAll(){
        List<Employee> employeeList = this.employeeService.listAll();
        return employeeList;
    }

    @GetMapping(value="/{empId}",
            produces = {APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE})

    public Employee findById(@PathVariable("empId") long empId){
        Employee employee = this.employeeService.findById(empId);
        return employee;
    }

    @DeleteMapping("/{empId}")
    public void deleteEmployeeById( @PathVariable  long empId){
        this.employeeService.deleteEmployeeById(empId);
    }

    @PutMapping(value = "/{empId}",
            consumes = {APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE},
            produces = {APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE})

    public Employee updateEmployee(@PathVariable("empId") long empId, @Valid @RequestBody Employee employee){
        return this.employeeService.updateEmployee(empId, employee);
    }
}