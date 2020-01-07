package com.bt.empmgmt.dao;

import com.bt.empmgmt.model.Employee;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;

@Component
@Primary
public class InMemoryEmployeeDAOImpl implements EmployeeDAO {

    private List<Employee> employeeList = Arrays.asList(
            Employee.builder()
                    .empId(12)
                    .empDept("HR")
                    .empName("Kashi")
                    .salary(20000)
                    .build());

    @Override
    public Employee saveEmployee(Employee employee) {
        employee.setEmpId(UUID.randomUUID().timestamp());
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