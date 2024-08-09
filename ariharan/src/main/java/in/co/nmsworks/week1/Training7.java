package in.co.nmsworks.week1;
//Write a Java program to remove duplicate characters from a string while preserving the order of the first occurrences.
//        Input: "aabbcc"
//Output: "abc"


import java.util.Scanner;

public class Training7 {
    public void removeDuplicates(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence:");
        String words = sc.nextLine();
        String remdup="";
        for (int i = 0; i <words.length() ; i++) {
            String s = String.valueOf(words.charAt(i));
            if(remdup.contains(s)){

            }
            else{
                remdup+=s;
            }

        }
        System.out.println("After removing duplicates in your words :"+ remdup);

    }
}
