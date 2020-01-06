package com.bt.empmgmt.dao;

import com.bt.empmgmt.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class InMemoryEmployeeDAOImpl implements EmployeeDAO {

    private List<Employee> employeeList = new ArrayList<>();

    @Override
    public Employee saveEmployee(Employee employee) {
        this.employeeList.add(employee);
        return employee;
    }

    @Override
    public List<Employee> listAll() {
        return this.employeeList;
    }

    public Optional<Employee> findById(long empId) {

        return this.employeeList.stream().filter(employee ->  employee.getEmpId() == empId ).findFirst();
    }

    @Override
    public void deleteEmployeeById(long empId) {
        this.employeeList.removeIf(employee ->  employee.getEmpId() == empId);
    }

    @Override
    public Employee updateEmployee(long empId, Employee employee) {
        Optional<Employee> optionalEmployee = this.employeeList.stream().filter(employee1 -> employee1.getEmpId() == empId).findFirst();
        optionalEmployee.ifPresent(emp -> {
            int index = this.employeeList.indexOf(emp);
            this.employeeList.add(index, employee);
        });
        optionalEmployee.orElseThrow(() -> new IllegalArgumentException("Invalid employeeId"));
        return employee;
    }
}