package in.co.nmsworks.week4.day1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbWriter implements Writer {
    PreparedStatement insert;
    Connection c;
    @Override
    public void open() throws IOException, SQLException {
         c = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
         insert = c.prepareStatement("INSERT INTO citizen VALUES(?,?,?,?,?,?,?,?,?,?)");
    }

    @Override
    public void write(Writer w, String[] arr) throws SQLException {

            insert.setInt(1, Integer.parseInt(arr[0]));
            insert.setString(2, arr[1]);
            insert.setInt(3, Integer.parseInt(arr[2]));
            insert.setString(4, arr[3]);
            insert.setString(5, arr[4]);
            insert.setString(6, arr[5]);
            insert.setString(7, arr[6]);
            insert.setString(8, arr[7]);
            insert.setLong(9, Long.parseLong(arr[8]));
            insert.setString(10, arr[9]);
            insert.executeUpdate();

    }

    @Override
    public void close() {
        try {
            c.close();
            insert.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
