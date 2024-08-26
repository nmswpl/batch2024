package in.co.nmsworks.week4.day1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DbWriter implements Writer{

    private  Connection connection;
    private PreparedStatement preparedStatement;
    public void open(){
       try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms","");
       }catch (Exception e){
           System.out.println(e);
       }
    }

    @Override
    public void write(String[] maleemployeeData) {
        try {
            preparedStatement = connection.prepareStatement("insert into emp values(?,?,?,?,?,?,?,?,?,?)");
            preparedStatement.setInt(1,Integer.parseInt(maleemployeeData[0]));
            preparedStatement.setString(2,maleemployeeData[1]);
            preparedStatement.setString(3,maleemployeeData[2]);
            preparedStatement.setString(4,maleemployeeData[3]);
            preparedStatement.setString(5,maleemployeeData[4]);
            preparedStatement.setString(6,maleemployeeData[5]);
            preparedStatement.setString(7,maleemployeeData[6]);
            preparedStatement.setString(8,maleemployeeData[7]);
            preparedStatement.setInt(9,Integer.parseInt(maleemployeeData[8]));
            preparedStatement.setString(10,maleemployeeData[9]);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public void close() {
        try {
           connection.close();
           preparedStatement.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
