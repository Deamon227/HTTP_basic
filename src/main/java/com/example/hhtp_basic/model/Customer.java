package com.example.hhtp_basic.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    private CustomerType roleId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerType getRoleId() {
        return roleId;
    }

    public void setRoleId(CustomerType roleId) {
        this.roleId = roleId;
    }

    public Customer() {
    }

    public Customer(Long id, String name, CustomerType roleId) {
        this.id = id;
        this.name = name;
        this.roleId = roleId;
    }
}
