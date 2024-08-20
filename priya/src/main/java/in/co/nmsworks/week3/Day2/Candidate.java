package in.co.nmsworks.week3.Day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Candidate {

    List<Candidate> listOfCandidates = new ArrayList<>();

    private String serialNo;
    private String name;
    private String dept;
    private String collegeName;
    private String department;
    private String Email;
    private String acceptedStatus;

    public List<Candidate> getListOfCandidates() {
        return listOfCandidates;
    }

    public void setListOfCandidates(List<Candidate> listOfCandidates) {
        this.listOfCandidates = listOfCandidates;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAcceptedStatus() {
        return acceptedStatus;
    }

    public void setAcceptedStatus(String acceptedStatus) {
        this.acceptedStatus = acceptedStatus;
    }


    public Candidate(){

    }


    public Candidate(String serialNo,String registerNumber, String name, String dept, String collegeName, String department, String email, String acceptedStatus) {
        this.serialNo = serialNo;
        this.name = name;
        this.dept = dept;
        this.collegeName = collegeName;
        this.department = department;
        Email = email;
        this.acceptedStatus = acceptedStatus;
    }

    public  void createAndPrintCandidate() throws IOException {

        FileReader fr = new FileReader("/home/nms/Candidates.csv");

        BufferedReader br = new BufferedReader(fr);

        String line;

        br.readLine();

        while((line = br.readLine())!=null){

            String[] arr = line.split(",");

            listOfCandidates.add(new Candidate(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7]));
        }


        for(Candidate candidate: listOfCandidates){

            System.out.println(candidate);

        }
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "serialNo='" + serialNo + '\'' +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", collegeName='" + collegeName + '\'' +
                ", department='" + department + '\'' +
                ", Email='" + Email + '\'' +
                ", acceptedStatus='" + acceptedStatus + '\'' +
                '}';
    }

    public static void main(String[] args) throws IOException {

        Candidate c = new Candidate();

        c.createAndPrintCandidate();
    }
}
