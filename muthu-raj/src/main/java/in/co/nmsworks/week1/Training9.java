package in.co.nmsworks.week1;

import java.util.Scanner;

class Training9 {
    private String input;

    public Training9(String input) {
        this.input = input;
    }

    public void printMaxLengthWord() {

        String[] words = input.split(" ");

        int maxi = 0;
        String res = "";

        for (String word : words) {
            if (word.length() > maxi) {
                maxi = word.length();
                res = word;
            }
        }
        System.out.println("The longest word is "+res);
    }
}
