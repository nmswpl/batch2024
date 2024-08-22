package in.co.nmsworks.week3.day4;
//Write a program to find the mean of an array.
//The mean is the result of dividing the sum of the elements by the number of elements.

public class Program8 {
    public static void main(String[] args) {
        new Program8().meanOfArray(2,4,6,8,10);
    }
    public void meanOfArray(int... arr){
        int len=arr.length;
        int sum=0;
        for (int value : arr) {
            sum+=value;
        }
        System.out.println("the mean the array is::"+(sum/len));
    }
}
