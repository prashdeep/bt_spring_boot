package com.bt.empmgmt.service;

import com.bt.empmgmt.config.ApplicationConfiguration;
import com.bt.empmgmt.dao.EmployeeDAO;
import com.bt.empmgmt.model.Employee;
import com.bt.empmgmt.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO employeeDAO;

    @Autowired
    private ApplicationConfiguration applicationConfiguration;

   public EmployeeServiceImpl(EmployeeDAO employeeDAO){
        this.employeeDAO = employeeDAO;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return this.employeeDAO.saveEmployee(employee);
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