package com.siva.janni.mysimpleapplication.controller;

import com.siva.janni.mysimpleapplication.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
public class HelloWorld {
 Set<Student> students = Set.of(new Student(10, "Siv", "B"),
         new Student(11, "Raj", "A"),
         new Student(12, "Gopal", "B"),
         new Student(10, "Siv", "B")
         );
    @GetMapping
    public String wish() {
        return "Hello World!!";
    }

    @GetMapping("/students")
    public Set<Student> getStudents() {
        return students;
    }

}
