package in.co.nmsworks.week2;

/*Given a String, Write a program to find if the string is palindrome or Not.
        E.g (1) Input: str = “level”; Output: Palindrome
E.g (2) Input: str = “abc”; Output: Not Palindrome*/

public class Te19 {
    public void palindrome(){
        String str= "level";
        String str1="";
        String[] ch=str.split("");
        for (int i=str.length()-1;i>=0;i--){
            str1=ch[i];
        }
        if(str.equals(str1)){
            System.out.println(str+" is Palindrome");
        }
    }
}
