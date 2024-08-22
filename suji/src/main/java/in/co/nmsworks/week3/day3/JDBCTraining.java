package in.co.nmsworks.week3.day3;

import java.sql.*;

public class JDBCTraining {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
             Statement stmt = con.createStatement()) {
            // ResultSet rs=stmt.executeQuery("select * from student");
            int noOfRow =stmt.executeUpdate("INSERT INTO student values (21,\"SUJARITHA\",\"DEV\")  ");
            System.out.println(" Rows affceted :: " + noOfRow);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    }

