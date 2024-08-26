package in.co.nmsworks.week1;
/*
Given a string str, write a Java program to print all words with even length in the given string.
 */

public class Training3 {
    public void evenString(String evenstring)
    {
        String[] array=evenstring.split(" ");
        for(int i=0;i<=array.length-1;i++)
        {
            if (array[i].length()%2==0)
            {
                System.out.println(array[i]);
            }
            else
                System.out.println();
        }
    }
}
