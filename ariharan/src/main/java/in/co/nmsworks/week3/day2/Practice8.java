package in.co.nmsworks.week3.day2;
//Parse the below file and Create Objects for Class Candidate

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Practice8 {
    public List<Candidate> fileParsing() throws IOException {
        FileReader fr =new FileReader("/home/nms/Candidates.csv");
        BufferedReader br=new BufferedReader(fr);
        String lines;
        List<Candidate> objects=new ArrayList<>();
        br.readLine();
        while ((lines=br.readLine())!=null){
            String[] candidateDetails=lines.split(",");
            Candidate obj=new Candidate(candidateDetails);
            objects.add(obj);
        }
        br.close();
        fr.close();
       return objects;
    }

}
