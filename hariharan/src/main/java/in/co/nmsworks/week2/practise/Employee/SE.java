package in.co.nmsworks.week2.practise.Employee;

public class SE extends Employee{



    @Override
   float calcualteSalary() {
        return getBasicSalary() * getSalaryFactor();
    }

    @Override
    float calculatePF() {
        return calcualteSalary() * getPfPercentage();
    }
}
