package in.co.nmsworks.week2.practice.Employees;

public class Trainer extends Employee{
    private float factor=0.5F;
    public float getFactor() {
        return factor;
    }
    public void setFactor(float factor) {
        this.factor = factor;
    }
    public void setDetails(String name,int Id,int mobileNumber){
        setName(name);
        setId(Id);
        setMoblieNumber(mobileNumber);
    }
}
