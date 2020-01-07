package com.bt.empmgmt.dao;

import com.bt.empmgmt.model.Employee;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public class H2EmployeeDAOImpl implements EmployeeDAO {

    private JdbcTemplate jdbcTemplate;

    public H2EmployeeDAOImpl (JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        this.jdbcTemplate.execute("insert into employee values ("+employee.getEmpId()+")");
        return employee;
    }

    @Override
    public List<Employee> listAll() {
        return null;
    }

    @Override
    public Optional<Employee> findById(long empId) {
        return Optional.empty();
    }

    @Override
    public void deleteEmployeeById(long empId) {

    }

    @Override
    public Employee updateEmployee(long empId, Employee employee) {
        return null;
    }
}