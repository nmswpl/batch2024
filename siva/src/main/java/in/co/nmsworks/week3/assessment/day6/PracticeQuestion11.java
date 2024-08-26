package in.co.nmsworks.week3.assessment.day6;

import java.sql.*;

/**
 * 11. Write a program that performs the following operations:
 *      - Connects to a database.
 *      - Uses a `PreparedStatement` to insert a new record.
 *      - Uses a `PreparedStatement` to update an existing record.
 *      - Uses `executeQuery` to retrieve and print data from the table.
 */

public class PracticeQuestion11 {
    public static void main(String[] args) {

    }
    public void insertDb(){
        try(  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
              PreparedStatement ps = con.prepareStatement("Insert into candidate into (?,?,?,?,?,?,?) ")) {

            ps.setInt(1,41);
            ps.setLong(2,810020104);
            ps.setString(3,"Siva");
            ps.setString(4,"Cse");
            ps.setString(5,"Uce Trichy");
            ps.setString(6,"DEV");
            ps.setString(7,"Accepted");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void executeQuery(){

            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training ");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select id,name,dept from student");
                while(rs.next())
                {
                    System.out.println("Student ID :: "+rs.getInt(1)+" - "+"Name :: "+rs.getString(2)+" - "+"Department :: "+rs.getString(3));
                }
                rs.close();
                stmt.close();
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }

