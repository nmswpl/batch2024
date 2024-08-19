package in.co.nmsworks.week3.assesment;

import java.util.Objects;

public class TutionCenter {
    private String BranchName;
    private String branchCode;
    private String Subject;
    private Integer noOfStudent;

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

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public Integer getNoOfStudent() {
        return noOfStudent;
    }

    public void setNoOfStudent(Integer noOfStudent) {
        this.noOfStudent = noOfStudent;
    }

    public TutionCenter(String branchName, String branchCode, String subject, Integer noOfStudent) {
        BranchName = branchName;
        this.branchCode = branchCode;
        Subject = subject;
        this.noOfStudent = noOfStudent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TutionCenter that = (TutionCenter) o;
        return Objects.equals(BranchName, that.BranchName) && Objects.equals(branchCode, that.branchCode) && Objects.equals(Subject, that.Subject) && Objects.equals(noOfStudent, that.noOfStudent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(BranchName, branchCode, Subject, noOfStudent);
    }


}
