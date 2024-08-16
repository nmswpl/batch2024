package in.co.nmsworks.week1;

/**
 * Given a number as String, write a program that removes the leading 0
 *
 * 	Input :	0005640
 *
 * 	output:	5640
 */
public class Training4 {
    public void removeZero() {
        String str="0001234500";
        int startIndex=0;
        while(startIndex<str.length() && str.charAt(startIndex)=='0'){
            startIndex++;
        }
        System.out.println("the final output : "+str.substring(startIndex));
    }
}