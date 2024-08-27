package in.co.nmsworks.week4.day1;

import java.io.BufferedReader;
import java.io.FileReader;

public class Citizen {

    Writer filewriter = new FileWrite();
    Writer Dbwriter = new DbWriter();

    public void fileParsing() {

        String[] row = {};

        try (FileReader fr = new FileReader("/home/nms/Sample_CSV_Data.csv");
             BufferedReader br = new BufferedReader(fr))
        {
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {

                row = line.replaceAll("\"", " ").split(",");

                if ((Integer.parseInt(row[2]) % 2 == 0)) {
                    filewriter.open();
                    filewriter.write(filewriter, row);
                    filewriter.close();
                }
                else {
                    Dbwriter.open();
                    Dbwriter.write(Dbwriter, row);
                    Dbwriter.close();
                }
            }


        }
        catch (Exception e) {

            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Citizen c = new Citizen();
        c.fileParsing();
    }
}
