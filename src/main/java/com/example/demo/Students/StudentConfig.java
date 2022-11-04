package com.example.demo.Students;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;
//DB CONFIG
import static java.time.Month.SEPTEMBER;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mohamed = new Student("Mohamed", LocalDate.of(2002, SEPTEMBER,18),"moha@gmail.com");
            Student amine = new Student("Amine", LocalDate.of(2008, SEPTEMBER,20),"mohaddd@gmail.com");

            repository.saveAll(
                    List.of(mohamed,amine)
            );

        };
    }
}

