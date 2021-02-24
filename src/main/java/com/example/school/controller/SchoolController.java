package com.example.school.controller;


import com.example.school.model.Student;
import com.example.school.model.Teacher;
import com.example.school.service.SchoolService;
import com.example.school.service.SchoolServiceImpl;
import com.example.school.service.TeacherService;
import com.example.school.service.UtilServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/school")
public class SchoolController {

    final
    SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @GetMapping("/student/sort/asc")
    public List<Student> getStudentSortedListByNameAsc() {
        return schoolService.getStudentSortedListByNameAsc();
    }

    @GetMapping("/student/sort/desc")
    public List<Student> getStudentSortedListByNameDesc() {
        return schoolService.getStudentSortedListByNameDesc();
    }

    @PostMapping("/student/add")
    public List<Student> addStudentByStudentObject(@RequestBody Student student) {
        return schoolService.addStudentByStudentObject(student);
    }

    @PostMapping("/student/remove")
    public List<Student> removeStudentByStudentObject(@RequestBody Student student) {
        return schoolService.removeStudentByStudentObject(student);
    }

}
