package com.example.school.service;

import com.example.school.model.Teacher;

import java.util.List;
import java.util.Optional;

public interface TeacherService {

     Optional<Teacher> findTeacherByName(String name);
     Optional<Teacher> findTeacherById(int id);
     Teacher saveTeacher(String name,String course);
     Teacher deleteTeacherById(int id);
     List<Teacher> findAllTeachers();
}
