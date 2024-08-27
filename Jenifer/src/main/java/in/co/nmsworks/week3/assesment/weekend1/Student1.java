package in.co.nmsworks.week3.assesment.weekend1;
/* Design and implement a class that manages a collection of `Student` objects
where each student has a unique ID and a name.
The class should support efficient searching, insertion, and deletion by student ID.
 */
import java.util.*;

public class Student1 {
        String name;
        int id;

    public Student1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Student1() {
    }

    Student1 student1;

    Map<Integer, Student1> idToStudent = new HashMap<>();
    public void mappingIdToStudent(){
        idToStudent.put(1, new Student1("Jenifer", 1));
        idToStudent.put(2, new Student1("Prema", 2));
    }

    public void searchById(int id) {
        if (idToStudent.containsKey(id))
            System.out.println("ID : " + idToStudent.get(id));
    }

    public void insert(int id, String name){
        idToStudent.put(id, student1);
    }

    public void delete(int id){
        if (idToStudent.containsKey(id)){
            idToStudent.remove(id);
        }
    }
}
