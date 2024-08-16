package in.co.nmsworks.week2.practice;

import java.util.Arrays;

public class Birds extends Animal {
    private int noOfWing;

    public int getNoOfWing() {
        return noOfWing;
    }

    public void setNoOfWing(int noOfWing) {
        this.noOfWing = noOfWing;
    }

    public boolean canSwim(){
        return true;
    }

    public void details(){
        System.out.println("can swim: " + canSwim());
        System.out.println("no of wings " + getNoOfWing() + " wings.");
        System.out.println("Eats :" + Arrays.toString(getEats()));
        System.out.println("Animal in Types of "+getEatTypes());
    }
}
