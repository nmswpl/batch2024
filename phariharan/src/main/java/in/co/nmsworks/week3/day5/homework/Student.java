package in.co.nmsworks.week3.day5.homework;

public class Student {
    private Integer uniqueID;
    private String name;

    public Student(Integer uniqueID, String name) {
        this.uniqueID = uniqueID;
        this.name = name;
    }

    public Integer getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(Integer uniqueID) {
        this.uniqueID = uniqueID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "uniqueID=" + uniqueID +
                ", name='" + name + '\'' +
                '}';
    }
}
