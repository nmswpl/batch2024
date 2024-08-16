package in.co.nmsworks.week2;

import java.util.Scanner;

/* 8. Given a 3 digit number, write a program to print the hundred position value in words.
E.g 1: Input : 542 Output : Five.
E.g 2: Input : 777 Output : Seven. */
public class Te8 {
        int num = 542;
        int hundred = num / 100;
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        public void hundredPos(){
            System.out.println(words[hundred]);
        }
}
