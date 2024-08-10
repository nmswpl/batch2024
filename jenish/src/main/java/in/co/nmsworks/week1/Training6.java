package in.co.nmsworks.week1;

/*
 * Write a Java program to count the number of vowels and consonants in a given string.
	Input: "Hello World"
	Output: Vowels: 3, Consonants: 7
 */

public class Training6 {
    public void noOfVowelsAndConsonants(String s){
        s = s.toLowerCase();
        int countOfVowels = 0;
        int countOfConsonants = 0;
        for (int i = 0; i < s.length() ; i++) {
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                countOfVowels += 1;
            }
            else if(c == ' ' || c == ',' || c == '.' || c == '-'){
                continue;
            }
            else{
                countOfConsonants += 1;
            }
        }
        System.out.println("Vowels : "+countOfVowels);
        System.out.println("Consonants : "+countOfConsonants);
    }
}