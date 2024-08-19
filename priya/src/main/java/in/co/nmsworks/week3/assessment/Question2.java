package in.co.nmsworks.week3.assessment;/*
2) Given an array of integers, Write a Program to count and print number of even elements in the array.*/
public class Question2 {

    public  void printEvenCount(int[] arr) {

         int count=0;
        System.out.println("The even elements are:");
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]%2==0){
                count++;
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        System.out.println("The number of even elements are "+count);
    }

    public static void main(String[] args) {
        Question2 q2 = new Question2();
        int[] arr = {1,2,3,4,5,6};
        q2.printEvenCount(arr);
    }
}
