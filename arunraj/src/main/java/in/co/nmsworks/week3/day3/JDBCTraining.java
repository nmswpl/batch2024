package in.co.nmsworks.week3.day3;

import java.sql.*;

public class JDBCTraining {
    public static void main(String[] args) {
        JDBCTraining jdbc = new JDBCTraining();
        //jdbc.executeQuery();
        //jdbc.updateQuery();
        //jdbc.deleteQuery();
        jdbc.prepared();
    }
    public void executeQuery(){
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training","nms","");
             Statement stmt = con.createStatement())
        {

            ResultSet rs = stmt.executeQuery("select * from student");
            while (rs.next()){
                System.out.println("Student Id : "+rs.getInt(1));
                System.out.println("Student Name : "+rs.getString(2));
                System.out.println("Department : "+rs.getString(3));
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void updateQuery() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training", "nms", "");
            Statement stmt = con.createStatement();

            int update = stmt.executeUpdate("insert into student (id, name, dept) values (16,'Arunraj','Developer') ");
            /*ResultSet rs = stmt.executeQuery("select id from student ORDER BY id");
            while (rs.next()){
                System.out.println(" "+rs.getInt(1));
                System.out.println(" "+rs.getString(2));
                System.out.println(" "+rs.getString(3));
            }*/
            //rs.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteQuery(){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training", "nms", "");
            Statement stmt = con.createStatement();
            int delete = stmt.executeUpdate("DELETE from student WHERE id=16");

            ResultSet rs = stmt.executeQuery("select * from student");
            while (rs.next()){
                System.out.println(" "+rs.getInt(1));
                System.out.println(" "+rs.getString(2));
                System.out.println(" "+rs.getString(3));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void prepared(){
        String[] values = {"16,Messi","player"};
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3309/Training","nms","");
            PreparedStatement ps = con.prepareStatement("INSERT INTO students values(?,?,?)");

        for(String value : values) {
            ps.setInt(1, Integer.parseInt(values[0]));
            ps.setString(2, values[1]);
            ps.setString(3, values[2]);
            ps.executeUpdate();
        }

        ps.close();
        con.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
