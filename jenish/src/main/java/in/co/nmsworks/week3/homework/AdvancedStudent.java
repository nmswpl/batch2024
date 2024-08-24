package in.co.nmsworks.week3.homework;

import java.util.HashMap;
import java.util.Map;

public class AdvancedStudent {
    private int id;
    private String name;
    private Map<Integer, AdvancedStudent> studentsDetails = new HashMap<>();

    public AdvancedStudent() {
    }

    public AdvancedStudent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentWithSearchFeatures{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public AdvancedStudent getStudentById(int id){
        return studentsDetails.get(id);
    }

    public void addStudent(AdvancedStudent student){
        studentsDetails.putIfAbsent(student.getId(),student);
    }

    public void deleteStudentById(int id){
        studentsDetails.remove(id);
    }

    public static void main(String[] args) {
        AdvancedStudent student = new AdvancedStudent();
        student.getStudentById(1);
        student.addStudent(new AdvancedStudent(1,"Jeff"));
        student.addStudent(new AdvancedStudent(2,"Sam"));
        student.addStudent(new AdvancedStudent(3,"John"));
        student.addStudent(new AdvancedStudent(4,"Kyle"));
        student.deleteStudentById(1);
        System.out.println(student.studentsDetails);
    }
}