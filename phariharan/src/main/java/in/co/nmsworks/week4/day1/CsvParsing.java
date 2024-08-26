package in.co.nmsworks.week4.day1;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CsvParsing {
    public static void main(String[] args) {
        FileReader fr;
        {
            try {
                fr = new FileReader("/home/nms/Downloads/Library.csv");
                CSVReader csvReader = new CSVReader(fr);
                System.out.println(Arrays.toString(csvReader.readNext()));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (CsvValidationException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
