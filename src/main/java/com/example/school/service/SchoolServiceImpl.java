package com.example.school.service;

import com.example.school.model.Student;
import com.example.school.model.Teacher;

import java.util.*;

public class SchoolServiceImpl implements SchoolService {

    Student s1 = new Student(1,"Ashkan",20,"Linear Control System");
    Student s2 = new Student(2,"Babak",18,"Electrical Circuit");
    Student s3 = new Student(3,"Sara",15,"Discrete Structure");
    Student s4 = new Student(4,"Golnoosh",12,"Advanced Programming");

    Teacher t1 = new Teacher(1,"Navid Hashemi Taba","Computer Basics");
    Teacher t2 = new Teacher(2,"Touraj Banirostam","Data Transmission");
    Teacher t3 = new Teacher(3,"Pouria Kiani","Logical Circuit");
    Teacher t4 = new Teacher(4,"Ali Bahreini","Engineering Mathematical");

    List<Student> studentList = new ArrayList<>(List.of(s1,s2,s3,s4));
    List<Teacher> teacherList = new ArrayList<>(List.of(t1,t2,t3,t4));

    @Override
    public List<Student> getStudentSortedListByNameAsc() {

        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return studentList;
    }

    @Override
    public List<Student> getStudentSortedListByNameDesc() {

        studentList.sort(Comparator.comparing(Student::getName).reversed());
        return studentList;
    }

    @Override
    public List<Student> addStudentByStudentObject(Student student) {

        int index = -1;

        for (Student student1: studentList) {
            if (student1.getCourse().equals(student.getCourse())) {
                index = studentList.indexOf(student1);
            }
        }
        studentList.add(index,student);
        return studentList;
    }

    @Override
    public List<Student> removeStudentByStudentObject(Student student) {

        int index = -1;

        for (Student student1: studentList) {
            if (student1.getCourse().equals(student.getCourse())) {
                index = studentList.indexOf(student1);
            }
        }
        studentList.remove(index);
        return studentList;
    }

      /*
        ^^^^^^^^________^^^^^^^^

        ^^^^^^^^________^^^^^^^^

        ^^^^^^^^________^^^^^^^^

     */

    @Override
    public List<Teacher> getTeacherSortedListByNameAsc() {

        teacherList.sort(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return teacherList;
    }

    @Override
    public List<Teacher> getTeacherSortedListByNameDesc() {

        Collections.sort(teacherList,Collections.reverseOrder());
        return teacherList;
    }

    @Override
    public List<Teacher> addTeacherByTeacherObject(Teacher teacher) {

        teacherList.add(teacher);
        return teacherList;
    }

    @Override
    public List<Teacher> removeTeacherByTeacherObject(Teacher teacher) {
        int index = -1;

        for (Teacher teacher1: teacherList) {
            if (teacher1.getCourse().equals(teacher.getCourse())) {
                index = teacherList.indexOf(teacher1);
            }
        }
        teacherList.remove(index);
        return teacherList;
    }
}
