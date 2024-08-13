package in.co.nmsworks.week2.practice.employe;

public class SSE extends Employee {
    public static void main(String[] args) {


        SSE obj3 = new SSE();
        obj3.setBasicSalary(10000.0f);
        obj3.getBasicSalary();
        obj3.calcSalary(1.5f);
        obj3.printSalary();
        obj3.calcPf();
        obj3.printPf();
        obj3.setId(3);
      System.out.println("Id :: "+  obj3.getId());

       // System.out.println("Id :: "+  obj3.getId());
        obj3.setName("MANGO-SSE");
        System.out.println("Name :: "+  obj3.getName());
        obj3.setPhno(98872918);
        System.out.println("Number :: "+  obj3.getPhno());
        obj3.setGender(Gender.MALE);
        System.out.println(" Gender"+obj3.getGender());

    }
}
