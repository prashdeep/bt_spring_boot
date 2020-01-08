package com.bt.empmgmt.model;

import lombok.*;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

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
    @Column(name = "emp_dept")
    private String empDept;

    @Transient
    private String confirmPassword;

    @Range(min = 20000, max = 200000)
    private double salary;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private Set<Address> address = new HashSet<>();


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "employee_projects",
                joinColumns = @JoinColumn(name="empId"),
                inverseJoinColumns = @JoinColumn(name="project_id"))
    private Set<Project> projects = new HashSet<>();

    @Override
    public int compareTo(Employee employee) {
        return (int)(this.empId - employee.empId );
    }

    public void addAddress(Address address){
        this.address.add(address);
        address.setEmployee(this);
    }
}