package in.co.nmsworks.week2;

/**
 *  Write a program to print all numbers divisble by 3 greater than 300 and less than 400.
 */
public class TE9 {
        public void divisibleBy3(int starting,int ending){
            System.out.println("The Below numbers are divisible by 3 :");
            for (int i = starting; i < ending ; i++) {
                if (i % 3 == 0){
                    System.out.print(i+" ,");
                }
            }
        }
}
