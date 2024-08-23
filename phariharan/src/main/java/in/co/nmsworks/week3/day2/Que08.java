package in.co.nmsworks.week3.day2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException; 
import java.util.*;

/**
 * Parse the below file and Create Objects for Class Candidate
 */

public class Que08 {
    public static void main(String[] args) throws IOException {
        Que08 que08 = new Que08();
        List<Candidate> candidatesList = que08.getCandidatesList();

        for (Candidate candidates : candidatesList) {
            System.out.println("Candidate RegNo : "+candidates.getRegNo()+"\nCandidate Name : "+candidates.getName()+"\nCollege Department : "+candidates.getCollegeDepartment()+"\nCandidate College :"+candidates.getCollegeName()+"\nCandidate Department : "+candidates.getDepartment()+"\nCandidate EmailId : "+candidates.getEmailId()+"\nCandidate Accepted Status :"+candidates.getStatus());
            System.out.println("------------\n");
        }
    }
    public List<Candidate> getCandidatesList() throws IOException {
        FileReader fileReader = new FileReader("/home/nms/Downloads/Candidates.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String string = bufferedReader.readLine();
        List<Candidate> candidatesList = new ArrayList<>();
        while ((string = bufferedReader.readLine())!= null) {
            String[] stringArray = string.split(",");
            candidatesList.add(new Candidate(Long.valueOf(stringArray[1]),stringArray[2],stringArray[3],stringArray[4],stringArray[5],stringArray[6],stringArray[7]));
        }
        bufferedReader.close();
        fileReader.close();
        return candidatesList;
    }
}
