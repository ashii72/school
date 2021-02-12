package com.example.school.service;

import com.example.school.model.Teacher;

public interface TeacherService {

     Teacher findTeacherByName(String name);
     Teacher findTeacherById(Integer id);
     Teacher saveTeacher(String name,String course);
}
