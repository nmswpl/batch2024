package in.co.nmsworks.week3.day4;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileParsingHomeWork {
    public static void main(String[] args)
    {
        FileParsingHomeWork fileParsingHomeWork = new FileParsingHomeWork();
        String filePath = "/home/nms/Documents/india.txt";
        fileParsingHomeWork.getOccurrenceCount(filePath, "India");
        fileParsingHomeWork.printWordCountForFile(filePath);
        fileParsingHomeWork.printOccurrenceCount(filePath, "India");
    }

    private void printWordCountForFile(String filePath)
    {
        Map<String, Integer> wordCountMap = getWordCountMap(filePath);
        for (String string : wordCountMap.keySet())
        {
            System.out.println("\"" + string + "\" word occurrence count is :: --> " + wordCountMap.get(string));
        }
    }

    private void getOccurrenceCount(String filePath, String searchWord)
    {
        Map<String, Integer> wordCountMap = getWordCountMap(filePath);
        String searchWordUpper = searchWord.trim().toUpperCase();
        Integer count = wordCountMap.get(searchWordUpper);
        if (count == null)
        {
            count = 0;
        }
        System.out.println("Number of occurrences of \"" + searchWord + "\" in the given file is: " + count);
    }

    private void printOccurrenceCount(String filePath, String searchWord)
    {
        try (BufferedReader br = getFileParser(filePath))
        {
            String line = br.readLine();
            int counter = 0;
            while (line != null) {
                String cleanedLine = line.toUpperCase().replaceAll("[^\\w\\s]", "");
                String[] lineArray = cleanedLine.split("\\s+");
                for (String string : lineArray)
                {
                    if (searchWord.equalsIgnoreCase(string))
                    {
                        counter += 1;
                    }
                }
                line = br.readLine();
            }
            System.out.println("Number of occurrence of " + searchWord + " is : " + counter);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }


    private Map<String, Integer> getWordCountMap(String filePath)
    {
        Map<String, Integer> wordMapWithOccurrenceCount = new HashMap<>();
        try (BufferedReader br = getFileParser(filePath))
        {
            String line;
            while ((line = br.readLine()) != null)
            {
                String cleanedString = line.toUpperCase().trim().replaceAll("[^\\w\\s]", "");
                String[] wordsArray = cleanedString.split("\\s+");
//                System.out.println(Arrays.toString(wordsArray));// Split by one or more whitespace characters
                for (String word : wordsArray)
                {
                    if (wordMapWithOccurrenceCount.containsKey(word))
                    {
                        Integer count = wordMapWithOccurrenceCount.get(word) + 1;
                        wordMapWithOccurrenceCount.put(word, count);
                    }
                    else
                    {
                        if (!word.equals(""))
                        {
                            wordMapWithOccurrenceCount.put(word, 1);
                        }
                    }
                }
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return wordMapWithOccurrenceCount;
    }

    private BufferedReader getFileParser(String filePath)
    {
        try
        {
            FileReader fr = new FileReader(filePath);
            return new BufferedReader(fr);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
//.replaceAll("'S", "").