package com.bt.empmgmt.dao;


import com.bt.empmgmt.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

//@Repository("hibernateDAO")
public class HibernateDAOImpl{

    /*

    @Override
    public Employee saveEmployee(Employee employee) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(employee);
        return employee;
    }

    @Override
    public Employee updateEmployee(long empId, Employee employee) {
        Session currentSession = sessionFactory.getCurrentSession();
        Employee returnedEmployee = currentSession.byId(Employee.class).load(empId);
        if(returnedEmployee != null){
            returnedEmployee.setEmpName(employee.getEmpName());
            returnedEmployee.setEmpDept(employee.getEmpDept());
            returnedEmployee.setSalary(employee.getSalary());
            currentSession.saveOrUpdate(returnedEmployee);
        }
        return employee;
    }

    @Override
    public List<Employee> listAll() {
        Session currentSession = sessionFactory.getCurrentSession();
        return currentSession.createQuery("from Employee").list();
    }

    @Override
    public Optional<Employee> findById(long id) {
        return Optional.of(sessionFactory.getCurrentSession().get(Employee.class, id));
    }

    @Override
    public void deleteEmployeeById(long id) {
        Session session = sessionFactory.getCurrentSession();
        Employee employee = session.byId(Employee.class).load(id);
        session.delete(employee);
    }*/
}