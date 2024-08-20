package in.co.nmsworks.week3.day2;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        Question1 q1 = new Question1();
        q1.writeAFile();

        Question2 q2 = new Question2();
        q2.printLineByLine();

        Question3 q3 = new Question3();
        q3.printNoOfLines();

        Question4 q4 = new Question4();
        q4.copiesContent();

        Question5 q5 = new Question5();
        q5.addNewLine();

        Question6 q6 = new Question6();
        q6.matchesPattern();
    }
}