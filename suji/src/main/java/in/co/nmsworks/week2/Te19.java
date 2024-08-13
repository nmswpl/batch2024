package in.co.nmsworks.week2;

//Given a String, Write a program to find if the string is palindrome or Not.
//E.g (1) Input: str = “level”; Output: Palindrome
//E.g (2) Input: str = “abc”; Output: Not Palindrome


class Te19
{
public Te19()
{ // public static void main(String[] args) {
    String s = "level";
    String str="";
    for (int i = (s.length()-1); i >= 0; i--) {
        str= str.concat(String.valueOf((s.charAt(i))));
    }
    System.out.println(str);
    if(s.equals(str))
    {
        System.out.println("PALINDROME WORD");
    }
    else
        System.out.println(" Not a palindrome word");
}
}
