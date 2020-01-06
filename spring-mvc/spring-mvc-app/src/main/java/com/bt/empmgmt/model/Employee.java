package com.bt.empmgmt.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode(of = "empId")
@ToString
@NoArgsConstructor
public class Employee implements Serializable, Comparable<Employee> {

    private long empId;

    private String empName;

    private String empDept;

    private double salary;

    @Override
    public int compareTo(Employee employee) {
        return (int)(this.empId - employee.empId );
    }
}