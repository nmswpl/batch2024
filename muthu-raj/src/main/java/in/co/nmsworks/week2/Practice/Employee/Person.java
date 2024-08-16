package in.co.nmsworks.week2.Practice.Employee;

public class Person {

    private String name;
    private int id;
    private String mobNum;
    public enum Gender{
        MALE,
        FEMALE,
        OTHERS
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    private Gender gender;

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

    public String getMobNum() {
        return mobNum;
    }

    public void setMobNum(String mobNum) {
        this.mobNum = mobNum;
    }
}
