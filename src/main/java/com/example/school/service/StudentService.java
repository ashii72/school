package com.example.school.service;

import com.example.school.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    Optional<Student> findStudentByName(String name);
    Optional<Student> findStudentById(int id);
    Student saveStudent(Student student);
    Student deleteStudentById(int id);
    List<Student> findAllStudents();
    List<Student> findAllStudentsByOrderByNameAsc();
    List<Student> findAllStudentsByOrderByNameDesc();
    List<Student> findAllStudentsByOrderByScoreAsc();
    List<Student> findAllStudentsByOrderByScoreDesc();

    List<Student> findAllStudentsSortByScoreDescAndNameAsc();
    List<Student> findAllStudentsPageByPageAndSortByScoreDesc(int page,int size);
}
