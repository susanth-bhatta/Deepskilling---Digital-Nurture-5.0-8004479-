package com.cognizant.hibernate.model;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="salary")
    private int salary;

    public Employee(){}

    public Employee(String firstName,String lastName,int salary){

        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;

    }

    // Generate Getters and Setters

}