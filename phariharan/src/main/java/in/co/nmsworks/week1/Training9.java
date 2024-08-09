package in.co.nmsworks.week1;

/**
 * Write a Java method to find the longest word in a given sentence.
 * 	Input: "The quick brown fox jumps over the lazy dog"
 * 	Output: "jumps"
 */

public class Training9 {
     public void getLongestWord(String str){
         System.out.println(str);
         String[] array1 = str.split(" ");
         int index = 0,max = 0 ;

         for (int i = 0; i < array1.length; i++) {
             if (array1[i].length()>=max){
                 max = array1[i].length();
                 index = i;
             }
         }
         System.out.println(array1[index]);
     }
}
