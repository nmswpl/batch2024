package in.co.nmsworks.week2;

/**
 * 11. Write a program to print the biggest of the 3 numbers
 * E.g : Input : 12, 24, 5 Output : 24 ; Input2 : 18, 18, 35 Output : 35
 */

public class Te11 {
    int a;
    int b;
    int c;
    public void biggestNum(){
        if(a>=b&&a>=c){
            System.out.println("The Biggest Num Is :: "+a);
        } else if (b>=a&&b>=c) {
            System.out.println("The Biggest Num Is :: "+b);


        }
        else{
            System.out.println("The Biggest Num Is :: "+c);
        }
    }
}
