package com.example.demo.Students;
// DB LAYER
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {


    // SELECT * FROM student WHERE email = string email
//    @Query("SELECT s FROM Student s WHERE s.email = stringEmail??")
    Optional<Student> findStudentByEmail(String email);


}
