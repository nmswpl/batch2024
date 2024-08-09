package in.co.nmsworks.week1;

/**
 * Write a Java program to count the number of vowels and consonants in a given string.
 * 	Input: "Hello World"
 * 	Output: Vowels: 3, Consonants: 7
 */

public class Training6 {
    public void countVowels(String str){

        System.out.println(str);
        str = str.replace(" ","");
        int length = str.trim().length();
        int i = 0;
        int consonant = 0,vowels = 0;
        while (i < length) {
            switch (str.charAt(i)){
                case 'a':
                    vowels ++;
                    break;
                case 'e':
                    vowels ++;
                    break;
                case 'i':
                    vowels ++;
                    break;
                case 'o':
                    vowels ++;
                    break;
                case 'u':
                    vowels ++;
                    break;
                default:
                    consonant++;
                    break;            }
            i++;
        }
        System.out.println("No of Consnant : "+consonant+"\n No Of Vowels :"+vowels);
    }
}
