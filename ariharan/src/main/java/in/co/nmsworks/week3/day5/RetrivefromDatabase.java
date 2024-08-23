package in.co.nmsworks.week3.day5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RetrivefromDatabase {
    public static void main(String[] args){
new RetrivefromDatabase().retriveTrainees();
    }
    public void retriveTrainees(){
        List<Trainees> traineeslist=new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
            PreparedStatement ps=con.prepareStatement("Select * from trainees");
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                Trainees obj=new Trainees();
                obj.setId(rs.getInt(1));
                obj.setName(rs.getString(2));
                obj.setEmailid(rs.getString(3));
                traineeslist.add(obj);

            }
            //writeIntoFile(traineeslist);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void writeIntoFile(List<Trainees> traineesList){
        try (FileWriter fr=new FileWriter("/home/nms/trainees.txt");
             BufferedWriter br=new BufferedWriter(fr)){
            int row=1;
            for (Trainees trainee : traineesList) {
                br.write("**************************"+row+" row*********************");
                br.newLine();
                br.write("id ::"+trainee.getId());
                br.newLine();
                br.write("name::"+trainee.getName());
                br.newLine();
                br.write("email id::"+trainee.getEmailid());
                br.newLine();
                br.newLine();
                row++;
            }
            System.err.println("successfully writed into file");

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
