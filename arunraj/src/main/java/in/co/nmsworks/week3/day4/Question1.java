package in.co.nmsworks.week3.day4;

/*Write a program that prints numbers from 1 to 100.
 For multiples of 3, print "Fizz" instead of the number. For
 multiples of 5, print "Buzz". For multiples of both 3 and 5, print "FizzBuzz".
 */


public class Question1 {
    public static void main(String[] args) {
        Question1 q1 = new Question1();
        q1.buzzFizzBuzz(21);
        //String result = 8 == 8 ? "Equals" : "NotEquals";

    }

    public void buzzFizzBuzz(int a){
        for(int i=1; i <= 100;i++){
            if(a % 3 == 0){
                System.out.println("Fizz");
                break;
            }
            else if (a % 5 == 0){
                System.out.println("FizzBuzz");
                break;
            }
            else {
                break;
            }
        }
    }
}
