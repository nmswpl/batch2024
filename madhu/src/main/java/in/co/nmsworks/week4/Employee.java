package in.co.nmsworks.week4;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Employee {
    List<String[]> oddList = new ArrayList<>();
    List<String[]> evenList = new ArrayList<>();
    Writer dbWrite = new DbWriter();
    Writer fileWrite = new FileWrite();

    public static void main(String[] args){
        new Employee().readFromCsv();
        new Employee().saver();
    }
    public void readFromCsv(){
        try (FileReader fr = new FileReader("/home/nms/Downloads/Sample_CSV_Data.csv");
             BufferedReader br = new BufferedReader(fr);) {
            String line="";
            br.readLine();
            while((line= br.readLine()) != null){
                String[] details = line.split(",");
                for (int i = 0; i <details.length ; i++) {
                    details[i] = details[i].replace("\"", "");
                    details[i] = details[i].trim();
                }
                if(Integer.parseInt(details[2])%2 == 0){
                    evenList.add(details);

                } else if (Integer.parseInt(details[2])%2 == 1) {
                    oddList.add(details);

                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void saver(){
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
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}



