package in.co.nmsworks.week2;

/**
 * Write a program to print all even numbers between 601 and 700 in descending order
 */

public class Question1 {
    public static void main(String[] args) {
        int i=700;
        for( i=700;i>=601;i--){
            if(i%2==0){
                System.out.println(i);
            }
        }


    }
}
