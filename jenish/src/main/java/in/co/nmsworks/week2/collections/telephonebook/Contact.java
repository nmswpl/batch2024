package in.co.nmsworks.week2.collections.telephonebook;

public class Contact{
    private Integer phoneNumber;
    private String name;

    public Contact() {

    }

    public Contact(Integer phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}