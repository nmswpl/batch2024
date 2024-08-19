package in.co.nmsworks.week3.assessment;

import java.util.*;

//Given an array of integers, Write a Program to count and print number of even elements in the array.

public class TestExersice2 {
    public TestExersice2() {
        int count = 0;
      Integer[] numbers = {23,346,46,12,45,4656};
      for(Integer number : numbers){
          if(number % 2 == 0){
              count++;
              System.out.println(number);
          }
      }

        System.out.println("Number of Even Elements: "+count);

    }
}
