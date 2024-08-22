package in.co.nmsworks.week3.assessment.day4;

/**
 * Write a program to find the second largest number in an array.
 */

public class Problem5 {
    public int getSecondLargest(int[] a){
        int temp;
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[a.length-2];
    }






}
