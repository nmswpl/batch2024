package in.co.nmsworks.week3.day4;
//Write a program that prints numbers from 1 to 100. For multiples of 3, print "Fizz"
//instead of the number. For multiples of 5, print "Buzz". For multiples of both 3 and 5, print "FizzBuzz".

public class Program1 {
    public static void main(String[] args) {
        new Program1().printNumber();
    }
    public void printNumber(){
        for (int i = 1; i <=100; i++) {
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz ");
            } else if (i%3==0) {
                System.out.println("Fizz ");
            } else if (i%5==0) {
                System.out.println("Buzz ");
            }
        }
    }
}
