package com.example.hibernate_one_to_many2.repository;

import com.example.hibernate_one_to_many2.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;



public interface DepartmentRepository extends JpaRepository<Department,Long> {
    Department findById(long id);
}
