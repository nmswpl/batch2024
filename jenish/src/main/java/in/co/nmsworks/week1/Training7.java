package in.co.nmsworks.week1;

/*
 * Write a Java program to remove duplicate characters from a string while preserving the order of the first occurrences.
	Input: "aabbcc"
	Output: "abc"
 */

public class Training7 {
    public void removeDuplicates(String s){
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) {
                continue;
            }
            ans += s.charAt(i);
        }
        System.out.println(ans);
    }
}