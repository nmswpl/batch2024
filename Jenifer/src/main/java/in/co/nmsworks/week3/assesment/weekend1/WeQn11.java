package in.co.nmsworks.week3.assesment.weekend1;
/* Write a program that performs the following operations:
     - Connects to a database.
     - Uses a `PreparedStatement` to insert a new record.
     - Uses a `PreparedStatement` to update an existing record.
     - Uses `executeQuery` to retrieve and print data from the table.
 */

import java.sql.*;

public class WeQn11 {
    private int id;
    private String name;
    private String dept;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public WeQn11() {
    }

    public WeQn11(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public WeQn11(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void insertData(){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
            PreparedStatement ps = connection.prepareStatement("insert into student values(?, ?, ?)");
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select *from student");
            while (rs.next()){
                System.out.println("ID : " + rs.getInt(1) + " Name : " + rs.getString(2) + " Dept : " + rs.getString(3));
            }
            ps.setInt(1, getId());
            ps.setString(2, getName());
            ps.setString(3, getDept());
            ps.executeUpdate();
            rs.close();
            ps.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateData(int id, String name){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms", "");
            PreparedStatement ps = connection.prepareStatement("update student set name = ? where id = ?");
            ps.setString(2, getName());
            ps.setInt(1, getId());
            ps.executeUpdate();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select *from student");
            while (rs.next()){
                System.out.println("ID : " + rs.getInt(1) + " Name : " + rs.getString(2) + " Dept : " + rs.getString(3));
            }
            rs.close();
            ps.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
