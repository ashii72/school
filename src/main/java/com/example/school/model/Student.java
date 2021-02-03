package com.example.school.model;

import java.util.Objects;

public class Student {

    private int id;
    private String name;
    private int score;
    private String course;

    public Student(int id, String name, int score, String course) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", course='" + course + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && score == student.score && name.equals(student.name) && course.equals(student.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, score, course);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
