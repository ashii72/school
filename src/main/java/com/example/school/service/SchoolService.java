package com.example.school.service;

import com.example.school.model.Student;
import com.example.school.model.Teacher;

import java.util.List;

public interface SchoolService {

    List<Student> getStudentSortedListByNameAsc();  //Ascending
    List<Student> getStudentSortedListByNameDesc();  //Descending
    List<Student> addStudentByStudentObject(Student student);     //Add
    List<Student> removeStudentByStudentObject(Student student);  //Remove

    List<Teacher> getTeacherSortedListByNameAsc();  //Ascending
    List<Teacher> getTeacherSortedListByNameDesc();  //Descending
    List<Teacher> addTeacherByTeacherObject(Teacher teacher);     //Add
    List<Teacher> removeTeacherByTeacherObject(Teacher teacher);  //Remove
}
