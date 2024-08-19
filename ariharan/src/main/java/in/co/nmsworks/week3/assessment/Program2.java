package in.co.nmsworks.week3.assessment;
//Given an array of integers, Write a Program to count and print number of even elements in the array

public class Program2 {
    public void printEven(){
        int[] numbers=new int[100];
        int k=0,count=0;
        for (int i = 500; i <600 ; i++) {
            numbers[k]=i;
            k++;
        }
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2==0){
                count++;
                System.out.println(numbers[i]);
            }
        }
        System.out.println("the count of the even numbers in the array is "+count);
    }
}
