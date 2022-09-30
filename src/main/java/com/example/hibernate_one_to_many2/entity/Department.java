package com.example.hibernate_one_to_many2.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private long min_salary;
    private long max_salary;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dep")
    private List<Employee> employeeList;

    public void addEmpToDep(Employee employee) {
        if (employeeList==null) {
            employeeList = new ArrayList<>();
        }
        employeeList.add(employee);
        employee.setDep(this);
    }

}
