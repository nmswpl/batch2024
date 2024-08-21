package in.co.nmsworks.week3.homework.setc2;

import java.util.HashSet;
import java.util.Set;

public class Question4 {
    Set<Integer> divisibleByEightSet = new HashSet<>();
    public void divisibleByEight(int num){
        if(divisibleByEightSet.contains(num)){
            System.out.println(num+" is divisible by 8.");
        }
        else{
            System.out.println(num+" is not divisible by 8.");
        }
    }
    public void compute(){
        for (int i = 1; i <= 1000 ; i++) {
            if(i % 8 == 0){
                divisibleByEightSet.add(i);
            }
        }
    }

    public static void main(String[] args) {
        Question4 q4 = new Question4();
        q4.compute();
        q4.divisibleByEight(30);
    }
}