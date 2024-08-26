package in.co.nmsworks.week4.day1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterImpl implements Writer {
    private String filePath;
    private int lineCount = 0;

    public FileWriterImpl(String filePath){
        this.filePath = filePath;
    }
    @Override
    public void open() {
        try{
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void write(String[] data) {
        String line = "***************"+(lineCount++)+"*****************";
        line += "Id\t:"+data[0]+"\n";
        line += "Name\t:"+data[1]+"\n";
        line += "Age\t:"+data[2]+"\n";
        line += "EmailId\t:"+data[3]+"\n";
        line += "Phone\t:"+data[4]+"\n";
        line += "Address\t:"+data[5]+"\n";
        line += "City\t:"+data[6]+"\n";
        line += "State\t:"+data[7]+"\n";
        line += "Zipcode\t:"+data[8]+"\n";
        line += "Country\t:"+data[9]+"\n";
        line += "******************************************************";
    }

    @Override
    public void close() {

    }
}
