package in.co.nmsworks.week1;/*
8. Write a Java method to convert a every word in a sentance to title case, where the first letter of each word is capitalized.
        Input : "the quick brown fox jumps over the lazy dog";
Output: "The Quick Brown Fox Jumps Over The Lazy Dog"*/
public class Training8 {
    String s1 = "";

    public void capitalizeEachWord(String s) {
        String[] arr = s.split(" ");
        for(String w: arr) {
            String first = w.substring(0, 1);
            String last = w.substring(1);
            System.out.print(first.toUpperCase() + last+" ");
        }
        System.out.println(s1);

    }
}
