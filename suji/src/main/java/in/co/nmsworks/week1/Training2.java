package in.co.nmsworks.week1;

//   A program to check if two words are palindrome
//	Input : dad
//	Output: Palindrome



public class Training2 {
  public Training2()
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
