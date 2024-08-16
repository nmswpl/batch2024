package in.co.nmsworks.week2.practice.employee;

public class Person extends VP{
    public static void main(String[] args) {


        Person p1=new Person();
        p1.details("Person1",1,"Male",123456789);
        p1.vp.setBasicSalary(10000);
        p1.calculateSalary();

       // p2.details("Person2",2,"Male",24315678);


    }
}
