package in.co.nmsworks.week2;

/*** check the given number is prime number or not
 *
 */
public class Te20 {
    public void primeOrNot(int number) {
        if (number <= 1 || number%2==0) {
            System.out.println("Not an prime");
            return;
        }
        if (number == 2) {
                System.out.println("this is an peime");
                return;
        }
        for (int i = 3; i <= number; i++) {
            if (number % i==0){
                System.out.println("not an prime");
                return;
            }
        }
        System.out.println("this is an prime number");
    }
}
