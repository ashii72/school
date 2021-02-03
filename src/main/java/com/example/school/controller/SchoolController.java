package com.example.school.controller;


import com.example.school.model.Student;
import com.example.school.model.Teacher;
import com.example.school.service.SchoolService;
import com.example.school.service.SchoolServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/school")
public class SchoolController {

    SchoolService schoolService = new SchoolServiceImpl();

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

    /***********************************************************************************/

    @GetMapping("/teacher/sort/asc")
    public List<Teacher> getTeacherSortedListByNameAsc() {
        return schoolService.getTeacherSortedListByNameAsc();
    }

    @GetMapping("/teacher/sort/desc")
    public List<Teacher> getTeacherSortedListByNameDesc(){
        return schoolService.getTeacherSortedListByNameDesc();
    }

    @PostMapping("/teacher/add")
    public List<Teacher> addTeacherByTeacherObject(@RequestBody Teacher teacher){
        return schoolService.addTeacherByTeacherObject(teacher);
    }

    @PostMapping("/teacher/remove")
    public List<Teacher> removeTeacherByTeacherObject(@RequestBody Teacher teacher) {
        return schoolService.removeTeacherByTeacherObject(teacher);
    }

}
