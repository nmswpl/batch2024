package in.co.nmsworks.week3.Day5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dummy {
    public static  void fillTraineeList() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
             PreparedStatement ps = connection.prepareStatement("Select ? from trainees")) {
            ps.setString(1, "name");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
            ps.setString(1, "id");
            ResultSet rs1 = ps.executeQuery();

            ps.setString(1, "email");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
           fillTraineeList();
    }
}
