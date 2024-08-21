package in.co.nmsworks.week3.day3;

import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        JDBCExample jdbc = new JDBCExample();
        jdbc.executeQuery();
    }
    public void executeQuery() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training", "nms", "");
             Statement statement = connection.createStatement()) {

            String sql = "insert into Student values(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,3);
            preparedStatement.setString(2,"John");
            preparedStatement.setString(3,"john@gmail.com");

            int noOfRows = preparedStatement.executeUpdate();
            System.out.println(noOfRows+ "rows affected");
//            int noOfRows = statement.executeUpdate("update Student set id = 2 where name = 'Sam'");
//            System.out.println(noOfRows+ "rows affected");
//            while (rs.next()) {
//                System.out.println("Student id :: " + rs.getInt(1));
//                System.out.println("Student Name :: " + rs.getString("Name"));
//                System.out.println("Student emailId :: " + rs.getString(3));
//            }
//            rs.close();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}