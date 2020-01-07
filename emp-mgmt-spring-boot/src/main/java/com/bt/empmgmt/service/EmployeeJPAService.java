package com.bt.empmgmt.service;

import com.bt.empmgmt.model.Employee;
import com.bt.empmgmt.repository.EmployeeRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class EmployeeJPAService  implements  EmployeeService{

    private EmployeeRepository employeeRepository;

    public EmployeeJPAService( EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    @Override
    public List<Employee> listAll() {
        return this.employeeRepository.findAll();
    }

    @Override
    public Employee findById(long empId) {
        return this.employeeRepository.findById(empId).orElseThrow(() -> new IllegalArgumentException("Employee Not Found"));
    }

    @Override
    public void deleteEmployeeById(long empId) {
        this.employeeRepository.deleteById(empId);
    }

    @Override
    public Employee updateEmployee(long empId, Employee employee) {
        Optional<Employee> employeeOptional = this.employeeRepository.findById(empId);
        employeeOptional.ifPresent(emp -> this.employeeRepository.save(emp));
        return employee;
    }
}