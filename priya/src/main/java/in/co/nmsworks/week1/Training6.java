package in.co.nmsworks.week1;
/*6. Write a Java program to count the number of vowels and consonants in a given string.
Input: "Hello World"
Output: Vowels: 3, Consonants: 7*/
public class Training6 {

    int vowelCount=0;

    int consonantCount=0;

    public void printVowelsConsonants(String str){

        for(int i=0;i<str.length();i++) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ||
                    str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                vowelCount++;
            }
            else{

                if(str.charAt(i)!=' '){
                    consonantCount++;
                }
            }
        }
            System.out.println("The number of vowels is:" + vowelCount);

            System.out.println("The number of consonants are:" + consonantCount);

        }
    }

