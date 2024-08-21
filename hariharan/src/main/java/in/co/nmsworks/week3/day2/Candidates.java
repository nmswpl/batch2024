package in.co.nmsworks.week3.day2;

public class Candidates {

    String department;
    String status;
    Long registerNumber;
    String name;
    String Dept;
    String college;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(Long registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getsNo() {
        return sNo;
    }

    public void setsNo(int sNo) {
        this.sNo = sNo;
    }

    String email;
    int sNo;

    @Override
    public String toString() {
        return "Candidates{" +
                "department='" + department + '\'' +
                ", status='" + status + '\'' +
                ", registerNumber=" + registerNumber +
                ", name='" + name + '\'' +
                ", Dept='" + Dept + '\'' +
                ", college='" + college + '\'' +
                ", email='" + email + '\'' +
                ", sNo=" + sNo +
                '}';
    }

    public Candidates(int sNo, Long registerNumber, String name, String dept, String college, String department, String email, String status) {
        this.department = department;
        this.status = status;
        this.registerNumber = registerNumber;
        this.name = name;
        Dept = dept;
        this.college = college;
        this.email = email;
        this.sNo = sNo;
    }


}
