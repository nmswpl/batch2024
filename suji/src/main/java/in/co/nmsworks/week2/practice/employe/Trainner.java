package in.co.nmsworks.week2.practice.employe;

public class Trainner extends Employee{
    public static void main(String[] args) {


        Trainner obj1 = new Trainner();
        obj1.setBasicSalary(10000.0f);
        obj1.getBasicSalary();
        obj1.calcSalary(0.5f);
        obj1.printSalary();
        obj1.calcPf();
        obj1.printPf();
        obj1.setId(1);
        System.out.println("Id :: "+  obj1.getId());
        obj1.setName("HELANA");
        System.out.println("Name :: "+  obj1.getName());
        obj1.setPhno(98872918);
        System.out.println("Number :: "+  obj1.getPhno());
        obj1.setGender(Gender.MALE);
        System.out.println(" Gender"+obj1.getGender());







    }
}
