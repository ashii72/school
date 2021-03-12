package com.example.school.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private int unit;

    @ManyToMany(targetEntity = Student.class, mappedBy = "courses", cascade = CascadeType.ALL)
    private List<Student> students;

    public Course(int id, String title, int unit, List<Student> students) {
        this.id = id;
        this.title = title;
        this.unit = unit;
        this.students = students;
    }

    public Course() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }
}
