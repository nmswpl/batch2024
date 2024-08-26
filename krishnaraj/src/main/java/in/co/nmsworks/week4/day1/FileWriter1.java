package in.co.nmsworks.week4.day1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 implements Writer1 {
    private BufferedWriter bufferedWriter;
    private FileWriter fileWriter;

    @Override
    public void open() {
        try {
            String path = "/home/nms/Downloads/employee.txt";
            fileWriter = new FileWriter(path, true);  // Append mode
            bufferedWriter = new BufferedWriter(fileWriter);
            System.out.println("FileWriter and BufferedWriter initialized.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error in fileWriter initialization...");
        }
    }

    @Override
    public void writer(String[] stringArray) {
        if (bufferedWriter == null) {
            System.err.println("BufferedWriter is not initialized!");
            return;
        }
        try {
            int id = Integer.parseInt(stringArray[0]);
            String name = stringArray[1];
            int age = Integer.parseInt(stringArray[2]);
            String email = stringArray[3];
            String phone = stringArray[4];
            String address = stringArray[5];
            String city = stringArray[6];
            String state = stringArray[7];
            int zipcode = Integer.parseInt(stringArray[8]);
            String country = stringArray[9];

            bufferedWriter.write("ID: " + id);
            bufferedWriter.newLine();
            bufferedWriter.write("Name: " + name);
            bufferedWriter.newLine();
            bufferedWriter.write("Age: " + age);
            bufferedWriter.newLine();
            bufferedWriter.write("Email: " + email);
            bufferedWriter.newLine();
            bufferedWriter.write("Phone: " + phone);
            bufferedWriter.newLine();
            bufferedWriter.write("Address: " + address);
            bufferedWriter.newLine();
            bufferedWriter.write("City: " + city);
            bufferedWriter.newLine();
            bufferedWriter.write("State: " + state);
            bufferedWriter.newLine();
            bufferedWriter.write("Zipcode: " + zipcode);
            bufferedWriter.newLine();
            bufferedWriter.write("Country: " + country);
            bufferedWriter.newLine();
            bufferedWriter.write("******************");
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error in file writing...");
        }
    }

    @Override
    public void close() {
        try {
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            if (fileWriter != null) {
                fileWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error closing file writer...");
        }
    }
}