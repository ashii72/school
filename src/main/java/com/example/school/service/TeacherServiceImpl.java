package com.example.school.service;

import com.example.school.model.Teacher;
import com.example.school.repository.TeacherRepository;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {

    final TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Teacher findTeacherByName(String name) {
        return null;
    }

    @Override
    public Teacher findTeacherById(Integer id) {
        return teacherRepository.findById(id).get();
    }

    @Override
    public Teacher saveTeacher(String name, String course) {
        Teacher teacher = new Teacher();
        teacher.setName(name);
        teacher.setCourse(course);
        return teacherRepository.save(teacher);
    }
}
