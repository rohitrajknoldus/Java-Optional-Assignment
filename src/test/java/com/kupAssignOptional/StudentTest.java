package com.kupAssignOptional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;
/**
 * Represents a Student  in the ClassRoom.
 */
public class StudentTest {
    /**
     * student associated with each new student in ClassRoom.
     */
    Student student;

    @Before
    public void setUp() throws Exception {
        student = new Student("Deepak",1, Optional.of("Python"));
    }

    @Test
    public void testGetName() {
        String expectedName = "Deepak";
        String actualName = student.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        String expectedName = "Prakhar";
        student.setName("Prakhar");
        String actualName = student.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testGetRollNumber() {
        int expectedRollNo = 1;
        int actualRollNo = student.getRollNumber();
        Assert.assertEquals(expectedRollNo, actualRollNo);
    }

    @Test
    public void testSetRollNumber() {
        student.setRollNumber(2);
        int expectedRollNo = 2;
        int actualRollNo = student.getRollNumber();
        Assert.assertEquals(expectedRollNo, actualRollNo);
    }

    @Test
    public void testGetSubject() {
        Optional<String> expectedSubject = Optional.of("Python");
        Optional<String> actualSubject = student.getSubject();
        Assert.assertEquals(expectedSubject, actualSubject);
    }

    @Test
    public void testSetSubject() {
        student.setSubject(Optional.of("Python"));
        Optional<String> expectedSubject = Optional.of("Python");
        Optional<String> actualSubject = student.getSubject();
        Assert.assertEquals(expectedSubject, actualSubject);
    }

    @Test
    public void testToString() {
        String expected = "Student{" +
                "name='" + student.getName() + '\'' +
                ", rollNumber=" + student.getRollNumber() +
                ", subject=" + student.getSubject() +
                '}';
        String actual = student.toString();
        Assert.assertEquals(expected, actual);
    }
}