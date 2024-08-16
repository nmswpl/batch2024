package in.co.nmsworks.week2.practice.Employees;

public class Employee extends Person{
    private int basicSalary=10000;
    private float pfPercentage=0.06F;
    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public float getPfPercentage() {
        return pfPercentage;
    }

    public void setPfPercentage(float pfPercentage) {
        this.pfPercentage = pfPercentage;
    }

    public float salery(float factor){
        return basicSalary*factor;
    }
    public float calculatePF(float factor){
        return ((basicSalary*factor)*pfPercentage);
    }
}
