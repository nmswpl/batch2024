package in.co.nmsworks.week1;

import java.util.Scanner;

/*
6. Write a Java program to count the number of vowels and consonants in a given string.

	Input: "Hello World"

	Output: Vowels: 3, Consonants: 7
 */
class Training6 {
    private String input;

    public Training6(String input) {
        this.input = input;
    }

    public void countVowelsAndConsonants() {

        String vowels = "AEIOUaeiou";
        int vCount = 0;
        int cCount = 0;
        for (int i = 0; i < input.length(); i++) {

            if (vowels.contains(String.valueOf(input.charAt(i)))) {
                vCount += 1;
            } else if (input.charAt(i) == ' ' || input.charAt(i) == ',' || input.charAt(i) == '.' || input.charAt(i) == '-') {
                continue;
            } else {
                cCount += 1;
            }
        }
        System.out.println("Vowels: " + vCount);
        System.out.println("Consonants: " + cCount);
    }
}
