package in.co.nmsworks.week3.day4;
/*
Write a program to find the mean of an array.
        The mean is the result of dividing the sum of the elements by the number of elements.
 */

public class Program8 {
    public void findMean(){
        int[] array = {1, 2, 3, 4, 5};
        int count = 0;
        int sum = 0;
        int mean;
        for (int i = 0; i < array.length; i++) {
            count++;
            sum += array[i];
        }
        mean = sum / count;
        System.out.println("Mean of an array = " + mean);
    }
}
