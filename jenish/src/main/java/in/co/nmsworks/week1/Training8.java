package in.co.nmsworks.week1;

/*
 * Write a Java method to convert every word in a sentence to title case, where the first letter of each word is capitalized.
 */

public class Training8 {
    public void convertToTitleCase(String s){
        String[] arr = s.split(" ");
        String res = "";
        for (int i = 0; i < arr.length ; i++) {
            String temp = "";
            temp += arr[i].substring(0,1).toUpperCase();
            res += temp + arr[i].substring(1) + " ";
        }
        System.out.println(res);
    }
}