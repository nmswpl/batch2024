package in.co.nmsworks.week3.assesment.weekend1;
/* Write a program that takes an integer as input and prints
whether the number is positive, negative, or zero.
 */

public class WeQn1 {
    public void positiveOrNegative(int number){
        if (number > 0){
            System.out.println(number + " is positive number");
        } else if (number < 0) {
            System.out.println(number + " is negative number");
        } else {
            System.out.println("Zero");
        }
    }
}
