package com.example.school.controller;

import com.example.school.exception.NotFoundException;
import com.example.school.model.Student;
import com.example.school.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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
        return studentService.findStudentById(id).orElseThrow(() -> new NotFoundException("Student id " + id + " not found!"));
    }

    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/delete/{id}")
    public Student deleteStudentById(@PathVariable("id") int id) {
        return studentService.deleteStudentById(id);
    }

    @GetMapping("/list")
    public List<Student> findAllStudents() {
        return studentService.findAllStudents();
    }

    @GetMapping("/sort/name/asc")
    public List<Student> findAllStudentsByOrderByNameAsc() {
        return studentService.findAllStudentsByOrderByNameAsc();
    }

    @GetMapping("/sort/name/desc")
    public List<Student> findAllStudentsByOrderByNameDesc() {
        return studentService.findAllStudentsByOrderByNameDesc();
    }

    @GetMapping("/sort/score/asc")
    public List<Student> findAllStudentsByOrderByScoreAsc() {
        return studentService.findAllStudentsByOrderByScoreAsc();
    }

    @GetMapping("/sort/score/desc")
    public List<Student> findAllStudentsByOrderByScoreDesc() {
        return studentService.findAllStudentsByOrderByScoreDesc();
    }
}
