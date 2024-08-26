package in.co.nmsworks.week4.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Employee {
    public static List<String[]> readFileFromCsv() {
        List<String[]> employeesList = new ArrayList<>();
        try (FileReader fileReader = new FileReader("/home/nms/Downloads/Sample_CSV_Data.csv");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            // Skip header line
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                line = line.replaceAll("[\"\\s]+", "").trim();
                String[] entry = line.split(",");
                employeesList.add(entry);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employeesList;
    }

    public static void save(Writer1 writer1, String[] stringArray) {
        try {
            writer1.open();
            writer1.writer(stringArray);
            writer1.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<String[]> listOfStringArray = readFileFromCsv();
        Writer1 writerDb = new JdbcWriter();
        Writer1 writerfW = new FileWriter1();
        for (String[] stringArray : listOfStringArray) {
            if (Integer.parseInt(stringArray[2]) % 2 == 0) {
                save(writerfW, stringArray);
            } else {
                save(writerDb, stringArray);
            }
        }
    }
}