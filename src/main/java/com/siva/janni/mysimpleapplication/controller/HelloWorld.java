package com.siva.janni.mysimpleapplication.controller;

import com.siva.janni.mysimpleapplication.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class HelloWorld {
 List<Student> students = List.of(new Student(10, "Siv", "B"),
         new Student(11, "Raj", "A"),
         new Student(12, "Gopal", "B"),
         new Student(10, "Siv", "B")
         );
    @GetMapping
    public String wish() {
        return "Hello World!!";
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/{id}")
    public Optional<Student> getStudent(@PathVariable int id) {
        return students.stream().filter(s -> s.getId() == id).findFirst();
    }

}
