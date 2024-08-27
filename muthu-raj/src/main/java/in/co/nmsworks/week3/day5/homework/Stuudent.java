package in.co.nmsworks.week3.day5.homework;



import java.util.Objects;

public class Stuudent {
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

    @Override
    public String toString() {
        return "Stuudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
