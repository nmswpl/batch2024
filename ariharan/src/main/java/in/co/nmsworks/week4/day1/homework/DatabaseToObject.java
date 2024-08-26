package in.co.nmsworks.week4.day1.homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

public class DatabaseToObject {
    public static void main(String[] args){
        Map<Integer,Student> idToStudent =new DatabaseToObject().retriveFromDb();
        System.out.println(idToStudent);
    }
    public Map<Integer,Student> retriveFromDb(){
        Map<Integer,Student> idToStudent=new HashMap<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
            PreparedStatement ps=con.prepareStatement("Select * from Students");
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
               Student student=new Student();
               student.setId(rs.getInt(1));
               student.setName(rs.getString(2));
               student.setMathsMark(rs.getInt(3));
               student.setEnglishMark(rs.getInt(4));
               student.setScienceMark(rs.getInt(5));
               student.setHistoryMark(rs.getInt(6));
               idToStudent.put(rs.getInt(1),student);

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return idToStudent;
    }
}
