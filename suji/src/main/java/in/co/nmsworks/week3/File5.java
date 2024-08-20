package in.co.nmsworks.week3;

import java.io.*;

public class File5 {
    public static void main(String[] args)throws IOException {
      /*  FileReader fr=new FileReader("/home/nms/Documents/input.txt");
        BufferedReader br=new BufferedReader(fr);

        if (br.read()==-1) {

            br.close();
            fr.close();
        } */
            FileWriter fw = new FileWriter("/home/nms/Documents/input.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.newLine();
            bw.append("Appending new content");

        bw.close();
        fw.close();

      //  br.close();
     //   fr.close();

}
}
