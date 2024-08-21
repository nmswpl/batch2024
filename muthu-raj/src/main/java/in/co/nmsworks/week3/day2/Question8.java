package in.co.nmsworks.week3.day2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
8. Parse the below file and Create Objects for Class Candidate
 */
public class Question8 {


    public static List<Candidate> students = new ArrayList<>();

    public static List<Candidate> getCandidateDetails() {

        try (FileReader fr = new FileReader("/home/nms/Candidates.csv");
             BufferedReader br = new BufferedReader(fr)) {

//            skipping the headers
            String headers = br.readLine();

            String line = br.readLine();

            while (line != null) {
                String[] details = line.split(",");
                addDetails(details);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Something went wrong!");
            e.printStackTrace();
        }

        return students;
    }


    public static void addDetails(String[] details) {
        int sno = Integer.parseInt(details[0]);
        long registerNo = Long.parseLong(details[1]);
        String name = details[2];
        String dept = details[3];
        String collegeName = details[4];
        String department = details[5];
        String email = details[6];
        String status = details[7];
        students.add(new Candidate(sno, registerNo, name, dept, collegeName, department, email, status));

    }

    public static void main(String[] args) {

        for (Candidate candidateDetail : Question8.getCandidateDetails()) {
            System.out.println(candidateDetail);
        }
    }

}
