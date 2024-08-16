package in.co.nmsworks.week2.Practice.Employee;

public class Runner {

    public static void main(String[] args) {
        Trainee McArthur = new Trainee();
        McArthur.setName("Muthu Raj");
        McArthur.setFactor(2);
        McArthur.setId(7);
        McArthur.setMobNum("8903721272");
        System.out.println(McArthur);

        Employee sanjeev = new TL();
        sanjeev.setName("Sanjeev");
        sanjeev.setId(8);
        sanjeev.setMobNum("8907654352");
        System.out.println(sanjeev);

        SDE ramesh = new SDE();
        ramesh.setName("Ramesh");
        ramesh.setId(9);
        ramesh.setMobNum("8907654355");
        System.out.println(ramesh);

        SSDE felix = new SSDE();
        felix.setName("Felix");
        felix.setId(10);
        felix.setMobNum("6783921231");
        System.out.println(felix);

        VP david = new VP();
        david.setName("David");
        david.setId(1);
        david.setMobNum("7829161481");
        System.out.println(david);


    }
}
