package in.co.nmsworks.week2.practice.employee;

public class SoftwareEngineer extends Employee {
    private float salaryFactor;


    public float getSalaryFactor() {
        return salaryFactor;
    }

    public void setSalaryFactor(float salaryFactor) {
        this.salaryFactor = salaryFactor;
    }


    public float calculateSalary(){
        return getBasicSalary()*salaryFactor;
    }

    public  float calculatepfSalary(){
        return calculateSalary()*getPfPercent();
    }
}
