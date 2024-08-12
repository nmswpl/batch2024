package in.co.nmsworks.week2;

/**
 * Given an integer x, Write a Program to check whether x is Prime or not ?
 * E.g (1) Input: x = 7; Output: Prime E.g (2) Input: x = 10; Output: Not Prime
 */
public class TE20 {
    public void isPrime(int num2){
        boolean isPrime1 = true;
        for (int i = 2; i <= num2/2 ; i++) {
            if (num2 % i == 0){
                isPrime1 = false;
                break;
            }
        }
        if (isPrime1){
            System.out.print(num2+" a Prime");
        }
        else {
            System.out.println(num2+" is Not prime");
        }
    }
}
