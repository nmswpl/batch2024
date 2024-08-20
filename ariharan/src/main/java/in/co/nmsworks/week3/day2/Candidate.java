package in.co.nmsworks.week3.day2;
//Sno,Register No,Name,Dept.,College Name,Department,Email,ACCEPTED STATUS

public class Candidate {
    private  Integer serialNumber;
    private  Long regNumber;
    private String name;
    private String dept;
    private String collegeName;
    private String deptInOffice;
    private String email;
    private String acceptedStatus;

    public Candidate(String[] candidateDetails) {
        serialNumber = Integer.valueOf(candidateDetails[0]);
        regNumber = Long.valueOf(candidateDetails[1]);
        name=candidateDetails[2];
        dept=candidateDetails[3];
        collegeName=candidateDetails[4];
        deptInOffice=candidateDetails[5];
        email=candidateDetails[6];
        acceptedStatus=candidateDetails[7];
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Long getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(Long regNumber) {
        this.regNumber = regNumber;
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

    public String getDeptInOffice() {
        return deptInOffice;
    }

    public void setDeptInOffice(String deptInOffice) {
        this.deptInOffice = deptInOffice;
    }

    public String getAcceptedStatus() {
        return acceptedStatus;
    }

    public void setAcceptedStatus(String acceptedStatus) {
        this.acceptedStatus = acceptedStatus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "Sno=" + serialNumber +
                ", regno=" + regNumber +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", collegeName='" + collegeName + '\'' +
                ", deptInOffice='" + deptInOffice + '\'' +
                ", email='" + email + '\'' +
                ", acceptedStatus='" + acceptedStatus + '\'' +
                '}';
    }
}
