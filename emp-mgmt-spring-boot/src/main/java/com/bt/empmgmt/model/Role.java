package com.bt.empmgmt.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long roleId;

    private String roleName;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
}