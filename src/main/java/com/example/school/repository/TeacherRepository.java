package com.example.school.repository;

import com.example.school.model.Student;
import com.example.school.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Integer> {

//    @Query("SELECT f FROM Teacher f WHERE LOWER(f.name) = LOWER(:name)")
//    Teacher retrieveByName(@Param("name") String name);

    Teacher findByName(String name);
}
