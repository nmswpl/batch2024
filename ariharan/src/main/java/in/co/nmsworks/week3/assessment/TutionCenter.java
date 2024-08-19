package in.co.nmsworks.week3.assessment;

import java.util.HashMap;
import java.util.Map;

public class TutionCenter {
    private String branchName;
    private String branchcode;
    private Map<String,Integer> subjectwithStudents=new HashMap<>();

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }


    public String getBranchcode() {
        return branchcode;
    }

    public void setBranchcode(String branchcode) {
        this.branchcode = branchcode;
    }

    public Map<String, Integer> getSubjectwithStudents() {
        return subjectwithStudents;
    }

    public void setSubjectwithStudents(Map<String, Integer> subjectwithStudents) {
        this.subjectwithStudents = subjectwithStudents;
    }

    @Override
    public String toString() {
        return "" +
                "branchName='" + branchName + '\'' +
                ", branchcode='" + branchcode + '\'' +
                ", subjectwithStudents=" + subjectwithStudents +
                "\n";
    }
}
