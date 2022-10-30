package com.example.demo;

import com.example.demo.Students.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@GetMapping
	public List<Student> hello(){
		return List.of(new Student(1L,"Mohamed",15, LocalDate.of(2002, Month.SEPTEMBER,18),"moha@gmail.com"));
	}

}
