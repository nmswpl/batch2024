package in.co.nmsworks.week3;

import java.io.*;

public class File4 {
    public static void main(String[] args)throws IOException {
        FileReader fr=new FileReader("/home/nms/Documents/input.txt");
        BufferedReader br=new BufferedReader(fr);

        String str[]=new String[25];
        int i=0;
        while (br.read()!=-1)
        {
            String s=br.readLine();
            str[i]=str[i]+s;
            i++;
        }

       // for (int j = 0; j < str.length; j++) {
         //   System.out.println(str[j]);
       // }

        FileWriter fw=new FileWriter("/home/nms/file1.txt");
        BufferedWriter bw=new BufferedWriter(fw);

        for (int j = 0; j < str.length; j++) {
            bw.write(str[j]);
            bw.newLine();
        }

        bw.close();
        fw.close();

        br.close();
        fr.close();
    }
}
