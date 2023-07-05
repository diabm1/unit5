package com.devmountain.unit5;

import java.util.ArrayList;
import java.util.List;

public class ClassDataObject {
    private List<Student> students = new ArrayList<>();
    private List<Class> classes = new ArrayList<>();

    public ClassDataObject() {
        // Example data
        students.add(new Student("John", "Class A"));
        students.add(new Student("Emily", "Class B"));
        students.add(new Student("Michael", "Class C"));

        classes.add(new Class("Class A", "Spring 2023"));
        classes.add(new Class("Class B", "Spring 2023"));
        classes.add(new Class("Class C", "Spring 2023"));
    }

    public List<Student> getStudentsInClass(String classId) {
        List<Student> enrolledStudents = new ArrayList<>();

        for (Student student : students) {
            if (student.getClassName().equals(classId)) {
                enrolledStudents.add(student);
            }
        }

        return enrolledStudents;
    }

    public void markInactive(Class classObj) {
        classes.remove(classObj);
    }
}

