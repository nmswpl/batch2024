package in.co.nmsworks.week1;

public class Runner {
    public static void main(String[] args) {
        Training1 t1 = new Training1();
        t1.reverse("India is my country.");

        Training2 t2 = new Training2();
        t2.isPalindrome("Goat");

        Training3 t3 = new Training3();
        t3.toFindEvenLenWord("This is a Java Language");

        Training4 t4 = new Training4();
        t4.toRemoveLeadingZero("00000564000");

        Training5 t5 = new Training5();
        t5.getSentence("Nature is the intricate web of life, encompassing everything from the tiniest microorganisms to the vast expanse of the universe. It is a term that has been used since ancient times to describe the world around us, comprising both living and non-living things. From the towering trees that provide shelter and food to animals, to the majestic mountains and valleys that shape our landscapes, nature is a boundless tapestry of beauty and wonder.");

        Training6 t6 = new Training6();
        t6.noOfVowelsAndConsonants("Hello World");

        Training7 t7 = new Training7();
        t7.removeDuplicates("aabbcc");

        Training8 t8 = new Training8();
        t8.convertToTitleCase("the quick brown fox jumps over the lazy dog");

        Training9 t9 = new Training9();
        t9.getLongestWord("The quick brown fox jumps over the lazy dog");
    }
}