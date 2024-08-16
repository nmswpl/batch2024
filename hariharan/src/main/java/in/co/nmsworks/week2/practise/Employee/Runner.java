package in.co.nmsworks.week2.practise.Employee;

public class Runner {
    public static void main(String[] args) {
        Trainee trainee =new Trainee();
        trainee.setSalaryFactor(0.5f);
        System.out.println(trainee.calcualteSalary());
        System.out.println(trainee.calculatePF());

        SE se = new  SE();
        se.setSalaryFactor(1);
        System.out.println(se.calcualteSalary());
        System.out.println(se.calculatePF());

        SSE sse = new  SSE();
        sse.setSalaryFactor(1.5f);
        System.out.println(sse.calcualteSalary());
        System.out.println(sse.calculatePF());

        TL tl = new  TL();

        tl.setSalaryFactor(2);
        System.out.println(tl.calcualteSalary());
        System.out.println(tl.calculatePF());

        VP vp = new VP();
        vp.setSalaryFactor(3);

        System.out.println(vp.calcualteSalary());
        System.out.println(vp.calculatePF());

        Person person = new Person();
        person.setId(1);
        person.setSalaryFactor(1);
        System.out.println(person.calcualteSalary());
        System.out.println(person.calculatePF());



    }
}
