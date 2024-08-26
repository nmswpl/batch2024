package in.co.nmsworks.week4.day1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//"ID","Name","Age","Email","Phone","Address","City","State","ZipCode","Country"


public class  WriteToDatabase implements Writer {
    Connection con;
    PreparedStatement ps;

    @Override
    public void open() throws Exception{
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
        ps=con.prepareStatement("insert into employees values(?,?,?,?,?,?,?,?,?,?)");

    }

    public void write(String[] details){
        try {
            ps.setInt(1,Integer.parseInt(details[0]));
            ps.setString(2,details[1]);
            ps.setInt(3,Integer.parseInt(details[2]));
            ps.setString(4,details[3]);
            ps.setString(5,details[4]);
            ps.setString(6,details[5]);
            ps.setString(7,details[6]);
            ps.setString(8,details[7]);
            ps.setInt(9,Integer.parseInt(details[8]));
            ps.setString(10,details[9]);
            ps.execute();
            System.out.println("successfully inserted");


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void closes() throws Exception{
        ps.close();
        con.close();

    }

}
