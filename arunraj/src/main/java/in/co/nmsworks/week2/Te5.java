package in.co.nmsworks.week2;

/*Write a program to check if a given Character is a Vowel or Consonant*/

public class Te5 {
    public void vowelConsonant(char ch){
        switch (ch){
            case 'a':
            case 'o' :
            case 'e':
            case 'i' :
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
                break;
        }
    }
}
