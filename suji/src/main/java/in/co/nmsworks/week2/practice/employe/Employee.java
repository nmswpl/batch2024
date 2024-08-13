package in.co.nmsworks.week2.practice.employe;

public class Employee extends Person{
    float basicSalary;
    float factor;



    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

 public float calcSalary(float factor)
 {
     float salary=0;
     this.factor=factor;
     salary=basicSalary*factor;
     return salary;
 }

 public void printSalary()
 {
     System.out.println(" Salary"+calcSalary(factor));
 }
    public float calcPf()
    {
       float pf=0;
       float pfPercentage=0.06f;
        pf=calcSalary(factor)*pfPercentage;
        return pf;
    }
    public void printPf()
    {
        System.out.println(" Pf "+calcPf());
    }



}
