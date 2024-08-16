package in.co.nmsworks.week1;

public class Runner {

    public static void main(String[] args) {

        Training1 training1 = new Training1();
        training1.reverseString("India is my country");
        System.out.println();
        System.out.println();

        Training2 training2 = new Training2();
        training2.isPalindome("daddy");
        System.out.println();

        Training3 training3 = new Training3();
        training3.printEvenLengthString("This is a java language");
        System.out.println();

        Training4 training4 = new Training4();
        training4.removeLeadingzeros("0005640");
        System.out.println();

        Training5 training5 = new Training5();
        training5.eachSentenceNewLine("The early morning sun cast a golden hue over the quiet village, where the scent of blooming jasmine mingled with the crisp, cool air. As the first light of day filtered through the canopy of ancient oak trees, the streets began to stir with the soft chatter of locals preparing for the day ahead. Children darted around with laughter, their voices a cheerful contrast to the serene landscape. In the heart of the village, the old bakery's doors creaked open, releasing the warm, inviting aroma of freshly baked bread, promising a comforting start to the day for everyone within reach.");
        System.out.println();
        System.out.println();

        Training6 training6 = new Training6();
        training6.printVowelsConsonants("Hello WOrlD");
        System.out.println();

         Training7 training7 = new Training7();
         training7.stringWithoutRepition("aabbcc");
        System.out.println();

        Training8 training8 = new Training8();
        training8.capitalizeEachWord("this is priya");
        System.out.println();

        Training9 training9 = new Training9();
        training9.getLongestWord("This is priyadharshini");
        System.out.println();
    }
}
