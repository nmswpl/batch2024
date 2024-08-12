package in.co.nmsworks.week1;

public class Runner {
    public static void main(String[] args){
        Training1 tra1=new Training1();
        tra1.s="India is my Country";
        tra1.reverseString();
        Training3 tra3=new Training3();
        tra3.s="This is a Java Language";
        tra3.evenLength();
        Training2 tar2=new Training2();
        tar2.s="dad";
        tar2.palindrome();
        Training5 tra5=new Training5();
        tra5.s="The early morning sun cast a golden hue over the quiet village, where the scent of blooming jasmine mingled with the crisp, cool air. As the first light of day filtered through the canopy of ancient oak trees, the streets began to stir with the soft chatter of locals preparing for the day ahead. Children darted around with laughter, their voices a cheerful contrast to the serene landscape. In the heart of the village, the old bakery's doors creaked open, releasing the warm, inviting aroma of freshly baked bread, promising a comforting start to the day for everyone within reach.";
        tra5.sentence();
        Training6 tra6=new Training6();
        tra6.s="Hello World";
        tra6.countVowels();
    }
}
