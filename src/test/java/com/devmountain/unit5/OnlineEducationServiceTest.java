package com.devmountain.unit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class OnlineEducationServiceTest {
    @Mock
    private StudentDataObject studentDataObject;

    @Mock
    private InstructorDataObject instructorDataObject;

    @Mock
    private ClassDataObject classDataObject;

    @InjectMocks
    private OnlineEducationService onlineEducationService;

    @Captor
    private ArgumentCaptor<Class> classCaptor;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetStudentsByClassId() {
        // Mock the getAllStudents() method to return a list of students
        List<Student> students = Arrays.asList(
                new Student("Joy Ma", "Spanish"),
                new Student("Julio Hernandez", "Algebra"),
                new Student("Jenny Jones", "Calculus")
        );
        when(studentDataObject.getAllStudents()).thenReturn(students);

        // Call the method under test
        List<Student> result = onlineEducationService.getStudentsByClassId("math");

        // Verify the result
        assertEquals(2, result.size());
        assertEquals("Julio Hernandez", result.get(0).getName());
        assertEquals("Jenny Jones", result.get(1).getName());
    }

    @Test
    void testMarkCurrentClassesInactive() {
        // Create a list of classes
        List<Class> classes = Arrays.asList(
                new Class("Geometry", "Summer 2022"),
                new Class("Environmental Science", "Fall 2022"),
                new Class("Comparative Literature", "Spring 2023")
        );

        // Call the method under test
        onlineEducationService.markCurrentClassesInactive(classes);

        // Verify that markInactive() method is called on Geometry class once, but not on the other classes
        verify(classDataObject, times(1)).markInactive(classCaptor.capture());
        assertEquals("Geometry", classCaptor.getValue().getName());
    }

    @Test
    void testGetClassesByInstructor() {
        // Mock the getClassesByInstructor() method to return a list of classes
        List<Class> classes = Arrays.asList(
                new Class("Math"),
                new Class("Physics"),
                new Class("English")
        );
        when(instructorDataObject.getClassesByInstructor("123")).thenReturn(classes);

        // Call the method under test
        List<Class> result = onlineEducationService.getClassesByInstructor("123");

        // Verify the result
        assertEquals(3, result.size());
        assertEquals("Math", result.get(0).getName());
        assertEquals("Physics", result.get(1).getName());
        assertEquals("English", result.get(2).getName());
    }

    @Test
    void testGetStudentsInClass() {
        // Mock the getStudentsInClass() method to return a list of students
        List<Student> students = Arrays.asList(
                new Student("Alice"),
                new Student("Bob"),
                new Student("Carol")
        );
        when(classDataObject.getStudentsInClass("456")).thenReturn(students);

        // Call the method under test
        List<Student> result = onlineEducationService.getStudentsInClass("456");

        // Verify the result
        assertEquals(3, result.size());
        assertEquals("Alice", result.get(0).getName());
        assertEquals("Bob", result.get(1).getName());
        assertEquals("Carol", result.get(2).getName());
    }
}

