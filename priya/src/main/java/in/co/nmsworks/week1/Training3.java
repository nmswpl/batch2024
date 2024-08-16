package in.co.nmsworks.week1;
/*3. Given a string str, write a Java program to print all words with even length in the given string.
Input	: s = "This is a java language"
Output	: This
        is
java
        language*/
public class Training3 {
    public void printEvenLengthString(String str){
        String[] arr = str.split(" ");
        for(int i=0; i<=arr.length-1;i++){
            if(arr[i].length()%2 == 0){
                System.out.println(arr[i]);
            }
        }
    }
}
