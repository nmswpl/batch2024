package in.co.nmsworks.week3.day5;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileParsing {

    public void tableToFile(List<Trainees> traineesList){
        try {
            FileWriter fw = new FileWriter("/home/nms/Documents/Trainees.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            for (Trainees trainee : traineesList){
                String line = String.format("%s,%s,%s",trainee.getId(),trainee.getName(),trainee.getEmail());
                bw.write(line);
                bw.newLine();
            }
            bw.close();
            fw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
