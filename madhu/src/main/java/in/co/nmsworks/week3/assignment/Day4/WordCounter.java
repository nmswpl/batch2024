package in.co.nmsworks.week3.assignment.Day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter {
    public static void main(String[] args) {
        WordCounter countWords = new WordCounter();
        countWords.wordCount("/home/nms/Documents/India.txt", "India");
        countWords.occurrence("/home/nms/Documents/India.txt");
    }
        public void wordCount(String path, String word) {
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
                    String currentElement = array[0];
                    for (String element : array) {
                        if (element == currentElement) {
                            count++;
                        } else {
                            System.out.println(currentElement + " appears " + count + " times");
                            currentElement = element;
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

    }

