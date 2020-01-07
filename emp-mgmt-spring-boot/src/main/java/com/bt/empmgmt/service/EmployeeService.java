package com.bt.empmgmt.service;

import com.bt.empmgmt.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    List<Employee> listAll();

    Employee findById(long empId);

    void deleteEmployeeById(long empId);

    Employee updateEmployee(long empId, Employee employee);
}