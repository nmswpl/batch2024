package in.co.nmsworks.week3.assessment.weekend;
/****Question-7:** Design and implement a class that manages a collection of `Student` objects where each
 * student has a unique ID and a name. The class should support efficient searching, insertion, and deletion by student ID.
  **Challenge:** Choose the appropriate data structure for efficient operations.
 * */


public class Students {
    private int id;
    private String name;

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

    public Students(){

    }

    public Students(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
