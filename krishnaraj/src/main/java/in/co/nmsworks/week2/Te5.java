package in.co.nmsworks.week2;

/***
 * Write a program to check if a given Character is a Vowel or Consonant.
 */
public class Te5 {
    public void checkVandC(char charVal){
        String vowel="aeiouAEIOU";
        if (vowel.indexOf(charVal) != -1){
            System.out.println("This is vowel letter : "+charVal);
        }
        else{
            System.out.println("this is an consonent : "+charVal);
        }
    }
}
