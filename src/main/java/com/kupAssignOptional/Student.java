package com.kupAssignOptional;

import java.util.Optional;
/**
 * Represents a Student  in a Classroom.
 * A Student can have different entity such as name,rollNumber,subject.
 */
public class Student {
    /**
     * Student's name.
     */
    private String name;
    /**
     * Student's roll number.
     */
    private int rollNumber;
    /**
     * Student's subject.
     */
    private Optional<String> subject;
    /**
     * Creates a new Student with the given student.
     * @param studentName this associated with name of the Student
     * @param studentRollNumber this associated with rollNumber of the Student
     * @param studentSubject associated with enrolled subject of the Student
     */
    public Student(final String studentName, final int studentRollNumber,
                   final Optional<String> studentSubject) {
        this.name = studentName;
        this.rollNumber = studentRollNumber;
        this.subject = studentSubject;
    }
    /**
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * @param studentName associate with distict name of a student
     */
    public void setName(final String studentName) {
        this.name = studentName;
    }
    /**
     * @return rollNumber
     */
    public int getRollNumber() {
        return rollNumber;
    }
    /**
     * @param studentRollNumber associate with unique roolNumber of a student
     */
    public void setRollNumber(final int studentRollNumber) {
        this.rollNumber = studentRollNumber;
    }
    /**
     * @return subject
     */
    public Optional<String> getSubject() {
        return subject;
    }
    /**
     * @param studentSubject associate with enrolled subject by the student
     */
    public void setSubject(final Optional<String> studentSubject) {
        this.subject = studentSubject;
    }

    /**
     * @return student details
     */
    @Override
    public String toString() {
        return "Student{"
                + "name='" + name + '\''
                + ", rollNumber=" + rollNumber
                + ", subject=" + subject
                + '}';
    }
}