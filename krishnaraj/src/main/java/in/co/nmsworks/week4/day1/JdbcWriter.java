package in.co.nmsworks.week4.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcWriter implements Writer1 {
    private Connection connection;
    private PreparedStatement preparedStatement;
    private static final String URL = "jdbc:mysql://localhost:3306/Employee1";

    @Override
    public void open() {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(URL);
                System.out.println("Connection was established successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error in JDBC connection...");
        }
    }

    @Override
    public void writer(String[] stringArray) {
        String sql = "INSERT INTO employee VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            // Initialize preparedStatement if it's closed or null
            if (preparedStatement == null || preparedStatement.isClosed()) {
                preparedStatement = connection.prepareStatement(sql);
            }
            int id = Integer.parseInt(stringArray[0]);
            String name = stringArray[1];
            int age = Integer.parseInt(stringArray[2]);
            String email = stringArray[3];
            String phone = stringArray[4];
            String address = stringArray[5];
            String city = stringArray[6];
            String state = stringArray[7];
            int zipcode = Integer.parseInt(stringArray[8]);
            String country = stringArray[9];

            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setInt(3, age);
            preparedStatement.setString(4, email);
            preparedStatement.setString(5, phone);
            preparedStatement.setString(6, address);
            preparedStatement.setString(7, city);
            preparedStatement.setString(8, state);
            preparedStatement.setInt(9, zipcode);
            preparedStatement.setString(10, country);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error in SQL execution...");
        }
    }

    @Override
    public void close() {
        try {
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error closing JDBC resources...");
        }
    }
}