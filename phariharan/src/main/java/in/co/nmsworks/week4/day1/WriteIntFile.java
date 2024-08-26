package in.co.nmsworks.week4.day1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteIntFile implements Writer {


    @Override
    public void write(String[] inputArray) {
        try(FileWriter fw = new java.io.FileWriter("/home/nms/Documents/data.txt", true);
            BufferedWriter bw = new BufferedWriter(fw)) {
            String line1 = "****************************";
            String line2 = "ID : " + inputArray[0] + "\nName : " + inputArray[1] + "\nAge :" + inputArray[2] + "\nEmail Id : " + inputArray[3] + "\nPhone :" + inputArray[4] + "\nAddress :" + inputArray[5] + "\nCity : " + inputArray[6] + "\nState : " + inputArray[7] + "\nZipcode : " + inputArray[8] + "\nCountry : " + inputArray[9];
            bw.append(line1);
            bw.append(line2);
            bw.append("\n");
            bw.newLine();
            System.out.println("File Written Successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
