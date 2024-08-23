package in.co.nmsworks.week3.assesment;

import java.util.HashMap;
import java.util.Map;

public class TuitionCenter {
    private String branchName;
    private String branchCode;
    Map<String,Integer> noOfStudentPerSubjects = new HashMap<>();

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public void getNoOfStudentPerSubjects() {
        for (String value : noOfStudentPerSubjects.keySet()){
            System.out.println("\nSubject : "+value+"\nNo of Students : "+noOfStudentPerSubjects.get(value)+"\n");
        }
    }

    public void setNoOfStudentPerSubjects(String subject ,Integer noOfStudents) {
        noOfStudentPerSubjects.put(subject,noOfStudents);
    }

    public TuitionCenter(String branchName, String branchCode) {
        this.branchName = branchName;
        this.branchCode = branchCode;
    }

    @Override
    public String toString() {
        return  "______________________"+"\nBranchName : " + branchName + "\n" +
                "BranchCode : " + branchCode +"\n______________________";
    }
}
