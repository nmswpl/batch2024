package in.co.nmsworks.week3.task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcPreparedStatement {


    public void insertRows(int id,String name ,String dept){
        try(Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms","");
            PreparedStatement insert = c.prepareStatement("INSERT INTO student VALUES(?, ?, ?)"))
        {
           insert.setInt(1,id);
            insert.setString(2,name);
            insert.setString(3,dept);
            System.out.println(insert);
            insert.executeUpdate();
            System.out.println("Row inserted");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void updateDept(String dept,String name){
        try(Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms","");
            PreparedStatement update = c.prepareStatement("UPDATE student set dept = ? where name = ?"))
        {
            update.setString(1,dept);
            update.setString(2,name);
            update.executeUpdate();
            System.out.println("Row updated");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void retrieveRows(){
        try(Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms","");
            PreparedStatement select = c.prepareStatement("SELECT * FROM student order by id" ))
        {
           ResultSet rows = select.executeQuery();
           while (rows.next()){
               System.out.print(rows.getInt(1)+" ");
               System.out.print(rows.getString(2)+" ");
               System.out.print(rows.getString(3)+" ");
               System.out.println();
           }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JdbcPreparedStatement j = new JdbcPreparedStatement();
        j.insertRows(16,"Mani","QA");
        j.updateDept("DEV","mani");
        j.retrieveRows();
    }
}
