package com.example.school.controller;

import com.example.school.model.Course;
import com.example.school.service.CourseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping
    public Course saveCourse(Course course) {
        return courseService.saveCourse(course);
    }

    @GetMapping
    public List<Course> listCourse() {
        return courseService.listCourse();
    }

}
