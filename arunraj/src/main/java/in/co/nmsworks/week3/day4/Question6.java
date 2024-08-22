package in.co.nmsworks.week3.day4;

/*Write a program to count the number of words
in a given file countWords.txt
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Question6 {
    public static void main(String[] args) {
        Question6 q6 = new Question6();
        q6.noOfWords();

    }
    public void noOfWords() {
        FileReader fr;
        try {
            fr = new FileReader("/home/nms/Downloads/words.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();

            int count = 0;
            while (line != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    System.out.println(word);
                    count++;
                }
                System.out.println("The count of the words : "+count);
                line = br.readLine();
            }
            br.close();
            fr.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*String paragraph = "Hello, world! This is a test paragraph. It contains various punctuation marks: commas, periods, exclamation points, and question marks. How many words will be counted? Let's find out! In addition to punctuation, this paragraph also includes some numbers: 123, 456.7, and special characters like @, #, and $. The quick brown fox jumps over the lazy dog. This is a classic sentence used to display all the letters of the alphabet. It’s often used in typewriters and computer fonts to showcase typefaces. Programming languages such as Python, Java, and C++ are used to create software. Each language has its own syntax and rules, but they all serve the purpose of making computers perform tasks. Testing edge cases is important: consider phrases like hello-world, it's a test, and one-two-three. These examples help ensure the word count algorithm works correctly under various conditions.";
        String[] para = paragraph.split(" ");
        int count=0;
        for (String s : para) {
            System.out.println(s);
            count++;
        }
        System.out.println(count);*/

