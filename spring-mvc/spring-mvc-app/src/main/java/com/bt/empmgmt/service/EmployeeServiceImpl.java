package com.bt.empmgmt.service;

import com.bt.empmgmt.dao.EmployeeDAO;
import com.bt.empmgmt.model.Employee;
import com.bt.empmgmt.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeDAO;



    public EmployeeServiceImpl(EmployeeRepository employeeDAO){
        this.employeeDAO = employeeDAO;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return this.employeeDAO.save(employee);
    }

    @Override
    public List<Employee> listAll() {
        return this.employeeDAO.listAll();
    }

    @Override
    public Employee findById(long empId) {
        return this.employeeDAO.findById(empId).orElseThrow(()-> new IllegalArgumentException("Employee Not Found"));
    }

    @Override
    public void deleteEmployeeById(long empId) {
        this.employeeDAO.deleteEmployeeById(empId);
    }

    @Override
    public Employee updateEmployee(long empId, Employee employee) {
        return this.employeeDAO.updateEmployee(empId, employee);
    }
}