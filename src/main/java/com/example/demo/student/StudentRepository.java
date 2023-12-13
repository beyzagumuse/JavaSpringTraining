package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//for anything to access my db, needed spesifically when working with JPA
//this interface is responsible for data access, everything for Data Access Layer

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    //SELECT * FROM student WHERE email = ?, the Optional under this equal to this SQL
    //@Query("SELECT s FROM Student s WHERE s.email=?1") this is jbql(?) version
    Optional<Student> findStudentByEmail(String email);
}
