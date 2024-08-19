package in.co.nmsworks.week1;


/*

Write a Java program to count the number of vowels and consonants in a given string.
	Input: "Hello World"
	Output: Vowels: 3, Consonants: 7

 */



public class Training6
{
public Training6()
{                  //    public static void main(String[] args) {
        String s="Hello World";
        int vowel=0;
        int cons=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                if ((s.charAt(i) == 'a') || (s.charAt(i) == 'A') || (s.charAt(i) == 'e') ||
                        (s.charAt(i) == 'E') || (s.charAt(i) == 'i') || (s.charAt(i) == 'I') || (s.charAt(i) == 'o') || (s.charAt(i) == 'O') || (s.charAt(i) == 'u') || (s.charAt(i) == 'U')) {
                    vowel = vowel + 1;
                } else cons = cons + 1;
            }
        }
        System.out.println("Vowel ="+vowel);
        System.out.println("Const ="+cons);
    }
}
