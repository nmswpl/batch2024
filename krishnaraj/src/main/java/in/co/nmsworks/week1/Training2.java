package in.co.nmsworks.week1;

/***
 * Write a program to check if two numbers are palindrome
 *
 * 	Input : dad
 *
 * 	Output: Palindrome
 */
public class Training2 {
        public void checkPalindrome(String sentence2){
            String reversedWord="";
            int sentenceLength= sentence2.length()-1;
            for (int i =sentenceLength; i >=0; i--) {
                String temp=String.valueOf(sentence2.charAt(i));
                reversedWord=reversedWord.concat(temp);
            }
            if(sentence2.equalsIgnoreCase(reversedWord)){
                System.out.println("This word is Palindrome : "+sentence2);
            }else {
                System.out.println("This word is not Palindrone : "+sentence2);
            }
    }
}
