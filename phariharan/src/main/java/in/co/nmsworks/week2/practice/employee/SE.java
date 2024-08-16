package in.co.nmsworks.week2.practice.employee;

public class SE extends Employee {
    public SE() {
        setFactor(1f);
        setSalary(calculateSalary());
        setpF(calculatePF());
    }
}

