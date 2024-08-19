package in.co.nmsworks.weekend;

public class Q2 {
    public void palindrome(String str){
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("Not a palindrome");
            }
            i++;
            j--;

        }
        System.out.println("Palindrome");
    }
}