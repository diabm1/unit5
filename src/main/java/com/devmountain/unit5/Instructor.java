package com.devmountain.unit5;

import java.util.ArrayList;
import java.util.List;

public class Instructor {
    private String instructorId;
    private String name;
    private List<Class> classes;

    public Instructor(String instructorId, String name) {
        this.instructorId = instructorId;
        this.name = name;
        this.classes = new ArrayList<>();
    }

    public String getInstructorId() {
        return instructorId;
    }

    public String getName() {
        return name;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public void addClass(Class classObj) {
        classes.add(classObj);
    }

    public void removeClass(Class classObj) {
        classes.remove(classObj);
    }
}

