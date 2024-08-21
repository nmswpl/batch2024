package in.co.nmsworks.week3.day3;

import java.sql.*;

public class ExecuteQuery {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms","");
             Statement statement = connection.createStatement())
        {

            ResultSet resultSet = statement.executeQuery("select * from student order by id");
            while (resultSet.next()){
                System.out.println("Id :"+ resultSet.getInt(1));
            }

            PreparedStatement preparedStatement = connection.prepareStatement("delete from student where id = ?");
            preparedStatement.setInt(1,20);


            int i = preparedStatement.executeUpdate();
            System.out.println(i+" rows Affected");

            resultSet.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
