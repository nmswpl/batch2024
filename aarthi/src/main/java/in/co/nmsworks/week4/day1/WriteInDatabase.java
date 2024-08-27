package in.co.nmsworks.week4.day1;

import java.sql.*;

public class WriteInDatabase implements Writer {
    Connection connection;
    PreparedStatement preparedStatement;

    @Override
    public void open() throws Exception{
        connection = DriverManager.getConnection("jdbc:mysql://localhost: 3306/training","nms","");
        preparedStatement = connection.prepareStatement("Insert into employee values(?,?,?,?,?,?,?,?,?,?)");

    }

    @Override
    public void write(String[] data)throws Exception{
        for (String string : data) {
            preparedStatement.setInt(1,Integer.parseInt(data[0]));
            preparedStatement.setString(2,data[1]);
            preparedStatement.setInt(3, Integer.parseInt(data[2]));
            preparedStatement.setString(4,data[3]);
            preparedStatement.setString(5,data[4]);
            preparedStatement.setString(6,data[5]);
            preparedStatement.setString(7,data[6]);
            preparedStatement.setString(8,data[7]);
            preparedStatement.setInt(9,Integer.parseInt(data[8]));
            preparedStatement.setString(10,data[9]);
        }
        preparedStatement.executeQuery();
    }

    @Override
    public void close()throws Exception {
        preparedStatement.close();
        connection.close();

    }
}
