package in.co.nmsworks.week2.collections;

import java.util.ArrayList;
import java.util.List;

public class PQ10 {
    List<String> colors=new ArrayList<String>();
    public void setColor() {
        colors.add("red");
        colors.add("yellow");
        colors.add("green");
        colors.add("black");
        colors.addAll(colors1);

    }
    List<String> colors1=new ArrayList<String>();
    public void setColor1(){
        colors1.add("Pavi");
        colors1.add("Aarthi");
        colors1.add("Madhu");
        System.out.println(colors.equals(colors1));
}}
