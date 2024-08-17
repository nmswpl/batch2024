package in.co.nmsworks.week2.practice.employee;

public class Employee extends Person {
    private static int basicSalary = 10000;
    private static float pfFactor = (float) 6 /100;
    private int id;
    private float salaryFactor;

    public float getSalaryFactor() {
        return salaryFactor;
    }

    public void setSalaryFactor(float salaryFactor) {
        this.salaryFactor = salaryFactor;
    }

    public Employee(float salaryFactor){
        this.salaryFactor = salaryFactor;
    }

    public float calculateSalary(){
        return Employee.getBasicSalary() * salaryFactor;
    }

    public float calculatePf(){
       return Employee.getPfFactor() * calculateSalary();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public static int getBasicSalary() {
        return basicSalary;
    }

    public static void setBasicSalary(int basicSalary) {
        Employee.basicSalary = basicSalary;
    }

    public static float getPfFactor() {
        return Employee.pfFactor;
    }

    public void setPfFactor(float pfFactor) {
        Employee.pfFactor = pfFactor;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id = " + id + "; "+
                "name = " + getName()+ "; "+
                "gender = " + getGender()+"; "+
                "mobile number = " + getMobileNumber()+"; "+
                "Salary = " + calculateSalary()+"; "+
                "Pf = " + calculatePf()+
                '}';
    }

    public static void main(String[] args) {

        Trainee jenish = new Trainee();
        jenish.setId(1);
        jenish.setName("Jenish");
        jenish.setMobileNumber("7856323678");
        jenish.setGender(Gender.MALE);
        jenish.calculateSalary();
        jenish.calculatePf();
        System.out.println(jenish);

        SoftwareEngineer sam = new SoftwareEngineer();
        sam.setId(2);
        sam.setName("Sam");
        sam.setMobileNumber("7856327978");
        sam.setGender(Gender.MALE);
        sam.calculateSalary();
        sam.calculatePf();
        System.out.println(sam);

        SeniorSoftwareEngineer mark = new SeniorSoftwareEngineer();
        mark.setId(3);
        mark.setName("Mark");
        mark.setMobileNumber("6846732109");
        mark.setGender(Gender.MALE);
        mark.calculateSalary();
        mark.calculatePf();
        System.out.println(mark);


        TeamLeader kyle = new TeamLeader();
        kyle.setId(4);
        kyle.setName("Kyle");
        kyle.setMobileNumber("6784563201");
        kyle.setGender(Gender.FEMALE);
        kyle.calculateSalary();
        kyle.calculatePf();
        System.out.println(kyle);


        VicePresident ruby = new VicePresident();
        ruby.setId(5);
        ruby.setName("Ruby");
        ruby.setMobileNumber("6730564821");
        ruby.setGender(Gender.FEMALE);
        ruby.calculateSalary();
        ruby.calculatePf();
        System.out.println(ruby);
    }
}