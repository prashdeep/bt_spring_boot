package com.bt.empmgmt.repository;

import com.bt.empmgmt.model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long > {

    @Query("select emp_id, emp_name from employe where emp_id = :name")
    public Employee listByName(String name);
}