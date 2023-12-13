package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//for anything to access my db, needed spesifically when working with JPA
//this interface is responsible for data access, everything for Data Access Layer

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
