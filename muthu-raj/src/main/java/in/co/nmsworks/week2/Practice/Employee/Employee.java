package in.co.nmsworks.week2.Practice.Employee;

public class Employee extends Person {

    private static int basicSalary = 10000;
    protected float factor;
    private static float pfPercent = 0.06f;

    public static int getBasicSalary() {
        return basicSalary;
    }

    public static void setBasicSalary(int basicSalary) {
        Employee.basicSalary = basicSalary;
    }

    public float getFactor() {
        return factor;
    }

    public void setFactor(float factor) {
        this.factor = factor;
    }

    public static float getPfPercent() {
        return pfPercent;
    }

    public static void setPfPercent(float pfPercent) {
        Employee.pfPercent = pfPercent;
    }


    //    calculate Salary
    public float calculateSalary() {
        return basicSalary * factor;
    }

    // calculate PF

    public float calculatePF() {
        return calculateSalary() * pfPercent;
    }

    @Override
    public String toString() {
        return ("{" + "\nName: " + getName() + "\nId: " + getId() +
                "\nMobile no: " + getMobNum() + "\nSalary:"+ calculateSalary()+"\nPF:"+calculatePF()+"\n}");
    }
}
