package in.co.nmsworks.week3.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student
{

    int id;
    String name;

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

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    static List<Student> studentList = new ArrayList<Student>();
     Map<Integer,String> mapOfStudents = new HashMap<Integer,String>();

    public Student(){
        for (Student student : studentList) {
            mapOfStudents.put(student.getId(), student.getName());
        }
    }
    public static void main(String[] args) {



        for (int i = 0; i < 3; i++) {
            studentList.add(new Student(1,"hari"));
            studentList.add(new Student(2,"jenish"));
            studentList.add(new Student(3,"abi"));
            studentList.add(new Student(4,"muthu"));
        }

        Student student = new Student();
        student.addStudent(5,"kumar");
        student.searchStudent(2);
        student.deleteStudent(4);


    }

    public void addStudent(int id, String name){

      if(!mapOfStudents.containsKey(id)){
          mapOfStudents.put(id, name);
      }else{
          System.out.println("Wrong ID");
      }
        System.out.println(mapOfStudents);
    }

    public void searchStudent(int id){
        if(mapOfStudents.containsKey(id)){
            System.out.println("ID: " + id +"\n"+ "Name:"+mapOfStudents.get(id));
        }else{
            System.out.println("Student ID don`t exist");
        }

        System.out.println(mapOfStudents);
    }

    public void deleteStudent(int id){
        if(mapOfStudents.containsKey(id)){
            mapOfStudents.remove(id);
            System.out.println("Student Record Deleted");
        }else{
            System.out.println("Student ID don`t exist");
        }
        System.out.println(mapOfStudents);
    }
}
