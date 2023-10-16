package com.example.demo2.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student david =  new Student("David", "david@gmail.com", LocalDate.of(1994, Month.JULY, 2));
            Student pedro = new Student("Pedro", "pedro@gmail.com", LocalDate.of(1995, Month.AUGUST, 3));

            studentRepository.saveAll(List.of(david, pedro));
        };
    }
}
