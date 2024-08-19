package in.co.nmsworks.weekend;
/*
20. Given an integer x, Write a Program to check whether x is Prime or not ?
E.g (1) Input: x = 7; Output: Prime E.g (2) Input: x = 10; Output: not prime
 */
public class Q4 {
    int count=0;
    public void primenumbers(int num){
        if(num==2){
            System.out.println( "prime");
        }else {
            for (int i = 1; i <= num; i++) {
                if(num / i==0){
                    count++;
                }
            }
        }
        if (count==2){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }



}
