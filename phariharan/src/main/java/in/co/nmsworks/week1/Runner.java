package in.co.nmsworks.week1;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Training 1 ");
        Training1 reverseWord = new Training1();
        reverseWord.reverseWord("India is my country.");
        System.out.println("\n");

        System.out.println("Training 2 ");
        Training2 palindrome =new Training2();
        palindrome.isPalindrome("aba");
        System.out.println("\n\n");
        System.out.println("Training 3 ");
        Training3 evenWordPrinter = new Training3();
        evenWordPrinter.evenWordPrinter("This is a java language");
        System.out.println("\n\n");
        System.out.println("Training 4 ");
        Training4 trailing0 = new Training4();
        trailing0.removeTrailing0("0005640");
        System.out.println("\n\n");
        System.out.println("Training 5 ");
        Training5 sentenceDivider = new Training5();
        sentenceDivider.sentanceDivider("The early morning sun cast a golden hue over the quiet village, where the scent of blooming jasmine mingled with the crisp, cool air. As the first light of day filtered through the canopy of ancient oak trees, the streets began to stir with the soft chatter of locals preparing for the day ahead. Children darted around with laughter, their voices a cheerful contrast to the serene landscape. In the heart of the village, the old bakery's doors creaked open, releasing the warm, inviting aroma of freshly baked bread, promising a comforting start to the day for everyone within reach.");
        System.out.println("\n\n");
        System.out.println("Training 6 ");
        Training6 vowels = new Training6();
        vowels.countVowels("orange-apple");
        System.out.println("\n\n");
        System.out.println("Training 7 ");
        Training7 removeDuplicates=new Training7();
        removeDuplicates.removeDuplicate("aabbcc");
        System.out.println("\n\n");
        System.out.println("Training 8 ");
        Training8 capital = new Training8();
        capital.capitalize("a this tht, the quick brown fox jumps over the lazy dog");
        System.out.println("\n\n");
        System.out.println("Training 9 ");
        Training9 longestWord = new Training9();
        longestWord.getLongestWord("The quick brown fox jumps over the lazy dog");
        System.out.println("\n\n");
    }
}
