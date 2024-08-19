package in.co.nmsworks.weekend;
/*
Write a program to print all numbers between 200 and 500 ending with 7.
1
 */

public class Q13 {
    public void endswith7(){
        for (int i = 200;i < 500; i++) {
            if(i % 10 == 7 ){
                System.out.println(i);
            }

        }
    }
}
