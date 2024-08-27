package in.co.nmsworks.week4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite implements Writer {
    FileWriter fw;
    BufferedWriter bw;

    @Override
    public void open() {
        try {
            fw = new FileWriter("/home/nms/Sample.txt");
            bw = new BufferedWriter(fw);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void write(String[] data) {
        String line = "**************************";
        line += "Id\t:" + data[0] + "\n";
        line += "Name\t:" + data[1] + "\n";
        line += "Age\t:" + data[2] + "\n";
        line += "EmailId\t:" + data[3] + "\n";
        line += "Phone\t:" + data[4] + "\n";
        line += "Address\t:" + data[5] + "\n";
        line += "City\t:" + data[6] + "\n";
        line += "State\t:" + data[7] + "\n";
        line += "Zipcode\t:" + data[8] + "\n";
        line += "Country\t:" + data[1] + "\n";
        line += "**********************************";

    }

    @Override
    public void close() {
        try {
            fw.close();
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


