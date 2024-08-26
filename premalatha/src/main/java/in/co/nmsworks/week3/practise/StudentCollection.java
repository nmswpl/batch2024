package in.co.nmsworks.week3.practise;
/*
**Question-7:** Design and implement a class that manages a collection of `Student` objects where each student
has a unique ID and a name. The class should support efficient searching, insertion, and deletion by student ID.
**Challenge:** Choose the appropriate data structure for efficient operations.
 */

import java.util.HashMap;
import java.util.Map;

public class StudentCollection {
    private int id;
    private String name;

    public StudentCollection() {

    }
    public StudentCollection(int id,String name){
        this.id = id;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    Map<Integer,String> studentDetails = new HashMap<>();

    public String getStudentByID(int id){
        return studentDetails.get(id);
    }

    public void insertStudent(StudentCollection student){
        studentDetails.put(student.getId(), student.getName());
    }

    public void deleteStudent(int id){
        studentDetails.remove(id);
    }

    public static void main(String[] args) {
        StudentCollection student = new StudentCollection();
        student.getStudentByID(2);
        student.insertStudent(new StudentCollection(1,"Prema"));
        student.insertStudent(new StudentCollection(2,"Jenifer"));
        student.insertStudent(new StudentCollection(3,"Raji"));
        student.insertStudent(new StudentCollection(4,"Aarthi"));
        student.deleteStudent(3);
        System.out.println(student.studentDetails);
    }

}