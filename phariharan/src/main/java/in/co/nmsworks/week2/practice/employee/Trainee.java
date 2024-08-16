package in.co.nmsworks.week2.practice.employee;

public class Trainee extends Employee{
    public Trainee()
    {
        setFactor(0.5f);
        setSalary(calculateSalary());
        setpF(calculatePF());
    }
}