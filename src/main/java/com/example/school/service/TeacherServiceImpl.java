package com.example.school.service;

import com.example.school.model.Teacher;
import com.example.school.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService {

    final TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Optional<Teacher> findTeacherByName(String name) {
        return teacherRepository.findByName(name);
    }

    @Override
    public Optional<Teacher> findTeacherById(int id) {
        return teacherRepository.findById(id);
    }

    @Override
    public Teacher saveTeacher(String name, String course) {
        Teacher teacher = new Teacher();
        teacher.setName(name);
        teacher.setCourse(course);
        return teacherRepository.save(teacher);
    }

    @Override
    public Teacher deleteTeacherById(int id) {
        return teacherRepository.deleteById(id);
    }

    @Override
    public List<Teacher> findAllTeachers() {
        return teacherRepository.findAll();
    }
}
