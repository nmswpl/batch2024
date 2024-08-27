package in.co.nmsworks.week4.day1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeSaver {
    FileReader fr;
    BufferedReader br;
    List<String[]> oddList = new ArrayList<>();
    List<String[]> evenList = new ArrayList<>();
    Writer dbWrite = new WriteInDatabase();
    Writer fileWrite = new WriteFile();


    public void processTheFile() {
        try {
            fr = new FileReader("/home/nms/Downloads/Sample_CSV_Data.csv");
            br = new BufferedReader(fr);
            String line = br.readLine();
            line = br.readLine();
            while (line != null) {
                String[] arr = line.split(",");

                for (int i = 0; i < arr.length; i++) {
                    arr[i] = arr[i].replace("\"", "");
                    arr[i] = arr[i].trim();
                }
                if (Integer.parseInt(arr[2]) % 2 == 0) {
                    evenList.add(arr);

                } else if (Integer.parseInt(arr[2]) % 2 == 1) {
                    oddList.add(arr);

                }
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }

    public void saveTheData() {
        try {
            dbWrite.open();
            fileWrite.open();
            for (String[] data : oddList) {

                dbWrite.write(data);

            }
            for (String[] data : evenList) {

                fileWrite.write(data);
            }
            dbWrite.close();
            fileWrite.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}



