package in.co.nmsworks.week4.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDb {
    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
    PreparedStatement ps = c.prepareStatement("insert into Students VALUES(?,?,?,?,?)");

    public StudentDb() throws SQLException {
    }
    public void addEntry(int id,String name,int math,int eng,int sci,int his) throws SQLException {
      ps.setInt(1,id);
      ps.setString(2,name);
        ps.setInt(3,math);
        ps.setInt(4,eng);
        ps.setInt(5,sci);
        ps.setInt(6,his);
        ps.executeUpdate();
        System.out.println();


    }
}
