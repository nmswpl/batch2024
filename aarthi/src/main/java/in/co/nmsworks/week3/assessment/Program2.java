package in.co.nmsworks.week3.assessment;
import jdk.nashorn.internal.parser.Scanner;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
/*
Write a program to find if a given number (less than 1000) is prime or not using Set.
 */

public class Program2 {
    int count = 0;
    Set<Integer> num=new HashSet<>();
    public void primeNum() {
        for(int i = 1;i < 1000;i++){
            if ( i == 2) {
                num.add(i);
                System.out.println("Prime");
            }
            else if (i % i == 0) {
                num.add(i);
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not a Prime");
        }
        int[]arr={3,64,78,89};
        for (arr array : num){
            System.out.println(array);
        }
    }
}

