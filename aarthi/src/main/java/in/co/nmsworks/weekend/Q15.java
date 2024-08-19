package in.co.nmsworks.weekend;
/*
Given a 3 digit number, write a program to print the hundred position value in words.
E.g 1: Input : 542 Output : Five.
E.g 2: Input : 777 Output : Seven.
 */

public class Q15 {
    public void hundredpos(int num){

            if(num/100==1){
                System.out.println("one");
            } else if (num/100==2) {
                System.out.println("two");
            }else if (num/100==3) {
                System.out.println("Three");
            }else if (num/100==4) {
                System.out.println("four");
            }else if (num/100==5) {
                System.out.println("five");
            }else if (num/100==6) {
                System.out.println("six");
            }else if (num/100==7) {
                System.out.println("seven");
            }else if (num/100==8) {
                System.out.println("eight");
            }else if (num/100==9) {
                System.out.println("nine");
            }else {
                System.out.println("number not found");
            }


    }
}
