package in.co.nmsworks.week1;

import java.util.Scanner;

/*
7. Write a Java program to remove duplicate characters from a string while preserving the order of the first occurrences.

	Input: "aabbcc"

	Output: "abc"
 */
class Training7 {
    private String input;

    public Training7(String input) {
        this.input = input;
    }

    public void preserveFirstOccurrences() {

        String res = "";

        for (int i = 0; i < input.length(); i++) {
            String s = String.valueOf(input.charAt(i));

            if (!res.contains(s)) {
                System.out.print(s);
            }
            res += s;
        }
        System.out.println();
        System.out.println(res);

    }
}
