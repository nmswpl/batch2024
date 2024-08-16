package in.co.nmsworks.week2.practice.employee;

public class Employee {
    private static int pFPercent = 6 ;
    private static int basicSalary = 10000 ;
    private Person person = new Person();
    private float factor;
    private float salary;
    private float pF;

    public float getFactor()
    {
        return factor;
    }

    public void setFactor(float factor)
    {
        this.factor = factor;
    }

    public static int getpFPercent()
    {
        return pFPercent;
    }

    public static void setpFPercent(int pFPercent)
    {
        Employee.pFPercent = pFPercent;
    }

    public static int getBasicSalary()
    {
        return basicSalary;
    }

    public static void setBasicSalary(int basicSalary)
    {
        Employee.basicSalary = basicSalary;
    }

    public Person getPerson()
    {
        return person;
    }

    public void setPerson(Person person)
    {
        this.person = person;
    }

    public float getpF() {
        return pF;
    }

    public void setpF(float pF) {
        this.pF = pF;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary)
    {
        this.salary = salary;
    }

    public float calculateSalary()
    {
        return factor*getBasicSalary();
    }

    public float calculatePF()
    {
        return getSalary()*getpFPercent()/100;
    }


    @Override
    public String toString() {
        return  person +
                "Salary = " + salary +
                "\nPF = " + pF +
                '\n';
    }
}