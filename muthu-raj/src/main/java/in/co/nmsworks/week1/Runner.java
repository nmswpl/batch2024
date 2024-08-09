package in.co.nmsworks.week1;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input:: ");
        String input = sc.nextLine();


        Training1 t1 = new Training1(input);
        t1.reverseWord();

        Training2 t2 = new Training2(input);
//        t2.isPalindrome();

        Training3 t3 = new Training3(input);
//        t3.printEvenLengthWords();

        Training4 t4 = new Training4(input);
//        t4.removeLeadingZeros();

        Training5 t5 = new Training5(input);
//        t5.printSentenceNewLine();

        Training6 t6 = new Training6(input);
//        t6.countVowelsAndConsonants();

        Training7 t7 = new Training7(input);
//        t7.preserveFirstOccurrences();

        Training8 t8 = new Training8(input);
//        t8.convertToTitleCase();

        Training9 t9 = new Training9(input);
//        t9.printMaxLengthWord();
    }
}
