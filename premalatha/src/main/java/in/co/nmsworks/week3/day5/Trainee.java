package in.co.nmsworks.week3.day5;

import in.co.nmsworks.week3.day2.Candidate;
import in.co.nmsworks.week3.day2.getCandidateDetails;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Trainee {
    private int id;
    private String name;
    private String emailid;

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getTraineesFromDatabase() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
             Statement stm = connection.createStatement()) {
            ResultSet rs = stm.executeQuery("select * from trainees");
            while (rs.next()) {
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
            }

            FileReader reader = new FileReader("trainee");
            BufferedReader bufferedReader = new BufferedReader(reader);
            List<Trainee> trainees = new ArrayList<>();
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] traineeList;
                traineeList = line.split(",");
                int id = Integer.parseInt(traineeList[0]);
                String name = traineeList[1];
                String emailId = traineeList[2];
                Trainee traineeDetails = new Trainee();
                trainees.add(traineeDetails);
                line = bufferedReader.readLine();
            }
            for (int i = 0; i < trainees.size(); i++) {
                System.out.println(trainees.get(i));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        Trainee t = new Trainee();
        t.getTraineesFromDatabase();
    }
}
