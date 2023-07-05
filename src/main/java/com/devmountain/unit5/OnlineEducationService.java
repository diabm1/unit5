package com.devmountain.unit5;

import java.util.List;

import java.util.List;

public class OnlineEducationService {
    private StudentDataObject studentDataObject;
    private InstructorDataObject instructorDataObject;
    private ClassDataObject classDataObject;

    public OnlineEducationService(StudentDataObject studentDataObject,
                                  InstructorDataObject instructorDataObject,
                                  ClassDataObject classDataObject) {
        this.studentDataObject = studentDataObject;
        this.instructorDataObject = instructorDataObject;
        this.classDataObject = classDataObject;
    }

    public List<Student> getStudentsByClassId(String classId) {
        return studentDataObject.getStudentsInClass(classId);
    }

    public void markCurrentClassesInactive(List<Class> classes) {
        for (Class classObj : classes) {
            classDataObject.markInactive(classObj);
        }
    }

    public List<Class> getClassesByInstructor(String instructorId) {
        return instructorDataObject.getClassesByInstructor(instructorId);
    }

    public List<Student> getStudentsInClass(String classId) {
        return classDataObject.getStudentsInClass(classId);
    }
}

