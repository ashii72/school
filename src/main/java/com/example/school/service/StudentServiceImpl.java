package com.example.school.service;

import com.example.school.model.Student;
import com.example.school.repository.StudentRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Optional<Student> findStudentByName(String name) {
        return studentRepository.findByName(name);
    }

    @Override
    public Optional<Student> findStudentById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student deleteStudentById(int id) {
       return studentRepository.deleteById(id);
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> findAllStudentsByOrderByNameAsc() {
        return studentRepository.findAllByOrderByNameAsc();
    }

    @Override
    public List<Student> findAllStudentsByOrderByNameDesc() {
        return studentRepository.findAllByOrderByNameDesc();
    }

    @Override
    public List<Student> findAllStudentsByOrderByScoreAsc() {
        return studentRepository.findAllByOrderByScoreAsc();
    }

    @Override
    public List<Student> findAllStudentsByOrderByScoreDesc() {
        return studentRepository.findAllByOrderByScoreDesc();
    }

    @Override
    public List<Student> findAllStudentsSortByScoreDescAndNameAsc() {
        //Sort.by() jpa in repository
        return studentRepository.findAll(Sort.by("score").descending().and(Sort.by("name").ascending()));
    }

    @Override
    public List<Student> findAllStudentsPageByPageAndSortByScoreDesc(int page, int size) {
        // Pageable --- PageRequest in repository
        // page and size should be passed by user
        Pageable studentPageWithScoreSortDesc = PageRequest.of(page, size, Sort.by("score").descending());
        return studentRepository.findAll(studentPageWithScoreSortDesc).toList();
    }

}
