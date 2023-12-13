package com.example.demo.student;

//This Class will have all of the ressources for the API

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/student") //instead of localhost:8080 we now have localhost:8080/api/v1/student
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    //POST used when you want to add new ressources to your system, in here when add new student
    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        //Take RequestBody and map it to student up there

        studentService.addNewStudent(student);
    }

}
