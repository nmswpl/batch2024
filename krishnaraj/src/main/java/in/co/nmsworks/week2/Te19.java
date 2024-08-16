package in.co.nmsworks.week2;

/**
 * Writing a program to given string is palinrome or not
 */
public class Te19 {
    public void checkPalinrome(){
        String strValue="dad";
        String reverseStr = "";
        for (int i = strValue.length()-1; i >= 0; i--) {
            reverseStr=reverseStr+strValue.charAt(i);
        }
        if(strValue.equals(reverseStr)){
            System.out.println("This is an palinrome");
        }
        else {
            System.out.println("This is not an palinrome");
        }
    }
}
