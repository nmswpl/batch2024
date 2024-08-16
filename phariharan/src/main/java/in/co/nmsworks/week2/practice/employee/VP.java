package in.co.nmsworks.week2.practice.employee;

public class VP extends Employee{

    public VP() {
        setFactor(3f);
        setSalary(calculateSalary());
        setpF(calculatePF());
    }
}