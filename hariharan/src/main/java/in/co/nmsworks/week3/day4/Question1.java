package in.co.nmsworks.week3.day4;

public class Question1 {
    public Question1() {
        for(int i =1;i<=100;i++){
            if(i % 15 == 0){
                System.out.println("FizzBuzz");
            }else if( i % 5 == 0){
                System.out.println("Buzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else{
                System.out.println(i);
            }
        }
    }
}
