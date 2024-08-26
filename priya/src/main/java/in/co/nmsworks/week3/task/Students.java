package in.co.nmsworks.week3.task;

import java.util.HashMap;
import java.util.Map;

public class Students {
    Map<Integer,Students> studentCollection = new HashMap<>();
    private String name;
    private int ID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Students( int ID,String name) {
        this.name = name;
        this.ID = ID;
    }

    public Students() {
    }

    @Override
    public String toString() {
        return "StudentCollection{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }
    public void createObject(int id,String name){
        Students sc = new Students(id,name);
        studentCollection.put(id,sc);
    }
    public void search(int ID){
       for(Integer key: studentCollection.keySet()){
           if(key ==ID){
               System.out.println(key+ " "+studentCollection.get(key));
           }
       }
    }
    public void insert(Students student){
        studentCollection.put(student.getID(),student);
        System.out.println(studentCollection);
    }
    public void delete(int ID){

        studentCollection.remove(ID);
        System.out.println(studentCollection);
    }

    public static void main(String[] args) {
        Students s = new Students();

        s.createObject(1,"priya");
        s.createObject(2,"pooja");
        s.createObject(3,"prema");
        s.search(2);
        s.insert(new Students(4,"suji"));
        s.delete(3);

    }
}
