package com.devmountain.unit5;

import java.util.ArrayList;
import java.util.List;

public class InstructorDataObject {
    public List<Class> getClassesByInstructor(String instructorId) {
        List<Class> classes = new ArrayList<>();
        classes.add(new Class("Math", "Class A"));
        classes.add(new Class("Science", "Class B"));
        classes.add(new Class("History", "Class C"));

        return classes;
    }
}

