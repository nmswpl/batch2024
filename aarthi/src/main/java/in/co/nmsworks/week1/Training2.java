package in.co.nmsworks.week1;
/*
Write a program to check if two words are palindrome
 */

public class Training2
{
    public void palindrome(String palindromeword)
    {
        for( int i = palindromeword.length()-1; i >= 0; i--)
        {
            String[] array=palindromeword.split("",-1);
            for ( int j = array.length-1; j >= 0; j--)
            {
                System.out.println(i);

            }
            System.out.println();
        }
    }
}
