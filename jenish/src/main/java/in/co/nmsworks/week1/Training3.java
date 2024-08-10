package in.co.nmsworks.week1;

/*
 * Given a string str, write a Java program to print all words with even length in the given string.
 */

public class Training3 {
    public void toFindEvenLenWord(String s) {
        String[] arr = s.split(" ");
        for (String string : arr) {
            if ((string.length()) % 2 == 0) {
                System.out.println(string);
            }
        }
    }
}