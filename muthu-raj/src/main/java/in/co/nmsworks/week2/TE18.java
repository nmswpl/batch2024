package in.co.nmsworks.week2;

import java.lang.annotation.Target;

public class TE18 {

    public void numberOfOccurrance(int[] arr,int target){

        int count = 0;

        for (int i : arr) {

            if (i == target){
                count += 1;
            }
        }

        System.out.println("The element " +target+ " is present "+ count+ " time in the array");

    }
}
