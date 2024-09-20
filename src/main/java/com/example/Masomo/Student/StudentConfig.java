package com.example.Masomo.Student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.UUID;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
//            Student dennis = new Student(
//                    "Dennis","muasyathegreat4@gmail.com", LocalDate.of(2000, Month.MAY,27)
//            );
//            Student jibran = new Student(
//                  "Jibran","munawat@gmail.com", LocalDate.of(2006, Month.MAY,27)
//            );
//            Student Shem = new Student(
//                  "Shem","bonga@gmail.com", LocalDate.of(2005, Month.MAY,27)
//            );
//
//            repository.saveAll(List.of(dennis, jibran, Shem));
        };
    }

}
