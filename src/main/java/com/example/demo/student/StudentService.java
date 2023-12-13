package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service // to use this class with @Autowired I have to add @Component or more specific @Service so this can be found
public class StudentService {

    //Business Layer -> API Layer should talk to Service Layer to get some data
    //and service layer should talk to data access layer to take data and all the way back.
    // Service Layer mainly responsible for Business Logic.

    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Mariam",
                        "mariam.jamal@gmail.com",
                        LocalDate.of(2000, Month.JANUARY,5),
                        21
                ));
        //we take this method from Controller and changed there but this is still a static list
        //we want this informations to come from database but İt has time
    }
}
