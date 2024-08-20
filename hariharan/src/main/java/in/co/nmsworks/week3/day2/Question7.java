package in.co.nmsworks.week3.day2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Question7 {
    public static void main(String[] args) throws IOException {


        FileReader fileReader = new FileReader("/home/nms/Downloads/Candidates.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;

        List<Candidates> candidatesList = new ArrayList<>();

        bufferedReader.readLine();
        while ((line = bufferedReader.readLine()) != null){

                String[] employeeData = line.split(",");


                int sno = Integer.parseInt(employeeData[0]);
              long registerNumber = Long.parseLong(employeeData[1]);
                String name = employeeData[2];
                String dept = employeeData[3];
                String college = employeeData[4];
                String department = employeeData[5];
                String email = employeeData[6];
                String status = employeeData[7];

                candidatesList.add(new Candidates(sno, registerNumber, name, dept, college, department, email, status));


        }


       for(Candidates candidate : candidatesList){
           System.out.println(candidate+"\n");
       }

    }
}
