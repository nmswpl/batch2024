package in.co.nmsworks.week3.assessment.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Write a program to count the number of words in a given file countWords.txt
 * Hello, world! This is a test paragraph. It contains various punctuation marks: commas, periods, exclamation points, and question marks. How many words will be counted? Let's find out!
 * <p>
 * In addition to punctuation, this paragraph also includes some numbers: 123, 456.7, and special characters like @, #, and $.
 * <p>
 * The quick brown fox jumps over the lazy dog. This is a classic sentence used to display all the letters of the alphabet. It’s often used in typewriters and computer fonts to showcase typefaces.
 * <p>
 * Programming languages such as Python, Java, and C++ are used to create software. Each language has its own syntax and rules, but they all serve the purpose of making computers perform tasks.
 * <p>
 * Testing edge cases is important: consider phrases like "hello-world," "it's a test," and "one-two-three." These examples help ensure the word count algorithm works correctly under various conditions.
 */

public class Problem6 {
    public void countWords() throws IOException {
        String line;
        int count = 0;
            FileReader fr = new FileReader("/home/nms/countWords.txt");
            BufferedReader br = new BufferedReader(fr);

            while ((line = br.readLine()) != null) {
                String words[] = line.split(" ");
                count = count + words.length;
            }
            System.out.println("Number of words present in given file: " + count);
            br.close();

    }
}
