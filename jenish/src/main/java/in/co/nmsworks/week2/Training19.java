package in.co.nmsworks.week2;

public class Training19 {
    public boolean isPalindrome(String s){
        int j = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
}