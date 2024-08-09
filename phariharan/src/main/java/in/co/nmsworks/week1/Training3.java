package in.co.nmsworks.week1;
//
///**
// * Given a string str, write a Java program to print all words with even length in the given string.
// * 	Input	: s = "This is a java language"
// * 	Output	: This
// * 		  is
// * 		  java
// * 		  language
// */
//
public class Training3 {
    String string1;
    public void evenWordPrinter(String s1){
        String[] array = s1.split(" ");
        System.out.println(s1);
        int i = 0;
        while (i <= array.length-1) {
            if (array[i].length() % 2 == 0){
                System.out.println(array[i] + " ");
            }
            i++;
        }
    }
}
