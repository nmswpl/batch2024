package in.co.nmsworks.week3.day2;

public class Candidates {

  String department;

    String status;


    Long registerNumber;
    String name;



    String Dept;
    String college;
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
