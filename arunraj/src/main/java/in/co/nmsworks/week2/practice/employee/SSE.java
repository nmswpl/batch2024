package in.co.nmsworks.week2.practice.employee;

public class SSE extends Employee {
    SSE sse=new SSE();

    public void calculateSalary(){
        double salary;
        salary=getBasicSalary()*1.5;
        System.out.println(salary);
    }

}
