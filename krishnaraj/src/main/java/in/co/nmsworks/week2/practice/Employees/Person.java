package in.co.nmsworks.week2.practice.Employees;

public class Person {
    private String name;
    private int id;
    private int moblieNumber;
    private Gender geder;
    public enum Gender{
        MALE,
        FEMALE,
        OTHERS
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

    public int getMoblieNumber() {
        return moblieNumber;
    }

    public void setMoblieNumber(int moblieNumber) {
        this.moblieNumber = moblieNumber;
    }

    public Gender getGeder() {
        return geder;
    }

    public void setGeder(Gender geder) {
        this.geder = geder;
    }
}

