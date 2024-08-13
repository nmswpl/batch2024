package in.co.nmsworks.week2.practice.employe;

public class VP extends Employee {
    public static void main(String[] args) {


        VP obj5 = new VP();
        obj5.setBasicSalary(10000.0f);
        obj5.getBasicSalary();
        obj5.calcSalary(3.0f);
        obj5.printSalary();
        obj5.calcPf();
        obj5.printPf();
obj5.setId(5);
        System.out.println("Id :: "+  obj5.getId());
        obj5.setName("Pineapple-VP");
        System.out.println("Name :: "+  obj5.getName());
        obj5.setPhno(98872918);
        System.out.println("Number :: "+  obj5.getPhno());
        obj5.setGender(Gender.FEMALE);
        System.out.println(" Gender"+obj5.getGender());

    }
}
