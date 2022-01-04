package com.kupAssignOptional;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * ClassRoom test cases.
 */
public class ClassRoomTest {

    /**
     * List for testing.
     */
    List<Student> studentFirstList;
    List<Student> studentSecondList;
    ClassRoom firstClassRoom;
    ClassRoom secondClassRoom;

    /**
     * it's associated to set up a ClassRoom
     * @throws Exception it will throw an Exception class
     */
    @Before
    public void setUpClassRoom() throws Exception {
        Student std1 = new Student("Rohit", 1, Optional.of("Java"));
        Student std2 = new Student("Raj", 2, Optional.empty());
        Student std3 = new Student("Singh", 3, Optional.empty());
        Student std4 = new Student("Ram", 4, Optional.of("Python"));

        Student std5 = new Student("Raju", 5, Optional.of("C#"));
        Student std6 = new Student("Cheeru", 6, Optional.of(".net"));
        Student std7 = new Student("Pradip", 7, Optional.of("Hadoop"));
        Student std8 = new Student("Kabir", 10, Optional.of("Big Data"));
        Student std9 = new Student("Anish", 11, Optional.of("C++"));
        studentFirstList = Arrays.asList(std1, std2, std3, std4);
        studentSecondList = Arrays.asList(std5, std6, std7, std8,std9);
        firstClassRoom = new ClassRoom("abc", Optional.of(studentFirstList));
        secondClassRoom = new ClassRoom("xyz", Optional.of(studentSecondList));
    }
    /**
     * It associated to Get Students Having No Subject And Return Correct List
     */
    @Test
    public void GetStudentsHavingNoSubject_AndReturnCorrectList() {
        List<Student> anticipatedStudents =
                Arrays.asList(new Student("Shivam",
                        2, Optional.empty()),
                        new Student("Deepak", 3,
                                Optional.empty()));
        List<Student> actualStudents = firstClassRoom.getStudentsWithoutSubjects();
        Assert.assertTrue(actualStudents.size() > 1);
        Assert.assertEquals(anticipatedStudents.get(0).getRollNumber(), actualStudents.get(0).getRollNumber());
    }
    /**
     * to Get Different Subjects Through RoomId And Correct If any Subjects Found By RoomId
     */
    @Test
    public void GetDifferentSubjectsThroughRoomId_AndCorrectIfSubjectsFoundByRoomId() {
        List<Optional<String>> anticipatedSubjects = Arrays.asList(Optional.of(".NET"),
                Optional.of(".net"), Optional.of("Java"),Optional.of("Spring"),
                Optional.of("C++"));
        List<Optional<String>> realSubjects = secondClassRoom.getDistinctSubjectsByRoomId();
        Assert.assertTrue(realSubjects.size() > 1);
        Assert.assertEquals(anticipatedSubjects,realSubjects);
    }
    /**
     * It's used to Get Different Subjects Through RoomId And To Return Null If no Subjects Found
     */
    @Test
    public void GetDifferentSubjectsThroughRoomId_AndToReturnNullIfSubjectsNotFoundByRoomId() {
        List<Optional<String>> finalSubjects = secondClassRoom.toGetDistinctSubjectsThroughRoomId("JV01");
        Assert.assertNull(finalSubjects);
    }
    /**
     * Its test Students And Return a String Message If you Have any Students
     */
    @Test
    public void testStudents_AndReturnStringMessageIfHaveStudents() {
        String anticipatedResult = "Hello Students!";
        String finalResult = firstClassRoom.hasStudents();
        Assert.assertEquals(anticipatedResult, finalResult);
    }
    /**
     * Its test the Students And Return Empty String If Not Have Any Students
     */
    @Test
    public void testStudents_AndReturnEmptyStringIfNotHaveAnyStudents() {
        String anticipatedResult = "";
        firstClassRoom.setStudentList(Optional.empty());
        String finalResult = firstClassRoom.hasStudents();
        Assert.assertEquals(anticipatedResult, finalResult);
    }
    /**
     *  this is associated to Get a RoomId_ And Return Correct RoomId
     */
    @Test
    public void GetRoomId_AndReturnCorrectRoomId(){
        String anticipatedRoomId = "abc";
        String exactRoomId = firstClassRoom.getClassRoomId();
        Assert.assertEquals(anticipatedRoomId, exactRoomId);
    }
    /**
     * this is for Set a RoomId And Return Correct RoomId
     */
    @Test
    public void SetRoomId_AndReturnCorrectRoomId(){
        firstClassRoom.setClassRoomId("J1004");
        String predictedRoomId = "J1004";
        String exactRoomId = firstClassRoom.getClassRoomId();
        Assert.assertEquals(predictedRoomId, exactRoomId);
    }
    /**
     * this is to get StudentList And Return Correct StudentsList
     */
    @Test
    public void getStudentList_AndReturnCorrectStudentsList(){
        Optional<List<Student>> actualList = firstClassRoom.getStudentList();
        Assert.assertTrue(actualList.get().size() > 2);
    }
    /**
     *  this is used to set a StudentList And Return Correct SetStudents List
     */
    @Test
    public void setStudentList_AndReturnCorrectSetStudentsList(){
        firstClassRoom.setStudentList(Optional.ofNullable(studentSecondList));
        Optional<List<Student>> expectedList = Optional.ofNullable(studentSecondList);
        Optional<List<Student>> actualList = firstClassRoom.getStudentList();
        Assert.assertTrue(actualList.get().size() > 2);
        Assert.assertEquals(expectedList.get().get(0).getRollNumber(), actualList.get().get(0).getRollNumber());
    }
    /**
     * testToString() is associated to return actual/predicted String
     */
    @Test
    public void testToString() {
        String predicted = "ClassRoom{" +
                "roomId='" + firstClassRoom.getClassRoomId() + '\'' +
                ", studentList=" + firstClassRoom.getStudentList() +
                '}';
        String actual = firstClassRoom.toString();
        Assert.assertEquals(predicted, actual);
    }
}