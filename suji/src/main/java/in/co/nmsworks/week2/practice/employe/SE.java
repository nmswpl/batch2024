package in.co.nmsworks.week2.practice.employe;

public class SE extends Employee {
    public static void main(String[] args) {


        SE obj2 = new SE();
        obj2.setBasicSalary(10000.0f);
        obj2.getBasicSalary();
        obj2.calcSalary(1.0f);
        obj2.printSalary();
        obj2.calcPf();
        obj2.printPf();
obj2.setId(2);
        System.out.println("Id :: "+  obj2.getId());
        obj2.setName("Suji-SE");
        System.out.println("Name :: "+  obj2.getName());
        obj2.setPhno(98872918);
        System.out.println("Number :: "+  obj2.getPhno());
        obj2.setGender(Gender.FEMALE);
        System.out.println(" Gender  "+obj2.getGender());


    }
}
