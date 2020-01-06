package com.bt.empmgmt.controller;

import com.bt.empmgmt.model.Employee;
import com.bt.empmgmt.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/emp/")
public class EmpController {

    private EmployeeService employeeService;


    public EmpController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @PostMapping("/")
    public String saveEmployee(@RequestBody Employee employee){
       return "success";
    }

    @GetMapping("/")
    public String listAll(Model model){
        List<Employee> employeeList = this.employeeService.listAll();
        model.addAttribute("employees", employeeList);
        return "list";
    }

    @GetMapping("/{empId}")
    public String findById( @PathVariable("empId") long empId, Model model){
        Employee employee = this.employeeService.findById(empId);
        model.addAttribute("employee", employee);
        return "employee";
    }

    @DeleteMapping("/{empId}")
    public String deleteEmployeeById( @PathVariable  long empId, Model model){
        model.addAttribute("message", "Employee with "+empId+ " is deleted succesfully ..");
        return "success";
    }

    @PutMapping("/{empId}")
    public String updateEmployee(@PathVariable("empId") long empId, @RequestBody Employee employee){
        return null;
    }
}