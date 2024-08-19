package in.co.nmsworks.week3.assesment;

import java.util.HashMap;
import java.util.Map;

/*
Create a class TuitonCenter for the following data. TutionCenter must have a Map
 */

public class TutionCenter {
    private String branchName;
    private String branchCode;
    private Map<String, Integer> subjectsToNoOfStudents = new HashMap<>();

    public TutionCenter(){

    }

    public TutionCenter(String branchName, String branchCode){
        this.branchName = branchName;
        this.branchCode = branchCode;
    }

    public Map<String, Integer> getSubjectsToNoOfStudents() {
        return subjectsToNoOfStudents;
    }

    public void setSubjectsToNoOfStudents(Map<String, Integer> subjectsToNoOfStudents) {
        this.subjectsToNoOfStudents = subjectsToNoOfStudents;
    }

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

    @Override
    public String toString() {
        return "TutionCenter{" +
                "branchName='" + branchName + '\'' +
                ", branchCode='" + branchCode + '\'' +
                ", subjectsToOfStudents=" + subjectsToNoOfStudents +
                '}';
    }

    public int totalNoOfStudents(String branchName){
        int total = 0;
        for (Integer value : getSubjectsToNoOfStudents().values()) {
            total += value;
        }
        return total;
    }
}