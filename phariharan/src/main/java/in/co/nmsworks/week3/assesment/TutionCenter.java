package in.co.nmsworks.week3.assesment;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TutionCenter {
    private String BranchName;
    private String branchCode;
    Map<String,Integer> noOfStudentPerSubjects = new HashMap<>();

    public String getBranchName() {
        return BranchName;
    }

    public void setBranchName(String branchName) {
        BranchName = branchName;
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

    public TutionCenter(String branchName, String branchCode) {
        BranchName = branchName;
        this.branchCode = branchCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TutionCenter that = (TutionCenter) o;
        return Objects.equals(BranchName, that.BranchName) && Objects.equals(branchCode, that.branchCode) && Objects.equals(noOfStudentPerSubjects, that.noOfStudentPerSubjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(BranchName, branchCode, noOfStudentPerSubjects);
    }
}
