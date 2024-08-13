package in.co.nmsworks.week2.practice.employe;

public class TL extends Employee {
    public static void main(String[] args) {


        TL obj4 = new TL();
        obj4.setBasicSalary(10000.0f);
        obj4.getBasicSalary();
        obj4.calcSalary(2.0f);
        obj4.printSalary();
        obj4.calcPf();
        obj4.printPf();

        obj4.setId(4);
        System.out.println("Id :: "+  obj4.getId());
        obj4.setName("Hen-TL");
        System.out.println("Name :: "+  obj4.getName());
        obj4.setPhno(98872918);
        System.out.println("Number :: "+  obj4.getPhno());
        obj4.setGender(Gender.MALE);
        System.out.println(" Gender"+obj4.getGender());


    }
}
