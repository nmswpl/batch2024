package in.co.nmsworks.week3.assessment.day3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCTraining {

    String[] values0 = new String[]{"17" , "Sachin" , " 435678"};
    String[] values1 = new String[]{"18" , "Dhoni" , "876548"};
    String[] values2 = new String[]{"19" , "Hardik" , "987654"};

    public void preparedStatement(){
        List<String[]> valueLists = new ArrayList<>();
        valueLists.add(values0);
        valueLists.add(values1);
        valueLists.add(values2);


    }




    public static void main(String[] args) {

        JDBCTraining jdbc = new JDBCTraining();
        jdbc.connectToDatabase();
        jdbc.writeToDatabase();

    }

    public void writeToDatabase()
    {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms","");

            Statement stmt = con.createStatement();

            int rs = stmt.executeUpdate("insert into student values(16,\"hellen\",\"CSE\")");
            System.out.println(rs);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public void connectToDatabase()
    {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms","");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from student ");
            System.out.println(rs);
            while(rs.next()){
                System.out.println("Student id : " + rs.getInt(1));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
