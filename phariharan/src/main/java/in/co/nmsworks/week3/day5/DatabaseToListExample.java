package in.co.nmsworks.week3.day5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseToListExample {
    public static void main(String[] args) {
        DatabaseToListExample dbToList = new DatabaseToListExample();
        List<Trainee> traineesList = dbToList.generateListFromDb();
        dbToList.insertIntoFile(traineesList);
    }

    private void insertIntoFile(List<Trainee> traineesList) {
        try (FileWriter fileWriter = new FileWriter("/home/nms/Desktop/output1.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            int counter = 1;
            for (Trainee trainee : traineesList) {
                bufferedWriter.write("********************* " + counter + ". row *********************");
                bufferedWriter.newLine();
                bufferedWriter.write("id :" + trainee.getId() + "\nname: " + trainee.getName() + "\nemailid: " + trainee.getEmailId());
                bufferedWriter.newLine();
                counter += 1;
            }
            System.out.println("----- File written Successfully ----- ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private List<Trainee> generateListFromDb() {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             Statement statement = conn.createStatement()) {
            try (ResultSet rs = statement.executeQuery("Select * from traines")) {
                List<Trainee> traineesList = new ArrayList<>();
                while (rs.next()) {
                    traineesList.add(new Trainee(rs.getInt(1), rs.getString(2), rs.getString(3)));
                }
                return traineesList;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}