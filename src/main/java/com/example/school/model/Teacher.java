package com.example.school.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String course;

    public Teacher(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public Teacher() {

    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return id == teacher.id && name.equals(teacher.name) && course.equals(teacher.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, course);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
