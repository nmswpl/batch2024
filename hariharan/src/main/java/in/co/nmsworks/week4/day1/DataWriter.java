package in.co.nmsworks.week4.day1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class DataWriter {
    public static  void main(String[] args) {
        List<String[]> evenList = new ArrayList<String[]>();
        List<String[]> oddList = new ArrayList<String[]>();
         try(FileReader fileReader = new FileReader("/home/nms/Downloads/Sample_CSV_Data.csv");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

             bufferedReader.readLine(); // skip the header;
             String line;


             Writer dbwriter = new DbWriter();
             Writer filewriter = new WriteToFile();

             while((line = bufferedReader.readLine()) != null){
                 String[] details = line.split(",");

                 if(Integer.parseInt(details[2]) % 2 ==0){
                   evenList.add(details);
                 }else{
                   oddList.add(details);
                 }

             }
             dbwriter.open();
             filewriter.open();
             dbwriter.write(evenList);
             filewriter.write(oddList);
             dbwriter.close();
             filewriter.close();


         }catch (Exception e){
             System.out.println(e);
         }
    }
}
