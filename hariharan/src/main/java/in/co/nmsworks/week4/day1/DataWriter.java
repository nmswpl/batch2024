package in.co.nmsworks.week4.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;

public class DataWriter {
    public static void main(String[] args) {
         try(FileReader fileReader = new FileReader("/home/nms/Downloads/Sample_CSV_Data.csv");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

             bufferedReader.readLine(); // skip the header;
             String line;
             while((line = bufferedReader.readLine()) != null){
                 String[] details = line.split(",");
                 WrieToDb wrieToDb = new WrieToDb();
                 if(Integer.parseInt(details[2]) % 2 == 0){
                     wrieToDb.saveToDb(details);
                 }else{
                     wrieToDb.saveToFile(details);
                 }
             }

         }catch (Exception e){
             System.out.println(e);
         }
    }
}
