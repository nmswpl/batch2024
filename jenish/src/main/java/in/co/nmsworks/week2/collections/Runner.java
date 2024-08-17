package in.co.nmsworks.week2.collections;

import java.util.Iterator;

public class Runner {
    public static void main(String[] args) {
        Question1 q1 = new Question1();
        q1.displayColors();

        Question2 q2 = new Question2();
        q2.displayList();

        Question3 q3 = new Question3();
        q3.displayList();

        Question4 q4 = new Question4();
        q4.displayList();

        Question5 q5 = new Question5();
        q5.displayList();

        Question6 q6 = new Question6();
        q6.displayList();

        Question7 q7 = new Question7();
        int searchElement = 3;
        q7.findElement(searchElement);

        Question8 q8 = new Question8();
        q8.displayList();

        Question9 q9 = new Question9();
        q9.displayList();

        Question10 q10 =  new Question10();
        q10.displayList();

        Question11 q11 = new Question11();
        q11.displayList();

        Question12 q12 = new Question12();
        q12.displaySet();
    }
}
