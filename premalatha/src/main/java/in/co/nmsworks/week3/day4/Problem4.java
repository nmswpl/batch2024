package in.co.nmsworks.week3.day4;
/*
Implement the algorithm to find the min and max elements in an array of integers.
 */

public class Problem4 {
    public void minAndMaxValues(){
        int[] values = {12, 45, 35, 60, 65};
        int min = 0;
        int max = 0;
        for (int i = 0; i < values.length; i++) {
            min = values[0];
            if (min >= values[i])
            {
                min = values[i];
            }
            max = values[0];
            if(max <= values[i])
            {
                max = values[i];
            }
        }
        System.out.println("Minimum element = " + min);
        System.out.println("Maximum element = " + max);
    }
}
