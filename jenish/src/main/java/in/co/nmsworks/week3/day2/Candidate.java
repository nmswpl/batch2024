package in.co.nmsworks.week3.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Candidate {
    private int sno;
    private long regNo;
    private String name;
    private String branch;
    private String collegeName;
    private String dept;
    private String email;
    private String acceptedStatus;

    public Candidate(){

    }
    public Candidate(int sno, long regNo, String name, String branch, String collegeName, String dept, String email, String acceptedOrNot) {
        this.sno = sno;
        this.regNo = regNo;
        this.name = name;
        this.branch = branch;
        this.collegeName = collegeName;
        this.dept = dept;
        this.email = email;
        this.acceptedStatus = acceptedOrNot;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public long getRegNo() {
        return regNo;
    }

    public void setRegNo(long regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAcceptedStatus() {
        return acceptedStatus;
    }

    public void setAcceptedStatus(String acceptedStatus) {
        this.acceptedStatus = acceptedStatus;
    }

    @Override
    public String toString() {
        return
                "sno = " + sno +
                ", regNo = " + regNo +
                ", name = '" + name + '\'' +
                ", branch = '" + branch + '\'' +
                ", collegeName = '" + collegeName + '\'' +
                ", dept = '" + dept + '\'' +
                ", email = '" + email + '\'' +
                ", acceptedOrNot = '" + acceptedStatus + '\'';
    }

    public List<Candidate> getCandidateList() throws IOException {
        FileReader reader = new FileReader("/home/nms/Downloads/Candidates.csv");
        BufferedReader bufferedReader = new BufferedReader(reader);
        List<Candidate> candidateList = new ArrayList<>();

        String header = bufferedReader.readLine();
        String line = bufferedReader.readLine();

        while(line != null) {
            String[] candidateDetails;
            candidateDetails = line.split(",");
            int sno = Integer.valueOf(candidateDetails[0].trim());
            long regno = Long.valueOf(candidateDetails[1].trim());
            String name = candidateDetails[2].trim();
            String branch = candidateDetails[3].trim();
            String collegeName = candidateDetails[4].trim();
            String dept = candidateDetails[5].trim();
            String email = candidateDetails[6].trim();
            String acceptedOrNot = candidateDetails[7].trim();
            Candidate candidate = new Candidate(sno, regno, name, branch, collegeName, dept, email, acceptedOrNot);
            candidateList.add(candidate);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        reader.close();

        for (int i = 0; i < candidateList.size(); i++) {
            System.out.println("Candidate "+(i+1)+" :"+"\n"+candidateList.get(i));
        }
        return candidateList;
    }

    public static void main(String[] args) throws IOException {
        Candidate candidate = new Candidate();
        candidate.getCandidateList();
    }
}