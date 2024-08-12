package in.co.nmsworks.week2;
/*
Write a program to print all even numbers between 601 and 700 in descending order
 */

public class Te1
{
        public void train1()
        {
           int n1=601 ,n2= 700;
            for (int i = 700; i % 2==0 ; i--)
                for (int j = 601; j <=i; j++) {
                    System.out.println( i);
                }

        }
}