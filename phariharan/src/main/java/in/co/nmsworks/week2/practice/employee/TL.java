package in.co.nmsworks.week2.practice.employee;

public class TL extends Employee {
    public TL() {
        setFactor(2f);
        setSalary(calculateSalary());
        setpF(calculatePF());
    }
}