package in.co.nmsworks.week1;


 /*

Write a Java program to remove duplicate characters from a string while preserving the order of the first occurrences.
	Input: "aabbcc"
	Output: "abc"
*/

public class Training7 {
    public Training7()
    {
   // public static void main(String[] args) {
        String s="aabbhwieoccc";
        String str="";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '&')
            {
                System.out.print(s.charAt(i));
                s = s.replace(s.charAt(i), '&');
            }
        }
System.out.println();
    }
}
