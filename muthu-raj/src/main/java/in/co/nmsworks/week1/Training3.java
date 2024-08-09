package in.co.nmsworks.week1;

import java.util.Scanner;

/*
3. Given a string str, write a Java program to print all words with even length in the given string.

	Input	: s = "This is a java language"

	Output	: This

		  is

		  java

		  language
 */
class Training3 {

    private String input;

    public Training3(String input) {
        this.input = input;
    }

    public void printEvenLengthWords() {

        String[] sent = input.split(" ");

        for (String s : sent) {
            if (s.length() % 2 == 0) {
                System.out.println(s);
            }
        }
    }
}
