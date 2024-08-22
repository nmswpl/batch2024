package in.co.nmsworks.week3.Day3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCConnector {
    String[] value1 = new String[]{"16","dharshini","CSE"};
    String[] value2 = new String[]{"17","amsa","IT"};



    public void connectToJdbc() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
             Statement stmt = connection.createStatement();) {


            ResultSet rs = stmt.executeQuery("select * from student");
            while (rs.next()) {
                System.out.println(rs.getInt(1)+"::"+rs.getString(2));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }


    public void writeToJdbc() {
        List<String []>valuesList = new ArrayList<>();
        valuesList.add(value1);
        valuesList.add(value2);
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
             PreparedStatement stmt = connection.prepareStatement("insert into student values(?,?,?)");) {

            int numOfRowsAffected = stmt.executeUpdate("insert into student values(16,'hellen','CSE')");


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        JDBCConnector jdbcConnector = new JDBCConnector();
        jdbcConnector.connectToJdbc();
        jdbcConnector.writeToJdbc();


    }
}

