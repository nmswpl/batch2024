package in.co.nmsworks.week3;

import java.io.*;

public class File7 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("/home/nms/Documents/orginal.txt");
        BufferedReader br=new BufferedReader(fr);

        String str[]=new String[4];
        int i=0;
        while (br.read()!=-1) {
            String s = br.readLine();
            if (s.contains("old")) {
                s = s.replaceAll("old", "new");
                str[i] = str[i] + s;
                i++;
            }
        }

        FileWriter fw=new FileWriter("/home/nms/Documents/modified.txt");
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


