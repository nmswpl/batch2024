package in.co.nmsworks.week3.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Parse the below file and Create Objects for Class Candidate
 */

public class Que08 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("/home/nms/Downloads/Candidates.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String string = bufferedReader.readLine();
        string = bufferedReader.readLine();
        List<Candidates> candidatesList = new ArrayList<>();
        while (string != null) {
            String[] stringArray = string.split(",");
            candidatesList.add(new Candidates(Long.valueOf(stringArray[1]),stringArray[2],stringArray[3],stringArray[4],stringArray[5],stringArray[6],stringArray[7]));
            string = bufferedReader.readLine();
        }
        bufferedReader.close();
        fileReader.close();

        for (Candidates candidates : candidatesList) {
            System.out.println("Candidate RegNo : "+candidates.getRegNo()+"\nCandidate Name : "+candidates.getName()+"\nCollege Department : "+candidates.getCollegeDepartment()+"\nCandidate College :"+candidates.getCollegeName()+"\nCandidate Department : "+candidates.getDepartment()+"\nCandidate EmailId : "+candidates.getEmailId()+"\nCandidate isAccepted :"+candidates.getStatus());
            System.out.println("------------\n");
        }
    }
}
