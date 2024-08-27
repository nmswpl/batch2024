package in.co.nmsworks.week4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeSaver {
        List<String[]> oddList=new ArrayList<>();
        List<String[]> evenList=new ArrayList<>();
        Writer dbWrite=new DBWriter();
        Writer fileWrite=new FileWrite();

        public static void main(String[] args){
            new EmployeeSaver().readFromCSV();
            new EmployeeSaver().writeToDb();
        }
        public void readFromCSV(){
            try (FileReader fr=new FileReader("/home/nms/Downloads/Data.csv");
                 BufferedReader br=new BufferedReader(fr);) {
                String line="";
                br.readLine();
                while((line= br.readLine())!=null){
                    String[] data=line.split(",");
                    for (int i = 0; i <data.length ; i++) {
                        data[i]=data[i].replace("\"", "");

                    }
                    if(Integer.parseInt(data[2])%2==0){
                        evenList.add(data);

                    } else {
                        oddList.add(data);

                    }
                }

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    public void writeToDb(){
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

