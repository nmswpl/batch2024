package in.co.nmsworks.week3.assessment;
/*3) Write a program to find if a given number (less than 1000) is prime or not using Set.*/
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Question3 {
    public static void main(String[] args) {
        Set<Integer> prime = new HashSet<>();
        Scanner s = new Scanner(System.in);
        prime.add(2);
        for (int i = 1; i <1000 ; i++) {
            prime.add(i);
        }
        for (int i = 3; i <1000 ; i++) {

            for (int j = 2; j <i; j++) {
                if (i%j== 0) {
                    prime.remove(i);
                }
            }
        }
        while(true){
            s.nextInt();
            if(s.nextInt() ==-1){
                break;
            }
            if(prime.contains(s.nextInt())){
                System.out.println("prime");
            }
        }



    }
}

