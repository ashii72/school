package com.example.school.controller;

import com.example.school.model.Student;
import com.example.school.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    final  StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/name")
    public Student getByName(@RequestParam("name") String name) {
        return studentService.findStudentByName(name).get();
    }

    @GetMapping("/id/{id}")
    public Student getById(@PathVariable("id") int id) {
        return studentService.findStudentById(id).get();
    }

    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }
}
