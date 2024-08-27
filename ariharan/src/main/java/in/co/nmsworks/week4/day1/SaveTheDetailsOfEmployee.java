package in.co.nmsworks.week4.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SaveTheDetailsOfEmployee {
    List<String[]> oddList=new ArrayList<>();
    List<String[]> evenList=new ArrayList<>();
    Writer dbWrite=new WriteToDatabase();
    Writer fileWrite=new WriteTOFIle();

    public static void main(String[] args){
        SaveTheDetailsOfEmployee save=new  SaveTheDetailsOfEmployee();
        save.divider();
        save.saver();
        save.closer();
    }
    public void divider(){
        try (FileReader fr=new FileReader("/home/nms/Sample_CSV_Data.csv");
             BufferedReader br=new BufferedReader(fr);) {
            String line="";
            br.readLine();
            while((line= br.readLine())!=null){
                String[] details=line.split(",");
                for (int i = 0; i <details.length ; i++) {
                    details[i]=details[i].replace("\"", "");
                    details[i]=details[i].trim();
                }
                if(Integer.parseInt(details[2])%2==0){
                    evenList.add(details);

                } else if (Integer.parseInt(details[2])%2==1) {
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
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void closer(){
        try {
            dbWrite.closes();
            fileWrite.closes();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
