package in.co.nmsworks.week1;

/***
 * Given a string str, write a Java program to print all words with even length in the given string.
 *
 * 	Input	: s = "This is a java language"
 *
 * 	Output	: This
 *
 * 		  is
 *
 * 		  java
 *
 * 		  language
 */
public class Training3 {
    public void printEvenWord(String sentence3){
        String[] array1=sentence3.split(" ");
        for (String i: array1) {
            if(i.length()%2==0) {
                System.out.println(i);
           }
        }
    }
}
