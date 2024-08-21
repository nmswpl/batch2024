package in.co.nmsworks.week3.day3;

import java.sql.*;

public class JDBCtraining {
    public static void main(String[] args) {
//        executeQuery();
//        updateQuery();
        preparedStatement();
    }

    private static void preparedStatement() {

        try (Connection con = DriverManager.getConnection("jdbc:msql://localhost:3306"))
        {
            PreparedStatement ps = con.prepareStatement("INSERT INTO student VALUES ( ?, ?, ?)");
            ps.setInt(1,17);
            ps.setString(2,"Helen");
            ps.setString(3,"");

        }
        catch (Exception e)
        {
            System.out.println("Something went wrong!");

        }
    }

    private static void updateQuery() {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training"); Statement stmt = con.createStatement())
        {
            stmt.executeUpdate("INSERT INTO student values(16,\"John Blesswin\",\"QA\")");
            stmt.executeUpdate("INSERT INTO student values(17, \"Felix\",\"QA\")");
            System.out.println("Query executed Successfully");
        }
        catch (SQLException e)
        {
            System.out.println("Something went wrong!");
            throw new RuntimeException(e);
        }

    }

    private static void executeQuery() {

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training"); Statement stmt = con.createStatement();)
        {
            System.out.println(con.getAutoCommit());
            try (ResultSet res = stmt.executeQuery("SELECT * FROM student ORDER BY id");)
            {
                while (res.next()) {
                    System.out.println("ID :: " + res.getInt(1));
                    System.out.println("Name :: " + res.getString(2));
                }
            }
        }
        catch (SQLException e) {
            System.out.println("Something went wrong!");
            throw new RuntimeException(e);
        }
    }
}
