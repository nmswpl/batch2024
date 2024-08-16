package in.co.nmsworks.week2.practice.employee;

public class Employee {
    String name="";
    int id;
    int mobileNumber;
    String gender="";
    private float basicSalary;
    private float salaryFactor;

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public float getSalaryFactor() {
        return salaryFactor;
    }

    public void setSalaryFactor(float salaryFactor) {
        this.salaryFactor = salaryFactor;
    }

    public void details(String name,int id,String gender,int mobileNumber){
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("Gender : "+gender);
        System.out.println("MobileNumber : "+mobileNumber);

}
}





