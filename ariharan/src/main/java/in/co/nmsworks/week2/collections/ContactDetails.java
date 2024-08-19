package in.co.nmsworks.week2.collections;

public class ContactDetails {
    private long phno;
    private String name;

    public ContactDetails(long phno, String name) {
        this.phno = phno;
        this.name = name;
    }

    public long getPhno() {
        return phno;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ContactDetails{" +
                "phno=" + phno +
                ", name='" + name + '\'' +
                '}';
    }
}
