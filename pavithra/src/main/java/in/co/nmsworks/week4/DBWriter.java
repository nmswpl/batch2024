package in.co.nmsworks.week4;


import java.sql.*;

public class DBWriter implements Writer{

    Connection con;
    PreparedStatement ps;
    @Override
    public void open() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
            ps = con.prepareStatement("INSERT INTO Emp values(?,?,?,?,?,?,?,?,?,?)");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void write(String[] data) {
        try {
            ps.setInt(1, Integer.parseInt(data[0]));
            ps.setString(2,data[1]);
            ps.setInt(3, Integer.parseInt(data[2]));
            ps.setString(4,data[3]);
            ps.setString(5,data[4]);
            ps.setString(6,data[5]);
            ps.setString(7,data[6]);
            ps.setString(8,data[7]);
            ps.setInt(9, Integer.parseInt(data[8]));
            ps.setString(10,data[9]);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void close() {

        try {
            con.close();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
