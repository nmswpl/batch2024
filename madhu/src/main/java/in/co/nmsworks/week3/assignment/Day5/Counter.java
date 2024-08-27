package in.co.nmsworks.week3.assignment.Day5;

import java.io.*;
import java.util.Scanner;

public class Counter{
    public static void main(String[] args){
        Counter count = new Counter();
        count.countAndPrintLine();
        count.readFile();
    }
    public void countAndPrintLine(){
        try {
            FileReader fr = new FileReader("/home/nms/input.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            int count = 0;
            while (line != null){
                line = br.readLine();
                System.out.println(line);
                count++;
            }
            System.out.println("Number of lines : " +count);
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /*Write a program that prompts the user for a filename and reads the file content. Handle cases where the file does not exist or cannot be read.*/
    public void readFile(){
        try{
            File fileName = null;
            Scanner keyboard = new Scanner(System.in);
            String userInput;
            System.out.print("Please enter a file name: ");
            userInput = keyboard.nextLine();
            while(fileName.equals(!(new File(userInput)).exists())){
                System.out.println("ERROR");
                System.out.println("The file entered is invalid. \nTry again.");
                System.out.println("");
                System.out.println("\nPlease reenter a file name: ");
                userInput = keyboard.nextLine();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
