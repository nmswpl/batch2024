package in.co.nmsworks.week3.assessment;

import java.util.*;

//Create a class TuitonCenter for the following data. TutionCenter must have a Map

public class TutionCenter {

    private String branchName;
    private String branchCode;

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchCode() {
        return branchCode;
    }

    @Override
    public String toString() {
        return "TutionCenter{" +
                "branchName='" + branchName + '\'' +
                ", branchCode='" + branchCode + '\'' +
                ", subjectToStudents=" + subjectToStudents +
                '}';
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public Map<String, Integer> getSubjectToStudents() {
        return subjectToStudents;
    }

    public void setSubjectToStudents(Map<String, Integer> subjectToStudents) {
        this.subjectToStudents = subjectToStudents;
    }

    private  Map<String, Integer> subjectToStudents = new HashMap<>();

    public TutionCenter(String branchName, String branchCode) {
        this.branchName = branchName;
        this.branchCode = branchCode;
    }

}



