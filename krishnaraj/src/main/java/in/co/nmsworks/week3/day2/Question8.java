package in.co.nmsworks.week3.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class Question8 {
    private int sNo;
    private long registerNumber;
    private String name;
    private String dept;
    private String collegeName;
    private String department;
    private String email;
    private String acceptedStatus;

    public Question8() {
    }

    public Question8(int sNo, long registerNumber, String name, String dept, String collegeName, String department, String email, String acceptedStatus) {
        this.sNo = sNo;
        this.registerNumber = registerNumber;
        this.name = name;
        this.dept = dept;
        this.collegeName = collegeName;
        this.department = department;
        this.email = email;
        this.acceptedStatus = acceptedStatus;
    }

    public int getsNo() {
        return sNo;
    }

    public void setsNo(int sNo) {
        this.sNo = sNo;
    }

    public long getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(int registerNumber) {
        this.registerNumber = registerNumber;
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
        return "Question8{" +
                "sNo=" + sNo +
                ", registerNumber=" + registerNumber +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", collegeName='" + collegeName + '\'' +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                ", acceptedStatus='" + acceptedStatus + '\'' +
                '}';
    }

    public void displayDetails() {
        System.out.println("SNo : " + sNo);
        System.out.println("RegisterNumber : " + registerNumber);
        System.out.println("Name : " + name);
        System.out.println("Department : " + department);
        System.out.println("CollegeName : " + collegeName);
        System.out.println("Email : " + email);
        System.out.println("ACCEPTE STATUS : " + acceptedStatus);
    }

    public List<Question8> getCandidateList() {
        List<Question8> candidates = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("/home/nms/Downloads/Candidates.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] entry = line.split(",");
                candidates.add(new Question8(Integer.parseInt(entry[0]), Long.parseLong(entry[1]), entry[2], entry[3], entry[4], entry[5], entry[6], entry[7]));
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return candidates;
    }
    public void addDetailsToDatabase(){
        List<Question8> candidates = getCandidateList();
        String sql ="insert into candidate values(? ,? , ?,?, ?,?, ?,?)";
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
            PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            for (Question8 candidate : candidates) {
                preparedStatement.setInt(1, candidate.getsNo());
                preparedStatement.setLong(2, candidate.getRegisterNumber());
                preparedStatement.setString(3, candidate.getName());
                preparedStatement.setString(4, candidate.getDept());
                preparedStatement.setString(5, candidate.getCollegeName());
                preparedStatement.setString(6, candidate.getDepartment());
                preparedStatement.setString(7, candidate.getEmail());
                preparedStatement.setString(8, candidate.getAcceptedStatus());
                preparedStatement.executeUpdate();
                System.out.println("The values successfully incerted .");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void printCandidateList(){
        List<Question8> candidates = getCandidateList();
        for (Question8 candidate : candidates) {
            System.out.println("SNo : "+candidate.getsNo());
            System.out.println("RegisterNumber : "+candidate.getRegisterNumber());
            System.out.println("Name : "+candidate.getName());
            System.out.println("Dept: "+candidate.getDept());
            System.out.println("CollegeName : "+candidate.getCollegeName());
            System.out.println("Department : "+candidate.getDepartment());
            System.out.println("Email : "+candidate.getEmail());
            System.out.println("Accepted Status : "+candidate.getAcceptedStatus());
        }
    }

    public static void main(String[] args) {
        Question8 question8 = new Question8();
        question8.printCandidateList();
        //question8.addDetailsToDatabase();
    }
}