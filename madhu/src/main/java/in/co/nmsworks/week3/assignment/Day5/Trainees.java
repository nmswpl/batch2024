package in.co.nmsworks.week3.assignment.Day5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class Trainees {
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    private String emailId;
    List<String> listOfTrainee = new ArrayList<>();

    public void traineesData() {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM trainees(?,?,?)");
            ResultSet rs = ps.executeQuery("select * from trainees");
            System.out.println(rs);
            while (rs.next()) {
                System.out.println("id :: " + rs.getInt(1));
                System.out.println("name ::" + rs.getString(2));
                System.out.println("emailId ::" + rs.getString(3));
                listOfTrainee.add(String.valueOf(rs.getInt(1)));
                listOfTrainee.add(rs.getString(2));
                listOfTrainee.add(rs.getString(3));
            }
            System.out.println(listOfTrainee);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeFile() {
        try {
            FileWriter fr = new FileWriter("/home/nms/Trainees.txt");
            BufferedWriter br = new BufferedWriter(fr);
            int row = 1;
            for (String string : listOfTrainee) {
                br.write(string);
                br.newLine();
            }
            br.close();
            fr.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        Trainees trainee = new Trainees();
        trainee.traineesData();
        trainee.writeFile();
    }
}




