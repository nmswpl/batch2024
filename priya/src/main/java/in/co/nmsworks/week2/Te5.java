package in.co.nmsworks.week2;
/*5. Write a program to check if a given Character is a Vowel or Consonant.*/
public class Te5 {
    public void vowelTest(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            System.out.println(c + " is a vowel");
        } else {
            System.out.println(c + " is a consonant");
        }
    }

}
