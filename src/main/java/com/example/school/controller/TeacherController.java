package com.example.school.controller;

import com.example.school.model.Teacher;
import com.example.school.service.TeacherService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

//    @GetMapping("/teacher/sort/asc")
//    public List<Teacher> getTeacherSortedListByNameAsc() {
//        return schoolService.getTeacherSortedListByNameAsc();
//    }
//
//    @GetMapping("/teacher/sort/desc")
//    public List<Teacher> getTeacherSortedListByNameDesc(){
//        return schoolService.getTeacherSortedListByNameDesc();
//    }

    @PostMapping("/add/{name}/{course}")
    public Teacher addTeacherByTeacherObject(@PathVariable("name") String name,@PathVariable("course") String course){
        return teacherService.saveTeacher(name,course);
    }

    @GetMapping("/{id}")
    public Optional<Teacher> findTeacherById(@PathVariable("id") Integer id) {
        return teacherService.findTeacherById(id);
    }
}
