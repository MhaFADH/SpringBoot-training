package com.example.demo.Students;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(2L,"Amine",99, LocalDate.of(2008, Month.SEPTEMBER,20),"mohaddd@gmail.com"),
                new Student(1L,"Mohamed",15, LocalDate.of(2002, Month.SEPTEMBER,18),"moha@gmail.com"));
    }
}
