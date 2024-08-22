package in.co.nmsworks.week3.day4;
//Write a program to find the second-largest number in an array.

public class Program5 {
    public static void main(String[] args) {
        new Program5().secondLargestValue(77,83,56,22,14,35,76,78,81);
    }
    public void secondLargestValue(int... arr){
        int max=0,secmax=0;
        for (int i = 0; i < arr.length; i++) {
            // Update the largest and second largest accordingly
            if (arr[i] > max) {
                secmax = max;
                max = arr[i];
            } else if (arr[i] > secmax && arr[i] < max) {
                secmax =arr[i];
            }
        }

        System.out.println("Second largest number in the array"+secmax);

    }
}