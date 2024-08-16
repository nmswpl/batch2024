package in.co.nmsworks.week1;
/*. Write a program to check if two words are palindrome
Input : dad
Output: Palindrome*/
public class Training2 {
    String revstr ="";
public void isPalindome(String str){
    for(int i=str.length()-1;i>=0;i--){
       revstr +=str.charAt(i);
    }

    if(revstr.equals(str)){
        System.out.println("The String"+str+" is a palindrome");
    }
    else
    {
        System.out.println("The String "+str+"is not a palindrome");
    }
}
}
