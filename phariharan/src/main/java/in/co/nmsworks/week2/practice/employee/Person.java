package in.co.nmsworks.week2.practice.employee;

public class Person {

    private String name ;
    private int iD ;
    private String mobileNumber ;

    public enum Gender {
        MALE,
        FEMALE,
        OTHERS
    }

    private Gender gender ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return  "Name = " + name + '\n' +
                "ID = " + iD +'\n'+
                "MobileNumber = " + mobileNumber + '\n' +
                "Gender = " + gender +'\n';
    }
}
