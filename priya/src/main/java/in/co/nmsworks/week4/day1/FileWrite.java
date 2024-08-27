package in.co.nmsworks.week4.day1;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileWrite implements Writer {
    BufferedWriter bw;
    FileWriter fw;
    @Override
    public void open() throws IOException {
       fw = new FileWriter("/home/nms/newfile.txt", true);
        bw = new BufferedWriter(fw);
    }


    @Override
    public void write(Writer filewriter, String[] arr) throws IOException {


            bw.append(Arrays.toString(arr));
            bw.newLine();

        }



    @Override
    public void close() {
        try {
            bw.close();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}



