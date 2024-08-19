package in.co.nmsworks.week3.assessment;

/***
 * Create a class TuitonCenter for the following data. TutionCenter must have a Map
 */
public class Program4 {
    private String branchName;
    private String branchCode;
    private String subject;
    private int numOfStudents;

    public Program4() {
    }

    public Program4(String branchName, String branchCode, String subject, int numOfStudents) {
        this.branchName = branchName;
        this.branchCode = branchCode;
        this.subject = subject;
        this.numOfStudents = numOfStudents;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }
}
