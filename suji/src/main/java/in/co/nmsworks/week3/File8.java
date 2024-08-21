package in.co.nmsworks.week3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Candidates {

   // String[] s = new String[0];
    int sno;
    Long reg;
    String name;
    String dept;
    String clg;
    String department;
    String email;
    String status;


    @Override
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

    public Candidates(String s[]) {
        /*(int sno, int reg, String name, String dept, String clg, String department, String email, String status) {
        this.sno = sno;
        this.reg = reg;
        this.name = name;
        this.dept = dept;
        this.clg = clg;
        this.department = department;
        this.email = email;
        this.status = status; */


        sno = Integer.parseInt(s[0]);
        reg = Long.valueOf(s[1]);
        name = s[2];
        dept = s[3];
        clg = s[4];
        department = s[5];
        email = s[6];
        status = s[7];



    }


}




public class File8 {

    public static void main(String[] args) throws IOException {
        List<Candidates> ls = new ArrayList<>();
        try (FileReader fr = new FileReader("/home/nms/Documents/Candidates.csv");
             BufferedReader br = new BufferedReader(fr) ){

           String line;
           br.readLine();
            while( (line=br.readLine())!= null) {
                String[] s = (line.split(","));
                System.out.println(Arrays.toString(s));

                Candidates ob = new Candidates(s);
                ls.add(ob);
            }
        }

             catch(Exception e){
                System.out.println("Error");
                e.printStackTrace();
            }
            for (Candidates c : ls) {
                System.out.println(c);
            }

        }

        }


