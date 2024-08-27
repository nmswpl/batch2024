package in.co.nmsworks.week4.day2;

import in.co.nmsworks.week4.day1.Student;
import org.apache.commons.text.RandomStringGenerator;

import javax.imageio.ImageReader;
import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.awt.image.ImageProducer;
import java.sql.*;
import java.util.*;

public class StudentDBWriter
{
    Connection connection;
    ResultSet resultSet;
    PreparedStatement preparedStatement;
    public StudentDBWriter(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms","");

        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws SQLException {
        StudentDBWriter studentDBWriter = new StudentDBWriter();
        try {
            studentDBWriter.addStudent(51,"Hariharan",96,97,93,92);
            studentDBWriter.updateScore("Kumar",96,95,93,88);
            studentDBWriter.removeStudent("english", 80);
            studentDBWriter.findMaimumScore("math");
            System.out.println(studentDBWriter.studentsAboveSpecificScore("history", 88));
            System.out.println(studentDBWriter.retrieveNameSet());
            studentDBWriter.checkExistence("John Doe", "science", 92);
            studentDBWriter.mergeData();
            studentDBWriter.scoreCounter("science");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }


    public void addStudent(int id,String name, int mathsMark,int englishMark, int scienceMark, int historyMark) throws SQLException {
      int i =0;
       try{
           preparedStatement = connection.prepareStatement("insert into Students values(?,?,?,?,?,?)");
           preparedStatement.setInt(1,id);
           preparedStatement.setString(2,name);
           preparedStatement.setInt(3,mathsMark);
           preparedStatement.setInt(4,englishMark);
           preparedStatement.setInt(5,scienceMark);
           preparedStatement.setInt(6,historyMark);

           i += preparedStatement.executeUpdate();

           System.out.println(i+" Rows Affected");
       }catch (Exception e){
           System.out.println(e);
       }finally {
           connection.close();
           preparedStatement.close();
       }
    }

    public void updateScore(String name , int mathsMark, int englishMark, int scienceMark, int historyMark) throws SQLException {
        int i =0;
        try{
            preparedStatement = connection.prepareStatement("update Students set math = ?, english = ?, science = ?, history = ? where name = ?");
            preparedStatement.setInt(1,mathsMark);
            preparedStatement.setInt(2,englishMark);
            preparedStatement.setInt(3,scienceMark);
            preparedStatement.setInt(4,historyMark);
            preparedStatement.setString(5,name);

            i += preparedStatement.executeUpdate();
            System.out.println(i + " Rows Affected");

            if( i == 0){
                int id = (int)(Math.random() * (200-55 + 1) + 55);
                addStudent(id,name,mathsMark,englishMark,scienceMark,historyMark);
            }
        }catch (Exception e){
            System.out.println(e);
        }finally {
            connection.close();
            preparedStatement.close();
        }
    }

    public void removeStudent(String subject, Integer mark) throws SQLException {
        int i =0;
        try {
            String sql = "delete from Students where " + subject + " < ? ";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,mark);
            i += preparedStatement.executeUpdate();
            System.out.println(i + " Row Affected");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            preparedStatement.close();
            connection.close();
        }
    }

    public void findMaimumScore(String subject) throws SQLException {
        int i =0;
        try{
            String sql = "select id, name from Students where " + subject + " = (select max(" + subject + ") from Students)";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                System.out.println("ID: " +resultSet.getInt(1) + " Name :" + resultSet.getString(2));
            }
        }catch (Exception e){
            System.out.println(e);
        }finally {
            connection.close();
            preparedStatement.close();
            resultSet.close();
        }
    }

    public Map<String ,Integer> studentsAboveSpecificScore(String subject, int mark) throws SQLException {
        Map<String, Integer>studentAboveThreshHold = new HashMap<>();
        String sql = " select name, "+subject+" from Students where " + subject +" >= " + mark;
        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                studentAboveThreshHold.put(resultSet.getString(1),resultSet.getInt(2));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            connection.close();
            preparedStatement.close();
            resultSet.close();
        }

        return studentAboveThreshHold;
    }

    public Set<String> retrieveNameSet() throws SQLException {
        Set<String> nameSet = new HashSet<>();
        String sql = "select name from Students";
        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet  = preparedStatement.executeQuery();
            while (resultSet.next()){
                nameSet.add(resultSet.getString(1));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            connection.close();
            resultSet.close();
            preparedStatement.close();
        }
        return  nameSet;
   }

   public void checkExistence(String name, String subject, int score) throws SQLException {
        try {
            String sql = "select name, " +subject+ " from Students where name = " +"\""+ name+"\"" ;
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                if(resultSet.getInt(2) == score){
                    System.out.println(name + " with " + score + " Exist");
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }finally {
            connection.close();
            preparedStatement.close();
            resultSet.close();
        }

   }

   public void mergeData(){
        Map<Integer, Student> studentdata = new HashMap<>();
        studentdata.put(51, new Student(51,"ravi",96,94,93,92));
        studentdata.put(52, new Student(52,"mohan",92,95,93,94));
        studentdata.put(4, new Student(4,"jenish",86,91,87,92));
        int i =0;
        try {
            String sql = "replace into  Students values(?,?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            for(Integer studentID : studentdata.keySet()) {
                preparedStatement.setInt(1, studentdata.get(studentID).getId());
                preparedStatement.setString(2, studentdata.get(studentID).getName());
                preparedStatement.setInt(3, studentdata.get(studentID).getMathMark());
                preparedStatement.setInt(4, studentdata.get(studentID).getEnglishMark());
                preparedStatement.setInt(5, studentdata.get(studentID).getScienceMark());
                preparedStatement.setInt(6, studentdata.get(studentID).getHistoryMark());
            }

             i +=preparedStatement.executeUpdate();
            System.out.println(i + "Rows Affected");
        }catch (Exception e){
            System.out.println(e);
        }
   }

   public void scoreCounter(String subject){
        Map<Integer, Integer> scoreCount = new HashMap<>();
        try {
            String sql = "select  " + subject + ", count(*) from Students group by " + subject;
            System.out.println(sql);
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                System.out.println("Mark: "+resultSet.getInt(1));
                System.out.println("count: "+resultSet.getInt(2));
                scoreCount.put(resultSet.getInt(1), resultSet.getInt(2));
            }
            System.out.println(scoreCount);
        }catch (Exception e){
            System.out.println(e);
        }


   }
}
