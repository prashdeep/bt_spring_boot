package com.bt.empmgmt.controller;

import com.bt.empmgmt.model.Address;
import com.bt.empmgmt.model.Employee;
import com.bt.empmgmt.model.Project;
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
    public Employee saveEmployee(  @RequestBody Employee employee){
        System.out.println("++++++++++++++++++++++++++++");
        Address address  = new Address();
        address.setCity("Bangalore");
        address.setState("KA");
        employee.addAddress(address);

        Project project1 = new Project();
        project1.setDeptName("Java");
        project1.setLocation("Bangalore");
        project1.addEmployee(employee);

        Project project2 = new Project();
        project2.setDeptName("Dotnet");
        project2.setLocation("Chennai");
        project2.addEmployee(employee);

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