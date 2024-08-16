package in.co.nmsworks.week2.practice.employee;

public class Trainee extends Employee {
    Trainee trainer=new Trainee();

    public void calculateSalary(){
        double salary;
        salary=getBasicSalary()*0.5;
        System.out.println(salary);
    }


}
