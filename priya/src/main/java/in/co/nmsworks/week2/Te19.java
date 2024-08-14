package in.co.nmsworks.week2;
/*19. Given a String, Write a program to find if the string is palindrome or Not.
        E.g (1) Input: str = “level”; Output: Palindrome
E.g (2) Input: str = “abc”; Output: Not Palindrome*/
public class Te19 {
    public void isPalindrome(String s){
        String rev="";
        for (int i = s.length()-1; i>=0;i--) {
            rev = rev+ s.charAt(i);
        }
      if(s.equalsIgnoreCase(rev)){
          System.out.println("Palindrome");
      }
      else{
          System.out.println("Not a Palindrome");
      }

    }
}
