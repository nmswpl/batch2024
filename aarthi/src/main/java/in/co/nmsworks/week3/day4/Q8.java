package in.co.nmsworks.week3.day4;
/*
Write a program to find the mean of an array.
        The mean is the result of dividing the sum of the elements by the number of elements.
 */

public class Q8 {
    public void meanOfArray(int... arr) {
        double sum = 0;
        int count = 0;
        double average;
        for (int number : arr) {
            sum = sum + number;
            count++;
        }
        average = sum/count;
        System.out.println("The average of array :: "+average);
    }
}
