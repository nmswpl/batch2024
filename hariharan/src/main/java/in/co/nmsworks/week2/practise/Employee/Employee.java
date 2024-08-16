package in.co.nmsworks.week2.practise.Employee;

import java.util.ArrayList;
import java.util.List;

abstract public class Employee {



    private static  int basicSalary = 10000;

    private float salaryFactor;

    public float getSalaryFactor() {
        return salaryFactor;
    }

    public void setSalaryFactor(float salaryFactor) {
        this.salaryFactor = salaryFactor;
    }


    private static float pfPercentage = 0.06f;

    abstract float calcualteSalary();

    abstract float calculatePF();

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public static float getPfPercentage() {
        return pfPercentage;
    }

    public static void setPfPercentage(int pfPercentage) {
        Employee.pfPercentage = pfPercentage;
    }











}
