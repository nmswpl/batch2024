package in.co.nmsworks.week3.day3;

import java.sql.*;

public class JDBCTraining {
    public void insertToDatabase(){
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms","");

            Statement stm = connection.createStatement())
        {
            int r = stm.executeUpdate("INSERT INTO student values(20,\"abed\",\"cse\")");
            System.out.println(r + " rows affected");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void connectToDatabase(){
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms","");

            PreparedStatement ps = connection.prepareStatement("INSERT INTO student values (? ? ?)"))
        {
            ResultSet rs = ps.executeQuery("select * from student");
            while (rs.next()){
                System.out.println("Emp id :: " + rs.getInt(1));
            }
            rs.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
       /* public void insert {
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");

                 Statement stm = connection.createStatement()) {
                ResultSet rs = stm.executeQuery("select * from student");

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        //public static void main(String[] args) {

        JDBCTraining training = new JDBCTraining();
        training.connectToDatabase();
        training.insertToDatabase();*/
    }
}
