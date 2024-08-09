package in.co.nmsworks.week1;

import java.util.Scanner;

/*
4. Given a number as String, write a program that removes the leading 0

	Input :	0005640

	output:	5640
 */
class Training4 {

    private String input;

    public Training4(String input){
        this.input = input;
    }
    public void removeLeadingZeros() {
        int len = input.length() - 1;
        int index = 0;

        for (int i = 0; i < len; i++) {
            if (input.charAt(i) != '0') {
                break;
            }
            index += 1;
        }
        System.out.println(input.substring(index));
    }
}
