package in.co.nmsworks.week3.day4;

public class Problem1 {
    public void fizBuzz(){
        for (int i = 1; i <= 100 ; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
        }
    }
}