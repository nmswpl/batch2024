package in.co.nmsworks.week1;

/*
 * Given a number as String, write a program that removes the leading 0
	Input :	0005640
	output:	5640
 */

public class Training4 {
    public void toRemoveLeadingZero(String s){
        int idxOfAns = 0;
        while((idxOfAns < s.length() - 1) && (s.charAt(idxOfAns) == '0')){
            idxOfAns++;
        }
        System.out.println(s.substring(idxOfAns));
    }
}