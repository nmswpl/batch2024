package in.co.nmsworks.week3.day4;

public class Sample {
    public void array(String name,int... salaries){
        for (int salary : salaries) {
            System.out.println(name+salary);
        }
    }

    public static void main(String[] args) {
        Sample s1 = new Sample();
        s1.array("jenish",1,2,3);
    }
}