package in.co.nmsworks.week3.assessment.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Candidates {

    private int regNo;
    private String Name;
    private String collegeDepartment;
    private String collegeName;
    private String department;
    private String emailId;
    private String Status;

    public Candidates(int regNo, String name, String collegeDepartment, String collegeName, String department, String emailId, String status) {
        this.regNo = regNo;
        Name = name;
        this.collegeDepartment = collegeDepartment;
        this.collegeName = collegeName;
        this.department = department;
        this.emailId = emailId;
        Status = status;
    }

    public String getCollegeDepartment() {
        return collegeDepartment;
    }

    public void setCollegeDepartment(String collegeDepartment) {
        this.collegeDepartment = collegeDepartment;
    }


    public int getRegNo() {
        return (regNo);
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public List<Candidates> getCandidateList() {
        List<Candidates> candidatesList;
        try {
            FileReader fileReader = new FileReader("/home/nms/Downloads/Candidates.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            candidatesList = new ArrayList<>();
            while (null != (line = bufferedReader.readLine())){
                String[] stringArray = line.split(",");
                candidatesList.add(new Candidates(Integer.valueOf(stringArray[1]), stringArray[2], stringArray[3], stringArray[4], stringArray[5], stringArray[6], stringArray[7]));
            }
            bufferedReader.close();
            fileReader.close();

            for (Candidates candidates : candidatesList) {
                System.out.println("Candidate RegNo : " + candidates.getRegNo() + "\nCandidate Name : " + candidates.getName() + "\nCollege Department : " + candidates.getCollegeDepartment() + "\nCandidate College :" + candidates.getCollegeName() + "\nCandidate Department : " + candidates.getDepartment() + "\nCandidate EmailId : " + candidates.getEmailId() + "\nCandidate isAccepted :" + candidates.getStatus());

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return candidatesList;
    }
}

