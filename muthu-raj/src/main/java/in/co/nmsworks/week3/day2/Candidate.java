package in.co.nmsworks.week3.day2;

public class Candidate {

    private enum AcceptedStatus{
        ACCEPTED,
        NOT_JOINING,
        DID_NOT_ATTEND
    };

    private int sno;
    private long registerNo;
    private String name;
    private String dept;
    private String collegeName;
    private String department;
    private String email;
    private AcceptedStatus status;


    public Candidate(int sno, long registerNo, String name, String dept, String collegeName, String department, String email, String status) {
        this.sno = sno;
        this.registerNo = registerNo;
        this.name = name;
        this.dept = dept;
        this.collegeName = collegeName;
        this.department = department;
        this.email = email;
        this.status = AcceptedStatus.valueOf(status);
    }

    public int getSno() {
        return sno;
    }

    public long getRegisterNo() {
        return registerNo;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    public AcceptedStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "sno=" + sno +
                ", registerNo=" + registerNo +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", collegeName='" + collegeName + '\'' +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                '}';
    }
}
