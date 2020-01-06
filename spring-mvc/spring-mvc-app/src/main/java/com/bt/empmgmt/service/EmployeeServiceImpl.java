package com.bt.empmgmt.service;

import com.bt.empmgmt.dao.EmployeeDAO;
import com.bt.empmgmt.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO employeeDAO){
        this.employeeDAO = employeeDAO;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return null;
    }

    @Override
    public List<Employee> listAll() {
        return null;
    }

    @Override
    public Employee findById(long empId) {
        return this.employeeDAO.findById(empId).orElseThrow(()-> new IllegalArgumentException("Employee Not Found"));
    }

    @Override
    public void deleteEmployeeById(long empId) {

    }

    @Override
    public Employee updateEmployee(long empId, Employee employee) {
        return null;
    }
}