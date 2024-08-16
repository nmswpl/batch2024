package in.co.nmsworks.week1;
/*1. Write a program to reverse words in a Sentence.
        Input : India is my country.
Output:	country my is India.*/
public class Training1 {
    public void reverseString(String string){

        String[] arr = string.split(" ");


     for(int i=arr.length-1;i>=0;i--) {
            System.out.print(arr[i]+" ");
        }

    }
}
