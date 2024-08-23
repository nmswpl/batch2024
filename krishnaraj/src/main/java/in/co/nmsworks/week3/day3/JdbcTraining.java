package in.co.nmsworks.week3.day3;

import java.sql.*;

public class JdbcTraining {
    public void getTableInformation(){
        String sql ="select * from traines order by id";
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
            Statement statement = connection.createStatement()){
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                System.out.println("Id : " +resultSet.getInt(1));
                System.out.println("Name : " +resultSet.getString(2));
                System.out.println("Dept : " +resultSet.getString(3));
                System.out.println("---------------------------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void insertValuesUsingPrepared(){
     String sql ="insert into traines values(?,?,?)";
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
            PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setInt(1,16);
            preparedStatement.setString(2,"name");
            preparedStatement.setString(3,"name@email.com");

            preparedStatement.executeUpdate();
            System.out.println("The values successfully incerted .");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        JdbcTraining jdbcTraining = new JdbcTraining();
        jdbcTraining.getTableInformation();
        //jdbcTraining.insertValuesUsingPrepared();
    }
}

