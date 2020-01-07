package com.bt.empmgmt.model;

import lombok.*;
import org.hibernate.validator.constraints.Range;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode(of = "empId")
@ToString
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity
public class Employee implements Serializable, Comparable<Employee> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long empId;

    @NotBlank (message = "employee name cannot be blank")
    private String empName;

    @NotBlank(message = "Employee department cannot be blank")
    private String empDept;

    @Range(min = 20000, max = 200000)
    private double salary;

    @Override
    public int compareTo(Employee employee) {
        return (int)(this.empId - employee.empId );
    }
}