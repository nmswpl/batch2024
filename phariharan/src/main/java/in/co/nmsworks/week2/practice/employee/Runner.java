package in.co.nmsworks.week2.practice.employee;

public class Runner {
    public static void main(String[] args) {

        System.out.println();

        VP person1 = new VP();
        Person identity = new Person();
        identity.setName("Vice President");
        identity.setiD(1);
        identity.setMobileNumber("9876543210");
        identity.setGender(Person.Gender.MALE);
        person1.setPerson(identity);
        System.out.println(person1);

        TL person2 = new TL();
        Person identity1 = new Person();
        identity1.setName("Team Leader1");
        identity1.setiD(2);
        identity1.setMobileNumber("9823443210");
        identity1.setGender(Person.Gender.FEMALE);
        person2.setPerson(identity1);
        System.out.println(person2);

        SSE person3 = new SSE();
        Person identity3 = new Person();
        identity3.setName("Senior Software Developer");
        identity3.setiD(3);
        identity3.setMobileNumber("9421543210");
        identity3.setGender(Person.Gender.FEMALE);
        person3.setPerson(identity3);
        System.out.println(person3);

        SE person4 = new SE();
        Person identity4 = new Person();
        identity4.setName("Software Engineer");
        identity4.setiD(4);
        identity4.setMobileNumber("9876234210");
        identity4.setGender(Person.Gender.MALE);
        person4.setPerson(identity4);
        System.out.println(person4);

        Trainee person5 = new Trainee();
        Person identity5 = new Person();
        identity5.setName("Trainee 1");
        identity5.setiD(5);
        identity5.setMobileNumber("9876544234");
        identity5.setGender(Person.Gender.MALE);
        person5.setPerson(identity5);
        System.out.println(person5);

    }
}
