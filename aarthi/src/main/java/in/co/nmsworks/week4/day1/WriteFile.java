package in.co.nmsworks.week4.day1;

import java.io.*;

public class WriteFile implements Writer {

    FileWriter fw;
    BufferedWriter writer;
    int counter = 0;
    @Override
    public void open() throws Exception {
        fw = new FileWriter("/home/nms/Downloads/Inputfile.txt");
        writer = new BufferedWriter(fw);

    }

    @Override
    public void write(String[] data) throws Exception {
        String line = "****************+***"+counter+++"****************";
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
    public void close()throws Exception {
        fw.close();
        writer.close();
    }
}
