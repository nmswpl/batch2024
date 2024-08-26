package in.co.nmsworks.week3.day4;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter{
    public void countingWordsInFile(String path, String word) {
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            int count = 0;
            while ((line = br.readLine()) != null) {
                br.readLine();
                String[] array = line.split(" ");
                for (int i = 0; i < array.length; i++) {
                    if (array[i].equalsIgnoreCase(word)) {
                        count++;
                    }
                }
            }
            System.out.println("Total number of words : " + count);
            br.close();
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void occurrence(String path) {
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            int count = 0;
            while ((line = br.readLine()) != null) {
                br.readLine();
                String[] array = line.split(" ");
                String currentElement="";
                for (String str : array) {
                    if (str == currentElement) {
                        count++;
                    } else {
                        System.out.println(currentElement + " appears " + count + " times");
                        currentElement = str;
                        count = 1;
                    }
                }
                System.out.println(currentElement + " appears " + count + " times");
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        WordCounter countWords = new WordCounter();
        countWords.countingWordsInFile("/home/nms/India.txt", "India");
        countWords.occurrence("/home/nms/India.txt");
    }
}



