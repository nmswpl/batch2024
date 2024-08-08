package in.co.nmsworks.week1;

/* to print a star pattern
   *
   * *
   * * *
   * * * *
   * * * * *
   * * * * * *
   * * * * * * *

 */

public class Question8
{
    public static void main(String args[])
    {

        for (int i = 1; i <= 7; i++)
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
