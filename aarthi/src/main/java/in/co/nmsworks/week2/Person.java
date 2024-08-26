package in.co.nmsworks.week2;

public class Person {
    String name;
    int id;
    int moblieno;
    double salary;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMoblieno() {
        return moblieno;
    }

    public void setMoblieno(int moblieno) {
        this.moblieno = moblieno;
    }

    public class Employee extends Person {
        private int basicsalary;
        private float salaryfactor;
        int pffactor = 6;

        public int getBasicsalary() {
            return basicsalary;
        }

        public void setBasicsalary(int basicsalary) {
            this.basicsalary = basicsalary;
        }


        public void calculatesalary() {
            double salary = salaryfactor * basicsalary;
            System.out.println(salary);

        }

        public void calculatepffactor() {
            double cpffactor = salary * pffactor;
            System.out.println(cpffactor);
        }


    }

    class Vp extends Employee {
        private float salaryfactor;

        public float getSalaryfactor() {
            return salaryfactor;
        }

        public void setSalaryfactor(float salaryfactor) {
            this.salaryfactor = salaryfactor;
        }
    }

    class Tl extends Employee {
        private float salaryfactor;


        public float getSalaryfactor() {
            return salaryfactor;
        }

        public void setSalaryfactor(float salaryfactor) {
            this.salaryfactor = salaryfactor;
        }


    }

    class trainee extends Employee {
        private float salaryfactor;

    }
}
