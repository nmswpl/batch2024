package in.co.nmsworks.week3.day2;

/*
Parse the below file and Create Objects for Class Candidate
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Program8 {
    public static void main(String[] args)
    {
        Program8 pg8 = new Program8();
        pg8.parseAndGetCandidates();
        System.out.println("Done");
    }

    public List<Candidate> parseAndGetCandidates() {
        FileReader fr;
        try {
            fr = new FileReader("/home/nms/Downloads/Candidates.csv");
            BufferedReader br = new BufferedReader(fr);
            String line;
            List<Candidate> candidates = new ArrayList<>();

            while ((line = br.readLine()) != null){
                String[] canInfo = line.split(",");
                Candidate c1 = new Candidate(Integer.parseInt(canInfo[0]),Long.parseLong(canInfo[1]),canInfo[2],canInfo[3],canInfo[4],canInfo[5],canInfo[6],canInfo[7]);
                candidates.add(c1);
            }

            for (Candidate candidate : candidates) {
                System.out.println(candidate);
            }

            br.close();
            fr.close();
            return candidates;
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
}
