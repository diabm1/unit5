package com.devmountain.unit5;

import com.devmountain.unit5.Student;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class StudentDataObject {
    // Simulated data source
    private List<Student> students = new ArrayList<>();

    public StudentDataObject() {
        // Example data
        students.add(new Student("John", "Class A"));
        students.add(new Student("Emily", "Class B"));
        students.add(new Student("Michael", "Class C"));
        students.add(new Student("Sophia", "Class A"));
        students.add(new Student("Daniel", "Class B"));
    }

    public List<Student> getStudentsInClass(String classId) {
        List<Student> studentsInClass = new ArrayList<>();

        for (Student student : students) {
            if (student.getClassName().equals(classId)) {
                studentsInClass.add(student);
            }
        }

        return studentsInClass;
    }
}

