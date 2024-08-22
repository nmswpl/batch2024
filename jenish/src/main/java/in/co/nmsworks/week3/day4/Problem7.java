package in.co.nmsworks.week3.day4;

public class Problem7 {
    public void findGcd(int num1, int num2){
        int gcd = 1;
        for (int i = 1; i <= num1 && i <= num2 ; i++) {
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
        }
        System.out.println("Gcd is "+gcd);
    }
}