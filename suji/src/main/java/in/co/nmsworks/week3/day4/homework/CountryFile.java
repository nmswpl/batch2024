package in.co.nmsworks.week3.day4.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class CountryFile
{
    String path;
    String word;
    public void calcCount(String path,String word) throws IOException {
        this.path = path;
        this.word = word;
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        int c = 0;
        String h = br.readLine();
        while (br.readLine()!= null )
        {

            h=h.replaceAll("\\."," ");
            h=h.replaceAll(","," ");
            h=h.replaceAll("'s","");
            h=h.replaceAll(":","");
            h=h.replaceAll("-"," ");

            String[] s = h.split(" ");
            for (String i : s)
            {
                System.out.println(i);
               if (i.equalsIgnoreCase(word))
               {
                   c=c+1;
               }
            }
            System.out.println(c);
            }
        }


    public static void main(String[] args) throws IOException
    {
        CountryFile ob=new CountryFile();
        ob.calcCount("/home/nms/Documents/country.txt","India");

    }
    }

