package in.co.nmsworks.week2;
/*
Write a program to print all even numbers between 601 and 700 in descending order
 */

public class Te1
{
        public void train1()
        {

            for (int i = 700; i > 601 ; i--) {
                if (i % 2 == 0)
                    System.out.println("Even numbers : " +i);

            }
        }
}