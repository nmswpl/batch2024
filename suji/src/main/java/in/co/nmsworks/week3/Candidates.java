package in.co.nmsworks.week3;

public class Candidates {

    private String[] s = new String[0];
    private  int sno;
    private  Long reg;
    private String name;
    private String dept;
    private String clg;
    private String department;
    private String email;
    private String status;



   public String toString() {
        return "Candidates{" +
                "sno=" + sno +
                ", reg=" + reg +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", clg='" + clg + '\'' +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
    public String[] getS() {
        return s;
    }

    public void setS(String[] s) {
        this.s = s;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public Long getReg() {
        return reg;
    }

    public void setReg(Long reg) {
        this.reg = reg;
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

    public String getClg() {
        return clg;
    }

    public void setClg(String clg) {
        this.clg = clg;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public Candidates(String[] s) {
        setSno(Integer.parseInt(s[0]));
        setReg(Long.valueOf(s[1]));
        setName(s[2]);
        setDept(s[3]);
        setClg(s[4]);
        setDepartment(s[5]);
        setEmail(s[6]);
        setStatus(s[7]);

    }
}
