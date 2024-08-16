package in.co.nmsworks.week2.practice.Employees;

public class Runner1 {
    public static void main(String[] args) {
        Trainer trainer1=new Trainer();
        trainer1.setDetails("yyyy",2,777777);
        System.out.println("The salery for trainer :"+trainer1.salery(trainer1.getFactor()));
        System.out.println("The Pf for a trainer :"+trainer1.calculatePF(trainer1.getFactor()));


        SoftwareEnginner softwareEnginner=new SoftwareEnginner();
        System.out.println("The salery for se :"+softwareEnginner.salery(softwareEnginner.factor));
        System.out.println("The Pf for a se :"+softwareEnginner.calculatePF(softwareEnginner.factor));

        SeniorSoftwareEngineer seniorSoftwareEngineer=new SeniorSoftwareEngineer();
        System.out.println("The salery for sse :"+seniorSoftwareEngineer.salery(seniorSoftwareEngineer.factor));
        System.out.println("The Pf for a sse :"+seniorSoftwareEngineer.calculatePF(seniorSoftwareEngineer.factor));
    }
}
