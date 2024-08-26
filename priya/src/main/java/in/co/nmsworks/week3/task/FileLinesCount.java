package in.co.nmsworks.week3.task;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileLinesCount {

    public void getNoOfLines(String filename){

       try(FileReader fr = new FileReader("/home/nms/"+filename);

           BufferedReader br = new BufferedReader(fr)){

           String line;

           int count=0;

           while((line=br.readLine())!=null){

               count++;

               System.out.println(line);
           }

           System.out.println("No of lines:"+count);
       }

       catch (Exception e){

           e.printStackTrace();

       }
    }

    public static void main(String[] args) {

        FileLinesCount fc = new FileLinesCount();
        Scanner s = new Scanner(System.in);
        String filename =   s.nextLine();
        fc.getNoOfLines(filename);
    }
}
