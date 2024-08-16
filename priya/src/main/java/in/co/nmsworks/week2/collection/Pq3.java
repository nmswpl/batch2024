package in.co.nmsworks.week2.collection;
import java.util.ArrayList;
import java.util.List;


public class Pq3{
    public void insertElement(){
        List<String> depts = new ArrayList<>();
        depts.add("dev");
        depts.add("dev1");
        depts.add("dev2");
        System.out.println("Before adding:"+depts);
        depts.add(0,"Qa");
        System.out.println("After adding:"+depts);
        System.out.println("Before setting"+depts);
        depts.set(0,"Trainee");
        System.out.println("After setting"+depts);


    }
}
