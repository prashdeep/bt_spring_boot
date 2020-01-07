package com.bt.empmgmt.repository;

import com.bt.empmgmt.model.Employee;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long > {

    List<Employee> findAll();

}