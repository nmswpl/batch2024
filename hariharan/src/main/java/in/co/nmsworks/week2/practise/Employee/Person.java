package in.co.nmsworks.week2.practise.Employee;

public class Person  extends Employee{

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    private int id;
    private String name;
    private int mobile;

    public enum Gender {
        MALE,
        FEMALe,
        OTHERS
    }

    ;

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    Gender gender;



    @Override
    float calcualteSalary () {
        return getBasicSalary() * getSalaryFactor();
    }

    @Override
    float calculatePF () {
        return calcualteSalary() * getPfPercentage();
    }

}
