package com.bt.empmgmt.dao;

import com.bt.empmgmt.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeDAO {

    Employee saveEmployee(Employee employee);

    List<Employee> listAll();

    Optional<Employee> findById(long empId);

    void deleteEmployeeById(long empId);

    Employee updateEmployee(long empId, Employee employee);
}