package in.co.nmsworks.week3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File6 {
    public static void main(String[] args)throws IOException {
        FileReader fr=new FileReader("/home/nms/Documents/input.txt");
        BufferedReader br=new BufferedReader(fr);

        while (br.read()!=-1)
        {
            String s=br.readLine();
            if (s.contains("file"))
            {
                System.out.println(s);
            }
        }
        br.close();
        fr.close();
    }
}
