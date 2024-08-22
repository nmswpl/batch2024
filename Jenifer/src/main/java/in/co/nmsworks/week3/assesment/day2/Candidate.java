package in.co.nmsworks.week3.assesment.day2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Candidate {
        private int sNo;
        private long regNo;
        private String name;
        private String dept;
        private String collegeName;
        private String department;
        private String email;

    public Candidate() {

    }

    public int getsNo () {
            return sNo;
        }

        public void setsNo ( int sNo){
            this.sNo = sNo;
        }

        public long getRegNo () {
            return regNo;
        }

        public void setRegNo ( long regNo){
            this.regNo = regNo;
        }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public String getDept () {
            return dept;
        }

        public void setDept (String dept){
            this.dept = dept;
        }

        public String getCollegeName () {
            return collegeName;
        }

        public void setCollegeName (String collegeName){
            this.collegeName = collegeName;
        }

        public String getDepartment () {
            return department;
        }

        public void setDepartment (String department){
            this.department = department;
        }

        public String getEmail () {
            return email;
        }

        public void setEmail (String email){
            this.email = email;
        }

    public Candidate( int sNo, long regNo, String name, String dept, String collegeNme, String department, String email)
        {
            this.sNo = sNo;
            this.regNo = regNo;
            this.name = name;
            this.dept = dept;
            this.collegeName = collegeNme;
            this.department = department;
            this.email = email;
        }
    public List<Candidate> getCandidateList() throws IOException {
        FileReader reader = new FileReader("/home/nms/Downloads/Candidates.csv");
        BufferedReader bufferedReader = new BufferedReader(reader);
        List<Candidate> candidateList = new ArrayList<>();

        String s = bufferedReader.readLine();
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
            Candidate candidate = new Candidate(sno, regno, name, branch, collegeName, dept, email);
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

}