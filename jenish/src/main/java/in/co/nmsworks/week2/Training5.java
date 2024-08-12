package in.co.nmsworks.week2;

public class Training5 {
    public void checkVowelOrConsonant(char c){
        c = Character.toLowerCase(c);
        if(c == 'a'|| c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            System.out.println("It is an Vowel");
        }
        else{
            System.out.println("It is a Consonant ");
        }
    }
}