package in.co.nmsworks.week3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File3 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("/home/nms/Documents/input.txt");
        BufferedReader br=new BufferedReader(fr);
        int c=0;
        while(br.read()!=-1)
        {
          String s= br.readLine();
          c=c+1;
        }
        System.out.println("The count of lines :: "+c);
        br.close();
        fr .close();
    }
}
