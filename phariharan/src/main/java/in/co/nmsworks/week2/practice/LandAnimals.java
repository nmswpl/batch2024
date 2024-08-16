package in.co.nmsworks.week2.practice;

import java.util.Arrays;

public class LandAnimals extends Animal{
    private int noOfLegs ;

    private static int count = 1;

    public static int getCount(){
        return count;
    }

    public static void setCount(int count) {
        LandAnimals.count = count;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public boolean canWalk(){
        return true;
    }

    public void Details(){
        System.out.println("this animal can walk: " + canWalk());
        System.out.println("this animal has " + getNoOfLegs() + " legs.");
        System.out.println("Eats :" + Arrays.toString(getEats()));
        System.out.println("Animal in Types of "+getEatTypes());

    }
}
