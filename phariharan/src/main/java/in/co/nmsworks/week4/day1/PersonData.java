package in.co.nmsworks.week4.day1;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PersonData {
    public static void main(String[] args) {
        {
            try (FileReader fr = new FileReader("/home/nms/Downloads/Sample_CSV_Data.csv");
                BufferedReader br = new BufferedReader(fr)) {
                String line = br.readLine();
                line = br.readLine();
                while (line != null) {
                    line = line.replaceAll("\",\"", "@@@").replaceAll("\",", "@@@").replaceAll(",\"", "@@@").replaceAll("\"", "");
                    String[] lineArray = line.split("@@@");
                    if (Integer.parseInt(lineArray[2]) % 2 == 0)
                    {
                        new WriteIntFile().write(lineArray);
                    }
                    else
                    {
                        new DBWrite1().write(lineArray);
                    }
                    line = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

