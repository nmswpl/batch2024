package in.co.nmsworks.week3.day2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
8. Parse the below file and Create Objects for Class Candidate
 */
public class Question8 {


    static List<Candidate> students = new ArrayList<>();

    public static void main(String[] args) {

        try {
//            Reader
            FileReader fr = new FileReader("/home/nms/Candidates.csv");
            BufferedReader br = new BufferedReader(fr);


            String headers = br.readLine();

            String line = br.readLine();

            while (line != null) {
                String[] details = line.split(",");
                addDetails(details);
                line = br.readLine();
            }
            br.close();

        } catch (IOException e) {
            System.out.println("Something went wrong!");
            e.printStackTrace();
        }

//        printing the students
        for (Candidate student : students) {
            System.out.println(student);
        }


    }

    static void addDetails(String[] details) {
        int sno = Integer.valueOf(details[0]);
        long registerNo = Long.valueOf(details[1]);
        String name = details[2];
        String dept = details[3];
        String collegeName = details[4];
        String department = details[5];
        String email = details[6];
        String status = details[7];

        Candidate c = new Candidate(sno, registerNo, name, dept, collegeName, department, email, status);
        students.add(c);
    }


}
