package in.co.nmsworks.week4.day1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class DataWriter {
    public static <List> void main(String[] args) {
         try(FileReader fileReader = new FileReader("/home/nms/Downloads/Sample_CSV_Data.csv");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

             bufferedReader.readLine(); // skip the header;
             String line;


             while((line = bufferedReader.readLine()) != null){
                 String[] details = line.split(",");
                 Writer dbwriter = new DbWriter();
                 Writer filewriter = new WriteToFile();

                 if(Integer.parseInt(details[2]) % 2 ==0){
                     dbwriter.open();
                     dbwriter.write(details);
                     dbwriter.close();
                 }else{
                     filewriter.open();
                     filewriter.write(details);
                     filewriter.close();
                 }

             }

         }catch (Exception e){
             System.out.println(e);
         }
    }
}
