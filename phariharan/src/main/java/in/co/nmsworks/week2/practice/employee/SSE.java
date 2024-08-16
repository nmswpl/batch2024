package in.co.nmsworks.week2.practice.employee;

public class SSE extends Employee {
    public SSE() {
        setFactor(1.5f);
        setSalary(calculateSalary());
        setpF(calculatePF());
    }
}