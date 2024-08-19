package in.co.nmsworks.weekend;
/*
Two words are palindrome
 */

public class Q2 {
    public void palindrome(String string){
        String reversedString="";
        for (int i = string.length()-1; i >=0; i--) {
            char c = string.charAt(i);
            reversedString = reversedString + c;
        }
        if(string.equals(reversedString))
        {
            System.out.println("palindrome");
        }
        else {
            System.out.println("is not Palindrome");
        }

    }

}
