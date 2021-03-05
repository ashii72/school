package com.example.school.repository;

import com.example.school.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    Optional<Student> findByName(String name);
    Student deleteById(int id);
    List<Student> findAllByOrderByNameAsc();
    List<Student> findAllByOrderByNameDesc();
    List<Student> findAllByOrderByScoreAsc();
    List<Student> findAllByOrderByScoreDesc();
}
