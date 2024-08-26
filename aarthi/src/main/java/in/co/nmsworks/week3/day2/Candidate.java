package in.co.nmsworks.week3.day2;
/*
Parse the below file and Create Objects for Class Candidate
 */

public class Candidate {
    private int id;
    private Long regNo;
    private String Name;
    private String collegeDepartment;
    private String collegeName;
    private String department;
    private String emailId;
    private String Status;

    public Candidate(int id,Long regNo, String name, String collegeDepartment, String collegeName, String department, String emailId, String status) {
        this.regNo = regNo;
        this.id = id;
        this.Name = name;
        this.collegeDepartment = collegeDepartment;
        this.collegeName = collegeName;
        this.department = department;
        this.emailId = emailId;
        Status = status;
    }

    public String getCollegeDepartment() {
        return collegeDepartment;
    }

    public void setCollegeDepartment(String collegeDepartment) {
        this.collegeDepartment = collegeDepartment;
    }


    public Long getRegNo() {
        return (regNo);
    }

    public void setRegNo(Long regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

