package in.co.nmsworks.week3.practicequestions;

import java.sql.*;

public class DatabaseProg
{
    public void connectToDbAndAddRow() throws SQLException
    {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "nms", "");
             PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO student values(?,?,?)"))
        {
            preparedStatement.setString(1, "Pearl Beauty");
            preparedStatement.setString(2, "O");
            preparedStatement.setInt(3, 24);
            int rows = preparedStatement.executeUpdate();
            System.out.println(rows + " Rows affected");
        }
        catch (Exception e)
        {
            System.out.println("Exception..");
        }
    }


    public void updateDb() throws SQLException
    {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "nms", "");
             PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO student values(?,?,?)"))
        {
            preparedStatement.executeUpdate("update student set Name=\"Rapanzel\" where Name=\"Fairytell\" ");
            int rows= preparedStatement.executeUpdate();
            System.out.println(rows+ "  rows affected .");
        }
        catch (Exception e)
        {
            System.out.println("Exception ..");
        }
    }

    public void readDataFromDB() throws SQLException
    {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "nms", "");
             Statement stmt = con.createStatement())
        {
            ResultSet rs = stmt.executeQuery("select * from student");
            for (int i = 0; i < 22; i++)
            {
                if (rs.next())
                {
                    String name = (rs.getString(1));
                    String grade = rs.getString(2);
                    int age = rs.getInt(3);
                    System.out.println("Name : " + name + " Grade : " + grade + " Age : " + age);
                }
            }
        }
    }

public static void main(String[] args) throws SQLException {
    DatabaseProg ob=new DatabaseProg();
   // ob.connectToDbAndAddRow();
    ob.updateDb();
    ob.readDataFromDB();

}
}
