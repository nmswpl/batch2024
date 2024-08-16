package in.co.nmsworks.week1;

/***
 * Write a Java program to count the number of vowels and consonants in a given string.
 * 	Input: "Hello World"
 * 	Output: Vowels: 3, Consonants: 7
 */
public class Training6 {
    public void countVAndC(String str) {
        int vCount = 0;
        int cCount = 0;
        str = str.toLowerCase();
        String vowels = "aeiou";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) != -1) {
                    vCount++;
                } else {
                    cCount++;
                }
            }
        }
        System.out.println("Number of vowels: " + vCount);
        System.out.println("Number of consonants: " + cCount);
    }
}

