package com.example.school.service;

import com.example.school.model.Course;

import java.util.List;

public interface CourseService {

    public Course saveCourse(Course course);

    List<Course> listCourse();
}
