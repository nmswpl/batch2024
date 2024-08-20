package in.co.nmsworks.week3.day2;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {

        Program1 p1 = new Program1();
        p1.createFile();

        Program2 p2 = new Program2();
        p2.readFile();

        Program3 p3 = new Program3();
        p3.countLine();

        Program4 p4 = new Program4();
        p4.copyContent();

        Program5 p5 = new Program5();
        p5.appendLine();

        Program6 p6 = new Program6();
        p6.searchOccurrences();
    }
}
