package in.co.nmsworks.week3.assessment.day2;

public class Candidate {
    private int sNo;
    private long registerNo;
    private String name;
    private String dept;
    private String collegeName;
    private String department;
    private String email;
    private String acceptedStatus;

    public Candidate(int sNo, long registerNo, String name, String dept, String collegeName, String department, String email, String acceptedStatus) {
        this.sNo = sNo;
        this.registerNo = registerNo;
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

    public long getRegisterNo() {
        return registerNo;
    }

    public void setRegisterNo(long registerNo) {
        this.registerNo = registerNo;
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
        return "Candidate{" +
                "sNo=" + sNo +
                ", registerNo=" + registerNo +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", collegeName='" + collegeName + '\'' +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                ", acceptedStatus='" + acceptedStatus + '\'' +
                '}';
    }
}
