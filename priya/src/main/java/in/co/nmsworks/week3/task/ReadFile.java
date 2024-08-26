package in.co.nmsworks.week3.task;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFile {

    public void readFile(String filename){

        try(FileReader fr = new FileReader("/home/nms/"+filename);

            BufferedReader br = new BufferedReader(fr)){

            String line;


            while((line=br.readLine())!=null){

                System.out.println(line);

            }

        }
        catch (FileNotFoundException f){
            System.out.println("File not found");
        }
        catch (Exception e){

            e.printStackTrace();

        }
    }

    public static void main(String[] args) {

        ReadFile rf = new ReadFile();
        Scanner s = new Scanner(System.in);
        String filename =   s.nextLine();
        rf.readFile(filename);
    }
}
