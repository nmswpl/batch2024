package in.co.nmsworks.week1;

/*
 * Write a program to reverse words in a Sentence.
	Input : India is my country.
	Output:	country my is India.
 */

public class Training1 {
        public void reverse(String s) {
                String[] arr = s.split(" ");
                for (int i = arr.length -1; i >= 0 ; i--) {
                        System.out.print(arr[i]+ " ");
                }
        }
}