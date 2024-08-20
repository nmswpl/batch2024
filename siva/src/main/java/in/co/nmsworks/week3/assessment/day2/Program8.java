package in.co.nmsworks.week3.assessment.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program8 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/home/nms/Candidates.csv");
        BufferedReader br = new BufferedReader(fr);
        List<Candidate> candidateList = new ArrayList<>();
        String line = br.readLine();
        line = br.readLine();


        while (line != null) {
            String[] detail = line.split(",");

            candidateList.add(new Candidate(Integer.parseInt(detail[0]), Long.parseLong(detail[1]), detail[2], detail[3], detail[4], detail[5], detail[6], detail[7]));
            line = br.readLine();
        }
        br.close();
        fr.close();
        System.out.println(candidateList);
    }
}
