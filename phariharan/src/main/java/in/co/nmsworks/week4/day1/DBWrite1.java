package in.co.nmsworks.week4.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBWrite1 implements Writer {

    @Override
    public void write(String[] inputArray) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO Persondata values (?,?,?,?,?,?,?,?,?,?)"))
        {
            preparedStatement.setLong(1,Long.parseLong(inputArray[0]));
            preparedStatement.setString(2,inputArray[1]);
            preparedStatement.setInt(3,Integer.parseInt(inputArray[2]));
            preparedStatement.setString(4,inputArray[3]);
            preparedStatement.setString(5,inputArray[4]);
            preparedStatement.setString(6,inputArray[5]);
            preparedStatement.setString(7,inputArray[6]);
            preparedStatement.setString(8,inputArray[7]);
            preparedStatement.setInt(9,Integer.parseInt(inputArray[8]));
            preparedStatement.setString(10,inputArray[9]);

            preparedStatement.executeUpdate();
            System.out.println("Inserted into Database !!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
