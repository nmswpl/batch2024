package in.co.nmsworks.week4;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AdminStudent {
    public List<Student> readFromDb(){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms","");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Students");
            List<Student> students = new ArrayList<>();
            while (rs.next()){
                Student student = new Student(rs.getInt(1),rs.getString(2),
                        rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getInt(6));
                students.add(student);
            }
            System.out.println(students);

            stmt.close();
            con.close();

            return students;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
