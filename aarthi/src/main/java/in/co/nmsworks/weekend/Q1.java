package in.co.nmsworks.weekend;
/*
write a program to reverse words in a sentence.
Input:India is my country.
Output:country my is India.
 */

public class Q1
{
    public void reverseString(String string)
    {
        String[] arr=string.split(" ");
        for (int i = arr.length-1; i >=0 ; i--)
        {
            System.out.println(arr[i]+" ");

        }
    }
}
