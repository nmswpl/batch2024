package in.co.nmsworks.week2.practice;

import java.util.Arrays;

public class WaterAnimals extends Animal{

    public boolean canSwim(){
        return true;
    }

    public void displayDetails(){
        System.out.println("can swim: " + canSwim());
        System.out.println("Eats :" + Arrays.toString(getEats()));
        System.out.println("Animal in Types of "+getEatTypes());
    }
}
