package in.co.nmsworks.week3.assesment;

public class TutionCenter {
    private String branchCode;
    private String branchName;
    String subject;
    Integer noOfStudents;

    public TutionCenter(String subject, Integer noOfStudents){
        this.subject=subject;
        this.noOfStudents=noOfStudents;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

}
