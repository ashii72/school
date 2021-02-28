package com.example.school.repository;

import com.example.school.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Integer> {

//    @Query("SELECT f FROM Teacher f WHERE LOWER(f.name) = LOWER(:name)")
//    Teacher retrieveByName(@Param("name") String name);

    Optional<Teacher> findByName(String name);
}
