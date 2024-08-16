package in.co.nmsworks.week1;
/***
 *  Write a program to reverse words in a Sentence.
 *
 * 	Input : India is my country.
 *
 * 	Output:	country my is India.
 */
public class Tranining1 {
    public void reverseString(String sentence){
        String[] array1=sentence.split(" ");
        int number=array1.length-1;
        for(int i=number ; i>=0; i--){
            System.out.print(array1[i]+" ");
        }
    }
}
