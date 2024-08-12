package in.co.nmsworks.week1;

public class Runner {
    public static void main(String[] args) {
        Training1 t1 = new Training1();
        t1.reverse("India is my country.");

        Training2 t2 = new Training2();
        t2.isPalindrome("Malayalam");

        Training3 t3 = new Training3();
        t3.toFindEvenLenWord("This is a java language");

        Training4 t4 = new Training4();
        t4.toRemoveLeadingZero("0005640");

        Training5 t5 = new Training5();
        t5.getSentence("The early morning sun cast a golden hue over the quiet village, where the scent of blooming jasmine mingled with the crisp, cool air. As the first light of day filtered through the canopy of ancient oak trees, the streets began to stir with the soft chatter of locals preparing for the day ahead. Children darted around with laughter, their voices a cheerful contrast to the serene landscape. In the heart of the village, the old bakery's doors creaked open, releasing the warm, inviting aroma of freshly baked bread, promising a comforting start to the day for everyone within reach.");

        Training6 t6 = new Training6();
        t6.noOfVowelsAndConsonants("Hello World");

        Training7 t7 = new Training7();
        t7.removeDuplicates("aabbcc");

        Training8 t8 = new Training8();
        t8.convertToTitleCase("the quick brown fox jumps over the lazy dog");

        Training9 t9 = new Training9();
        t9.getLongestWord("the quick brown fox jumps over the lazy dog");
    }
}
