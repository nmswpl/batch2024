package in.co.nmsworks.week3.Day4;
/*Problem-1: Write a program that prints numbers from 1 to 100. For multiples of 3, print "Fizz" instead of the number. For multiples of 5, print "Buzz". For multiples of both 3 and 5, print "FizzBuzz".*/
public class Q1 {
    public void multiples(){
        for (int i = 1; i <=100 ; i++) {
             if ((i%3==0)&&(i%5==0))  {
                System.out.println("Fizz-Buzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }else if (i%5==0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }

    }
}