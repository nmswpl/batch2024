package in.co.nmsworks.week2.practice.employee;

public class TL extends Employee{
    TL tl =new TL();

    public void calculateSalary(){
        double salary;
        salary=getBasicSalary()*2.0;
        System.out.println(salary);
    }
}
