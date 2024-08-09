package in.co.nmsworks.week1;


/**
 * 1. Write a program to reverse words in a Sentence.
 * Input : India is my country.
 * Output:	country my is India.
 */
public class Training1 {
    String string1;
    public void reverseWord(String s1){
        String[] array = s1.split(" ");
        int length = array.length - 1;
        System.out.println(s1);
        while (length >= 0) {
            System.out.print(array[length] + " ");
            length--;
        }
    }
}
