package in.co.nmsworks.week3.practicequestions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile
{
    public void readFile(String path) throws IOException
    {
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            int c = 0;
            String line;
            while ((line = br.readLine()) != null)            //reading the file
            {
                System.out.println(line + " \n");
                c = c + 1;
            }
            System.out.println(" Count of lines present in the file :: " + c);     //counting the no.of.lines & printing it
            br.close();
            fr.close();
        }
        catch (FileNotFoundException e)
        {
            System.err.println(" Sorry !! The file is not found ");
        }
        catch (Exception e)
        {
            System.out.println("Exception ..");
        }

    }

    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter path");
        String path= scanner.nextLine();
        ReadFromFile ob=new ReadFromFile();
        ob.readFile(path);                                      //getting the path from user (file )
    }
}
