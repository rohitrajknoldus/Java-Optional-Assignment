package com.kupAssignOptional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import static java.lang.System.out;

/**
 * Represents a Main Application Implementation class.
 */
public final class Main {
    private Main() {
    }
    /**
     * main() method
     * @param argument to accept arguments.
     */
    public static void main(final String[] argument) {
        final int rollNumberOfStudent1 = 1, rollNumberOfStudent2 = 2, rollNumberOfStudent3 = 3, rollNumberOfStudent4 = 4,
        rollNumberOfStudent5 = 5, rollNumberOfStudent6 = 6, rollNumberOfStudent7 = 7,
        rollNumberOfStudent8 = 8, rollNumberOfStudent9 = 9, rollNumberOfStudent10 = 10;

        Student std1 = new Student(
                "Ram", rollNumberOfStudent1, Optional.of("Ramayan"));
        Student std2 = new Student(
                "Shyam", rollNumberOfStudent2, Optional.empty());
        Student std3 = new Student(
                "Ghansyam", rollNumberOfStudent3, Optional.empty());
        Student std4 = new Student(
                "Hanuman", rollNumberOfStudent4, Optional.of("Java"));
        Student std5 = new Student(
                "Raju", rollNumberOfStudent5, Optional.of(".NET"));
        Student std6 = new Student(
                "Bhuvi", rollNumberOfStudent6, Optional.of("React"));
        Student std7 = new Student(
                "Pradip", rollNumberOfStudent7, Optional.of("JavaScript"));
        Student std8 = new Student(
                "kumar", rollNumberOfStudent8, Optional.of("Python"));
        Student std9 = new Student(
                "", rollNumberOfStudent9, Optional.of("PHP"));
        Student std10 = new Student(
                "Raj", rollNumberOfStudent10, Optional.of("SpringBoot"));
        //   * It's used to Creating student list.
        Optional<List<Student>> studentList = Optional
                .of(Arrays.asList(std1, std2, std3, std1));
        //   * It's used to Creating a student list.
        Optional<List<Student>> studentList2 = Optional
                .of(Arrays.asList(std4, std5, std6,
                        std7, std9, std10, std8));
        //   * It's used to Creating classroom list.
        List<ClassRoom> classRooms = new ArrayList<>();
        classRooms.add(new ClassRoom("Joker", studentList));
        classRooms.add(new ClassRoom("xyz", studentList2));
        classRooms.add(new ClassRoom("Jogger", Optional.empty()));
        //  It's used to  Printing hello students if given room having students.
        String finalString = classRooms.get(1).hasStudents();
        out.println(finalString);
        //  * It's used to Finding students without subjects.
        List<Student> studentsWithoutSubject = classRooms
                .get(0).toGetStudentsWithoutSubject();
        out.println("\n List Of Students Without subject: ");
        studentsWithoutSubject.forEach(out::println);
        List<Optional<String>> subjectsList = classRooms.get(1)
                .toGetDistinctSubjectsThroughRoomId("xyz");
        out.println("\n List of Dinstinct subject student ClassRoom xyz: ");
        subjectsList.forEach(out::println);
    }
}
