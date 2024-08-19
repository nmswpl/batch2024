package in.co.nmsworks.weekend;
/*
Given a string str,write a java program to print all words with even length in the given string
Input:s="This is a java language'
Output=This
is
java
language
 */

public class Q3 {
    public void evenlenword(String string){
        String[] stringarr = string.split(" ");
        for (int i = 0; i < stringarr.length; i++) {
            if(stringarr[i].length()%2==0){
                System.out.println(stringarr[i]);
            }
        }

    }

}
