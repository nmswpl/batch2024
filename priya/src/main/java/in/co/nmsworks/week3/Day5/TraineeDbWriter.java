package in.co.nmsworks.week3.Day5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TraineeDbWriter {
    static List<Trainee>  listOFTrainees = new ArrayList<>();
    public static  void fillTraineeList(){
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
                 PreparedStatement ps = connection.prepareStatement("Select * from trainees")
                    ) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Trainee t1 = new Trainee(rs.getInt(1), rs.getString(2), rs.getString(3));
                listOFTrainees.add(t1);
            }

        }
        catch (Exception e){

        }
    }

    public  static void writeTraineeDetails(){
        int count=1;
        try(FileWriter fw = new FileWriter("/home/nms/TraineesList.txt");
            BufferedWriter bw = new BufferedWriter(fw)){
            for (Trainee Trainee : listOFTrainees) {
                bw.write("**********"+count+++"**********");
                bw.newLine();
                bw.write("id: "+Trainee.getId());
                bw.newLine();
                bw.write("name: "+Trainee.getName());
                bw.newLine();
                bw.write("email: "+Trainee.getEmailId());
                bw.newLine();
                bw.newLine();
                bw.newLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        fillTraineeList();
        writeTraineeDetails();
    }
}
