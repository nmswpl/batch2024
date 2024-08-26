package in.co.nmsworks.week3.day5.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Write a program that reads a file using `FileReader` and wraps it with `BufferedReader` to efficiently read the content.
 * * Count and print the number of lines in the file.
 */

public class FileParsingExercise {
    public static void main(String[] args) {
        FileParsingExercise fileparsing = new FileParsingExercise();
        System.out.println("Enter the file path : ");
        Scanner sc = new Scanner(System.in);
        String filePath = sc.nextLine();
        fileparsing.countNumberOfLines(filePath);
    }

    private void countNumberOfLines(String string) {
        try (FileReader fr = new FileReader(string);) {
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            int count = 0;
            while ((line = br.readLine()) != null) {
                count += 1;
            }
            System.out.println("No of Lines in given File : " + count);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found !!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
