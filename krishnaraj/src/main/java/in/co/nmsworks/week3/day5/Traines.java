package in.co.nmsworks.week3.day5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Traines {
    private int id;
    private String name;
    private String email;

    public Traines() {
    }

    public Traines(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Traines> getEmployeeList() {
        String sql = "select * from traines";
        List<Traines> trainesList = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String email = resultSet.getString(3);
                trainesList.add(new Traines(id, name, email));
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return trainesList;
    }
    public void writeDataInFile() throws IOException {
        Traines traines = new Traines();
        List<Traines> trainesList = traines.getEmployeeList();
        try {
            FileWriter fileWriter = new FileWriter("/home/nms/Downloads/traines.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            int count = 1;
            for (Traines traine : trainesList) {
                bufferedWriter.write("*********" + count + ". Row" + "*********");
                bufferedWriter.newLine();
                bufferedWriter.write("Id : " + traine.getId());
                bufferedWriter.newLine();
                bufferedWriter.write("Name : " + traine.getName());
                bufferedWriter.newLine();
                bufferedWriter.write("Email : " + traine.getEmail());
                bufferedWriter.newLine();
                bufferedWriter.write("***********************************");
                bufferedWriter.newLine();
                bufferedWriter.newLine();
                count++;
            }
            System.out.println("The Data incertion was successfully completed ....");
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void printList(){
        Traines traines = new Traines();
        List<Traines> trainesList = traines.getEmployeeList();
        for (Traines traine : trainesList) {
            System.out.println("Id : " + traine.getId());
            System.out.println("Name : " + traine.getName());
            System.out.println("Email : " + traine.getEmail());
        }
    }

    public static void main(String[] args) throws IOException {
        Traines traines = new Traines();
        traines.printList();
        //traines.writeDataInFile();
    }
}



