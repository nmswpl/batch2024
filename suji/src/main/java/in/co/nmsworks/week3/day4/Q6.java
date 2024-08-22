package in.co.nmsworks.week3.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q6 {

    public void printWordCount() throws IOException
    {
        FileReader fr = new FileReader("/home/nms/model.txt");
        BufferedReader br = new BufferedReader(fr);
        int l=0;
        while (br.read() != -1)
        {

            String s[] =(br.readLine().split(" "));
            l= s.length+l;
        }
        System.out.println("Count the number of words in a given file :: "+l);
        br.close();
        fr.close();
    }

    public static void main(String[] args) throws IOException
    {
        Q6 ob=new Q6();
        ob.printWordCount();
    }
}