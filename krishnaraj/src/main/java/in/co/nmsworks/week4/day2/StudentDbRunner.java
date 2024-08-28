package in.co.nmsworks.week4.day2;

import in.co.nmsworks.week4.day1.JdbcWriter;
import in.co.nmsworks.week4.day1.Student;

import javax.security.auth.Subject;
import java.sql.*;

public class StudentDbRunner {
    public void addEnriesToDb(Student student) {
        String url = "jdbc:mysql://localhost:3306/training";
        String sql = "insert into Students values(? , ? , ? , ? , ? ,?)";
        try {
            Connection connection = DriverManager.getConnection(url);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, student.getId());
            preparedStatement.setString(2, student.getName());
            preparedStatement.setInt(3, student.getMath());
            preparedStatement.setInt(4, student.getEnglish());
            preparedStatement.setInt(5, student.getScience());
            preparedStatement.setInt(6, student.getHistory());

            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateStudentScores(Student student) {
        String url = "jdbc:mysql://localhost:3306/training";
        String sql1 = "update Students set math=?,english=?,science=?,history=? where name=?";
        try {
            Connection connection = DriverManager.getConnection(url);
            PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
            preparedStatement1.setInt(1, student.getMath());
            preparedStatement1.setInt(2, student.getEnglish());
            preparedStatement1.setInt(3, student.getScience());
            preparedStatement1.setInt(4, student.getHistory());
            preparedStatement1.setString(5, student.getName());
            preparedStatement1.executeUpdate();
            System.out.println("successfully inserted...");
            preparedStatement1.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void removeStudentsBelowThresHold(Integer threshold) {
        String url = "jdbc:mysql://localhost:3306/training";
        String sql1 = "delete from Students where (math+english+science+history)< ?";
        try {
            Connection connection = DriverManager.getConnection(url);
            PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
            preparedStatement1.setInt(1, threshold);
            System.out.println("Successfully deleted the values below threshold ...");
            preparedStatement1.executeUpdate();
            preparedStatement1.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void findMaximumScore(String subject) {
        String url = "jdbc:mysql://localhost:3306/training";
        String sql1 = "select * from Students order by ? desc limit 1";
        try {
            Connection connection = DriverManager.getConnection(url);
            PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
            preparedStatement1.setString(1, subject);
            ResultSet resultSet = preparedStatement1.executeQuery();
            while (resultSet.next()) {
                System.out.println("id : " + resultSet.getInt(1));
                System.out.println("name : " + resultSet.getString(2));
                System.out.println("math : " + resultSet.getInt(3));
                System.out.println("english : " + resultSet.getInt(4));
                System.out.println("science : " + resultSet.getInt(5));
                System.out.println("history : " + resultSet.getInt(6));
            }
            preparedStatement1.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getAllScoreAbovethreshold(Integer threshold) {
        String url = "jdbc:mysql://localhost:3306/training";
        String sql1 = "select * from Students where (math+english+science+history)> ?";
        try {
            Connection connection = DriverManager.getConnection(url);
            PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
            preparedStatement1.setInt(1, threshold);
            ResultSet resultSet = preparedStatement1.executeQuery();
            while (resultSet.next()) {
                System.out.println("id : " + resultSet.getInt(1));
                System.out.println("name : " + resultSet.getString(2));
                System.out.println("math : " + resultSet.getInt(3));
                System.out.println("english : " + resultSet.getInt(4));
                System.out.println("science : " + resultSet.getInt(5));
                System.out.println("history : " + resultSet.getInt(6));
            }
            preparedStatement1.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getAllStudents() {
        String url = "jdbc:mysql://localhost:3306/training";
        String sql1 = "select * from Students";
        try {
            Connection connection = DriverManager.getConnection(url);
            PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
            ResultSet resultSet = preparedStatement1.executeQuery();
            while (resultSet.next()) {
                System.out.println("id : " + resultSet.getInt(1));
                System.out.println("name : " + resultSet.getString(2));
                System.out.println("math : " + resultSet.getInt(3));
                System.out.println("english : " + resultSet.getInt(4));
                System.out.println("science : " + resultSet.getInt(5));
                System.out.println("history : " + resultSet.getInt(6));
            }
            preparedStatement1.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void checkExistenceOfStudentAndScore(String name,String subject,Integer score) {
        String url = "jdbc:mysql://localhost:3306/training";
        String sql1 = "select * from Students where name=? and ? = ?";
        try {
            Connection connection = DriverManager.getConnection(url);
            PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
            preparedStatement1.setString(1, name);
            preparedStatement1.setString(2, subject);
            preparedStatement1.setInt(3, score);
            ResultSet resultSet = preparedStatement1.executeQuery();

            if(resultSet.next()){
                System.out.println("id : " + resultSet.getInt(1));
                System.out.println("name : " + resultSet.getString(2));
                System.out.println("math : " + resultSet.getInt(3));
                System.out.println("english : " + resultSet.getInt(4));
                System.out.println("science : " + resultSet.getInt(5));
                System.out.println("history : " + resultSet.getInt(6));
            }else {
                System.out.println("Student values not exist in table...");
            }
            preparedStatement1.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void groupingStudentsByScore(String subject) {
        String url = "jdbc:mysql://localhost:3306/training";
        String sql1 = "select "+ subject +",count(id) from Students group by "+subject;
        System.out.println(sql1);
        try {
            Connection connection = DriverManager.getConnection(url);
            PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
            ResultSet resultSet = preparedStatement1.executeQuery();
            while (resultSet.next()){
                System.out.print("Score : " + resultSet.getInt(1));
                System.out.println("   counts : " + resultSet.getInt(2));
            }
            preparedStatement1.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
//        StudentDbRunner studentDbRunner = new StudentDbRunner();
//        studentDbRunner.addEnriesToDb(new Student(52,"krish",50,50,50,50));
//        studentDbRunner.updateStudentScores(new Student(52,"krish",1,1,1,1));
//        studentDbRunner.removeStudentsBelowThresHold(10);
//        studentDbRunner.findMaximumScore("math");
//        studentDbRunner.getAllScoreAbovethreshold(360);
//        studentDbRunner.getAllStudents();
//        studentDbRunner.checkExistenceOfStudentAndScore("krish","math",50);
//        studentDbRunner.groupingStudentsByScore("math");

    }
}
