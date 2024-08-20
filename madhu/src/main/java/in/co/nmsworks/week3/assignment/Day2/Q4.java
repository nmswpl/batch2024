package in.co.nmsworks.week3.assignment.Day2;

import java.io.*;

/*Write a Java program that copies the content from a file named input.txt to a file named output.txt*/
public class Q4 {
    public static void main(String[] args) throws IOException
    {
        FileReader fr = new FileReader("/home/nms/input.txt");
        BufferedReader buffer = new BufferedReader(fr);
        FileWriter fw = new FileWriter("/home/nms/Output.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        String str="";
        str = buffer.readLine();
        while (str != null)
        {
            bw.write(str);
        }
        fr.close();
        buffer.close();
        fw.close();
        bw.close();
    }
}

