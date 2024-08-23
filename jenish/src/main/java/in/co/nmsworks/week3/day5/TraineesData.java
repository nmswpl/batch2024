package in.co.nmsworks.week3.day5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TraineesData {
    public List<Trainee> getDataFromDb(){
        List<Trainee> traineeList = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training", "nms", "");
             Statement statement = connection.createStatement()) {

            String sql = "select * from trainees";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String emailId = rs.getString(3);
                Trainee t1 = new Trainee(id,name,emailId);
                traineeList.add(t1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return traineeList;
    }

    public void writeIntoFIle(List<Trainee> traineeList){
        try(FileWriter writer = new FileWriter("/home/nms/TraineesData.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

            for (Trainee trainee : traineeList) {
                bufferedWriter.write("Id: "+trainee.getId()+"\n");
                bufferedWriter.write("Name: "+trainee.getName()+"\n");
                bufferedWriter.write("EmailId: "+trainee.getEmailId()+"\n");
                bufferedWriter.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TraineesData traineesData = new TraineesData();
        traineesData.getDataFromDb();
        traineesData.writeIntoFIle(traineesData.getDataFromDb());
    }
}