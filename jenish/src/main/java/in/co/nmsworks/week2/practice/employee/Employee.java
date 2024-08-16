package in.co.nmsworks.week2.practice.employee;

/*public class Employee extends Person {
    private static int basicSalary = 10000;
    private static float pfFactor = (float) 6 /100;
    private int id;
    private float salaryFactor;

    public Employee(float salaryFactor){
        salaryFactor = this.salaryFactor;
    }

    public float calculateSalary(){
        float salary = Employee.getBasicSalary() * salaryFactor;
        return salary;
    }
    public void calculatePf(){
        float pf = Employee.getPfFactor() * calculateSalary();
        System.out.println("PF of Trainee :: "+pf);
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

    /*public static void main(String[] args) {

        /*Trainee jenish = new Trainee();
        jenish.setId(1);
        jenish.setName("Jenish");
        jenish.setMobileNumber("7856323678");
        jenish.setGender(Gender.MALE);
        jenish.calculateSalary();
        jenish.calculatePf();*/

        /*SoftwareEngineer sam = new SoftwareEngineer();
        sam.setId(1);
        sam.setName("Jenish");
        sam.setMobileNumber("7856323678");
        sam.setGender(Gender.MALE);
        sam.calculateSalary();
        sam.calculatePf();
        sam.calculateSalary();
        sam.calculatePf();

        SeniorSoftwareEngineer sse1 = new SeniorSoftwareEngineer();
        System.out.println("Salary of Senior Software Engineer :: "+sse1.calculateSalary());
        sse1.calculatePf();

        TeamLeader tl1 = new TeamLeader();
        System.out.println("Salary of Team Leader :: "+tl1.calculateSalary());
        tl1.calculatePf();

        VicePresident vp1 = new VicePresident();
        System.out.println("Salary of Vice President :: "+vp1.calculateSalary());
        vp1.calculatePf();
    }
}*/