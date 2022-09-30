package com.example.hibernate_one_to_many2.repository;

import com.example.hibernate_one_to_many2.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    Employee findById(long id);

}
