package in.co.nmsworks.week2;

/**\
 * Write a program to print all numbers between 200 and 500 ending with 7.
 */

public class Te10 {

    public void endingWithSeven(){
        for (int i = 200; i <501 ; i++) {
            if(i%10==7){
                System.out.println("Ending with Seven  ::"+i);
            }

        }
    }
}