package in.co.nmsworks.weekend;
/*
Write a program to print the multiplication table of 17 upto 10 numbers.
Expected Output : 17 x 1 = 17 ...... 17 x 10 = 170
 */

public class Question6 {
    public void multiplication(){
        int a = 17;
        for (int i = 1 ; i<=10 ;i++)
            System.out.println(a + " X " + i + " = " + a*i);
    }
}
