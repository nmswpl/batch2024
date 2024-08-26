package in.co.nmsworks.week4.day1;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriterClass {
    public List<String[]> readFromFile() {
        List<String[]> employeeList = new ArrayList<>();
        try (FileReader reader = new FileReader("/home/nms/Downloads/Sample_CSV_Data.csv");
             CSVReader csvReader = new CSVReader(reader)) {
            csvReader.skip(1);
            String[] employeeDetails;
            while ((employeeDetails = csvReader.readNext()) != null) {
                employeeList.add(employeeDetails);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
        return employeeList;
    }
}