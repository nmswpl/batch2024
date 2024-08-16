package in.co.nmsworks.week2.practice.employee;

public class SE extends Employee{
    SE se=new SE();

    public void calculateSalary(){
        double salary;
        salary=getBasicSalary()*1.0;
        System.out.println(salary);
    }
}
