package in.co.nmsworks.week3.day5;

/*Write a program that removes all spaces
from a given string and prints the result.
 */

public class ReplaceAllSpaces {
    public static void main(String[] args) {
        String str = "  I am  a Stu dent";
        String str1 = str.replaceAll("[\"\\s]","");
        System.out.println(str1);
    }
}
