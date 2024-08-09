package in.co.nmsworks.week1;

import java.util.Scanner;

/*
        1. Write a program to reverse words in a Sentence.

        Input : India is my country.

        Output:	country my is India.
*/
class Training1 {

    private String input;

    public Training1(String input) {
        this.input = input;
    }

    public void reverseWord() {

        String[] arr = input.split(" ");

        for (int i = arr.length - 1; i >= 0; i--) {
            if (i != 0) {

                System.out.print(arr[i] + " ");
            }
            else {
                System.out.println(arr[i]);
            }
        }
    }
}
