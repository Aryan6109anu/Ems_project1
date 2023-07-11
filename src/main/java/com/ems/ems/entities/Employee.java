package com.ems.ems.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String designation;
    private int mobile;

}
