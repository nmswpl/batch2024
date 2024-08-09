package in.co.nmsworks.week1;

/**
 * Write a Java method to convert a every word in a sentance to title case, where the first letter of each word is capitalized.
 * 	Input : "the quick brown fox jumps over the lazy dog";
 * 	Output: "The Quick Brown Fox Jumps Over The Lazy Dog"
 */

public class Training8 {
    public void capitalize(String str){
        System.out.println(str);
        String[] array1 = str.split(" ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (String.valueOf(array1[i].charAt(0)).toUpperCase()).concat(array1[i].substring(1));
        }
        int i=0;
        while (i <= array1.length-1) {
            System.out.print(array1[i] + " ");
            i++;
        }

    }

}
