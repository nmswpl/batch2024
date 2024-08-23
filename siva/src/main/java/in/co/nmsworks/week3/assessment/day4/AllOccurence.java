package in.co.nmsworks.week3.assessment.day4;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AllOccurence {

        public static void main(String[] args) {
            AllOccurence alloccurence = new AllOccurence();
            alloccurence.allOccurence("/home/nms/India.txt");
        }

        public void allOccurence(String path) {
            Map<String, Integer> wordsOccurrence = new HashMap<>();

            try (FileReader fr = new FileReader(path);
                 BufferedReader br = new BufferedReader(fr)) {

                String line;
                while ((line = br.readLine()) != null) {
                    String[] words = line.toLowerCase().split(" ");
                    for (String word : words) {
                        if (word != null) {

                            wordsOccurrence.put(word, wordsOccurrence.getOrDefault(word, 0) + 1);
                        }
                    }
                }

                for (Map.Entry<String, Integer> entry : wordsOccurrence.entrySet()) {
                    System.out.println(entry.getKey() + " = " + entry.getValue());
                }

            } catch (FileNotFoundException e) {
                System.err.println("File not found: " + path);
                e.printStackTrace();
            } catch (IOException e) {
                System.err.println("Error reading file: " + path);
                e.printStackTrace();
            }
        }
    }



