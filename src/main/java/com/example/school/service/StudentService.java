package com.example.school.service;

import com.example.school.model.Student;

import java.util.Optional;

public interface StudentService {

    Optional<Student> findStudentByName(String name);

    Optional<Student> findStudentById(int id);

    Student saveStudent(Student student);
}
