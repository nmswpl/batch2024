package in.co.nmsworks.week4.day2;

import in.co.nmsworks.week4.day1.homework.Student;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentDataBase {
    Scanner scanner=new Scanner(System.in);
    Connection connection;
    static int counter=52;
    public StudentDataBase(){
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void addStudent(String name,int mathsMark,int engMark,int sciMark,int historyMark){

        try(PreparedStatement preparedStatement=connection.prepareStatement("insert into Students values(?,?,?,?,?,?)");){

            preparedStatement.setInt(1,counter++);
            preparedStatement.setString(2,name);
            preparedStatement.setInt(3,mathsMark);
            preparedStatement.setInt(4,engMark);
            preparedStatement.setInt(5,sciMark);
            preparedStatement.setInt(6,historyMark);
            preparedStatement.execute();
            System.out.println("successfully added into the database");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void updateScores(String name,int mathsMark,int engMark,int sciMark,int historyMark){
        try(PreparedStatement ps=connection.prepareStatement("select* from Students");) {
            ResultSet rs= ps.executeQuery();
            boolean add=true;
            while(rs.next()){
                if(rs.getString(2).equalsIgnoreCase(name)){
                    //mysql> update person set id=2 where name="ari";

                    PreparedStatement preparedStatement=connection.prepareStatement("update Students set math=?,english=?,science=?,history=? where name=?");
                    preparedStatement.setInt(1,mathsMark);
                    preparedStatement.setInt(2,engMark);
                    preparedStatement.setInt(3,sciMark);
                    preparedStatement.setInt(4,historyMark);
                    preparedStatement.setString(5,name);
                    preparedStatement.execute();
                    add=false;
                    preparedStatement.close();
                    System.out.println("successfully added");
                }
            }
            if (add)
                addStudent(name,mathsMark,engMark,sciMark,historyMark);
            rs.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void removeStudentsBasedOnMarks(String subjectName,int marks){
        try{
            PreparedStatement ps=connection.prepareStatement("delete from Students where "+subjectName+" < ?");
            ps.setInt(1,marks);
            ps.execute();
            System.out.println("successfully deleted");
            ps.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void findmax(String subName){
        try (PreparedStatement ps=connection.prepareStatement("select * from Students where "+subName+"?=(select max("+subName+") from Students")){
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString(2));
            }
            rs.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void getScoresAboveThreshold(String subjectName,int threshold){
        try (PreparedStatement ps =connection.prepareStatement("select * from Students where "+subjectName+">=?")){
            ps.setInt(1,threshold);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                System.out.println("id::"+rs.getInt(1));
                System.out.print("\tname::"+rs.getString(2));
            }
            rs.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public  void getAllStudents(){
        try (PreparedStatement ps=connection.prepareStatement("select name from Students")){
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString(1));
            }
            rs.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void checkExistence(String name,String subName,int mark){
        try(PreparedStatement ps=connection.prepareStatement("select * from Students where name=? && "+subName+"=?")) {
            ps.setString(1,name);
            ps.setInt(2,mark);
            ResultSet rs= ps.executeQuery();
            if (rs==null)
                System.out.println("not exists");
            else
                System.out.println("student exists");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void specificMarksToStudents(String subname){
        Map<Integer,Integer> marksToNoOfStudents=new HashMap<>();
        int val;
        try(PreparedStatement ps=connection.prepareStatement("select "+subname+" from Students");) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
               int mark= rs.getInt(1);
               if(marksToNoOfStudents.containsKey(mark)){
                   val=marksToNoOfStudents.get(mark)+1;
               }
               else
                   val=1;
               marksToNoOfStudents.put(mark,val);
            }
            System.out.println(marksToNoOfStudents);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
