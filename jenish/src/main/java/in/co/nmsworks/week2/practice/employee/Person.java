package in.co.nmsworks.week2.practice.employee;

public class Person {
    public enum Gender{
        MALE,
        FEMALE,
        OTHER
    }
    private String name;
    private String mobileNumber;

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "name : " + name + "\n" +
                "mobileNumber : " + mobileNumber + "\n" +
                "gender : " + gender;
    }
}