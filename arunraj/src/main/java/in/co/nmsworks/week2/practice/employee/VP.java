package in.co.nmsworks.week2.practice.employee;

public class VP extends Employee{
    VP vp=new VP();

    public void calculateSalary(){
        double salary;
        salary=getBasicSalary()*3.0;
        System.out.println("Salary : "+salary);
    }

}
