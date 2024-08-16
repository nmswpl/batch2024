package in.co.nmsworks.week2.collections;

import java.util.ArrayList;

public class Question7 {
    ArrayList<Integer> numbersList = new ArrayList<>();
    public boolean findElement(int searchElement){

        for (Integer i : numbersList) {
            if(i == searchElement){
                return true;
            }
        }
        return false;
    }
}
