package in.co.nmsworks.week3.day3;

import java.sql.*;

public class JDBCTraining {
    public static void main(String[] args) {
        JDBCTraining training = new JDBCTraining();
        try {
            training.executeQuery("select * from student order by id");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        training.updateQuery("insert into student values(16,\"HARIHARAN P\",\"Dev\")");
        training.updateQuery("Delete from student where id = 16");
    }

    private void updateQuery(String query) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             Statement statement = connection.createStatement()) {
            int output = statement.executeUpdate(query);
            System.out.println(output +" lines changed");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void executeQuery(String query) throws SQLException {
        ResultSet output = null;
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             Statement statement = connection.createStatement()) {
            output = statement.executeQuery(query);
            while (output.next()) {
                System.out.println("Student ID : " + output.getInt("id") + "\nStudent Name : " + output.getNString("Name") + "\nDepartment : " + output.getString("Dept"));
                System.out.println("--------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert output != null;
                output.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
