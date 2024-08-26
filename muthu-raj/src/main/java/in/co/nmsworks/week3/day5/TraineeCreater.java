package in.co.nmsworks.week3.day5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TraineeCreater {

    public static List<Trainee> trainees = new ArrayList<>();
    public static void main(String[] args) {

        createTrainees();
        addToFile();
    }

    private static void createTrainees()
    {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             PreparedStatement pstmt = con.prepareStatement("SELECT * FROM trainees"))
        {
            try(ResultSet rs = pstmt.executeQuery())
            {
                while (rs.next()) {
                    setTrainees(rs.getInt(1), rs.getString(2), rs.getString(3));
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong!");
            e.printStackTrace();

        }
    }

    private static void setTrainees(int id, String name, String email)
    {
        Trainee t = new Trainee();
        t.setId(id);
        t.setName(name);
        t.setEmail(email);

        trainees.add(t);
    }

    private  static void addToFile()
    {
        try(FileWriter fw = new FileWriter("/home/nms/traineesList.txt");
            BufferedWriter bw = new BufferedWriter(fw))
        {
            int rowCount = 1;
            for (Trainee trainee : trainees) {

                bw.write("--------------------- Row " + rowCount + "---------------");
                bw.newLine();
                bw.write("ID :: " + trainee.getId());
                bw.newLine();
                bw.write("NAME :: " + trainee.getName());
                bw.newLine();
                bw.write("Email :: " + trainee.getEmail());
                bw.newLine();
                rowCount++;
            }
        }
        catch (IOException e)
        {
            System.out.println("Something went wrong!");
            e.printStackTrace();
        }
    }
}
