package in.co.nmsworks.week1;

/*1.Write a program to reverse words in a Sentence.
        Input : India is my country.
Output:	country my is India.*/

public class Training1 {
    public void reverseString() {
        String str = new String("India is my country");
        String[] str1 = str.split(" ");
        for (int i = str1.length - 1; i >= 0; i--) {
            System.out.print(str1[i]+" ");
        }
        System.out.println();
    }
}
