package in.co.nmsworks.week2;
/*
Write a program to print the multiplication table of 17 upto 10 numbers.
Expected Output : 17 x 1 = 17 ...... 17 x 10 = 170
 */

public class Te6 {
    public void table()
    {
        int a=17;
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(a + " X " + i + " = " + a*i );
        }

    }
}
