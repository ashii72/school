package com.example.school.controller;

import com.example.school.exception.NotFoundException;
import com.example.school.model.Student;
import com.example.school.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/name")
    public Optional<Student> getByName(@RequestParam("name") String name) {
        return studentService.findStudentByName(name);
    }

    @GetMapping("/id/{id}")
    public Student getById(@PathVariable("id") int id) {
        return studentService.findStudentById(id).orElseThrow(() -> new NotFoundException("Student not found!"));
    }

    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }
}
