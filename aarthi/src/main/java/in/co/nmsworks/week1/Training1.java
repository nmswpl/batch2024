package in.co.nmsworks.week1;
/*
*Write a program to reverse words in a Sentence.
*/

public class Training1
{
    public void reverse(String reverseString)
    {
        String[] array = reverseString.split(" ");
        for( int i = array.length-1; i >= 0; i--)
        {
            System.out.print(array[i]+" ");

        }

    }

}
