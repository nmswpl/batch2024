package in.co.nmsworks.week3.day2;
//Write a Java program that reads a file named original.txt, replaces all occurrence
//s of the word "old" with "new", and writes the modified content to a file named modified.txt.

import java.io.*;

public class Practice7 {
    public  void replaceStringInFile() throws IOException {
        FileReader freader =new FileReader("/home/nms/original.txt");
        BufferedReader bufferedReader=new BufferedReader(freader);
        FileWriter fwriter=new FileWriter("/home/nms/modified.txt");
        BufferedWriter bufferedWriter=new BufferedWriter(fwriter);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            if(line.contains("old")){
               String lines= line.replace("old","new");
                System.out.println(line);
                bufferedWriter.write(lines);
                bufferedWriter.newLine();
            }
            else {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

        }
        bufferedReader.close();
        bufferedWriter.close();
        freader.close();
        fwriter.close();
        FileReader fr =new FileReader("/home/nms/modified.txt");
        BufferedReader br=new BufferedReader(fr);
        String lines;
        while ((lines=br.readLine())!=null){
            System.out.println(lines);
        }

        fr.close();
        br.close();

    }
}
