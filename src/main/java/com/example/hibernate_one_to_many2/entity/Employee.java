package com.example.hibernate_one_to_many2.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private  String name;
    private  String surname;
    private long salary;


    @ToString.Exclude()
    @ManyToOne
    private Department dep;


}
