package in.co.nmsworks.week3.day3;

import java.sql.*;

public class JDBCTraining {
    public static void main(String[] args) {
        new JDBCTraining().executeQuery();
    }
    public void executeQuery(){
        try {
           Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
//            Statement stmt=con.createStatement();
////            stmt.execute("insert into student values(16,'Abi','DEV')");
//            int row=stmt.executeUpdate("insert into student values(16,\"Abi\",\"Dev\")");
//            System.out.println(row);
//            ResultSet rs=stmt.executeQuery("select * from student order by id");
//            while (rs.next()){
//                System.out.println("id = "+rs.getInt("id")+"   name = "+rs.getString(2));
//            }
//
//            rs.close();
//            stmt.close();

            PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?)");
            ps.setInt(1,7);
            ps.setString(2,"Abi");
            ps.setString(3,"dev");
            System.out.println(ps.executeUpdate());
            con.close();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }
}
