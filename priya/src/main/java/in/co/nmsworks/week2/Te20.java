package in.co.nmsworks.week2;

/*20. Given an integer x, Write a Program to check whether x is Prime or not ?
        E.g (1) Input: x = 7; Output: Prime E.g (2) Input: x = 10; Output: Not Prime*/
public class Te20 {
    public void isPrime(int n) {

        if (n > 2) {
            boolean prime = true;

            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }


            if (prime) {
                System.out.println("Prime");
            }
            else {
                System.out.println("Not a Prime");
            }

        }
        else if (n == 2) {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }
}
