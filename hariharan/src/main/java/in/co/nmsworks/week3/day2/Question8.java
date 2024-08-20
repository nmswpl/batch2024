package in.co.nmsworks.week3.day2;

import java.io.*;

public class Question8 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("/home/nms/original.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        FileWriter fileWriter = new FileWriter("modified.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        String line;

        while ((line = bufferedReader.readLine()) != null){
            if(line.contains("old")){
                line.replaceAll("old","new");
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

        }

        bufferedWriter.close();
        bufferedReader.close();
        fileReader.close();
        fileWriter.close();
    }
}
