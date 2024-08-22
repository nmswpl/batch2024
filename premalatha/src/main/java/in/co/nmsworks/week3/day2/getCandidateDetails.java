
package in.co.nmsworks.week3.day2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class getCandidateDetails {

    public static List<Candidate> getDetails() {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("/home/nms/Downloads/Candidates.csv");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;

        List<Candidate> candidatesList = new ArrayList<>();

        try {
            bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        while (true){
            try {
                if (!((line = bufferedReader.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            String[] employeeData = line.split(",");


            int sno = Integer.parseInt(employeeData[0]);
            long registerNumber = Long.parseLong(employeeData[1]);
            String name = employeeData[2];
            String dept = employeeData[3];
            String college = employeeData[4];
            String department = employeeData[5];
            String email = employeeData[6];
            String status = employeeData[7];

            candidatesList.add(new Candidate(sno, registerNumber, name, dept, college, department, email, status));


        }

        return candidatesList;
    }
}

