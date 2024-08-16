package in.co.nmsworks.week2;

public class Te19 {
    public  void ispalindrome(String str)
    {
        String reversestr = " ";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversestr+=str.charAt(i);

        }
        reversestr=reversestr.trim();
        if(reversestr.equals(str)){
            System.out.println("given string is palindrome");
        }
        else {
            System.out.println("given string is not a palindrome");
        }

    }
}
