package com.bt.empmgmt;

import com.bt.empmgmt.dao.EmployeeDAO;
import com.bt.empmgmt.model.Employee;
import com.bt.empmgmt.repository.EmployeeRepository;
import com.bt.empmgmt.service.EmployeeService;
import com.bt.empmgmt.service.EmployeeServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class TestEmployeeServiceImpl {

    @Mock
    private EmployeeDAO employeeDAO;

    @InjectMocks
    private EmployeeServiceImpl employeeService;


    @Test
    public void testSaveEmployee(){
        Employee employee = new Employee();
        employee.setEmpId(1);
        employee.setEmpName("Vishnu");
        employee.setSalary(34000);

        //setting the expectation
        when(employeeDAO.saveEmployee(employee)).thenReturn(employee);

        //invoking the function
        Employee returnedEmployee = employeeService.saveEmployee(employee);

        Assert.assertNotNull(returnedEmployee);


    }
}