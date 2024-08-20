package in.co.nmsworks.week3.day2;
import java.io.FileWriter;
import java.io.IOException;

public class Question5 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("/home/nms/Downloads/input.txt",true);
       fileWriter.write("Appending new content.");
        fileWriter.close();


    }
}
