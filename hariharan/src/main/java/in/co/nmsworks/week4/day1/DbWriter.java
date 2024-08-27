package in.co.nmsworks.week4.day1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


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
    public void write(List<String[]> evenList) {
        try {

            for (String[] maleEmployeeData : evenList) {
                preparedStatement = connection.prepareStatement("insert into emp values(?,?,?,?,?,?,?,?,?,?)");
                preparedStatement.setInt(1,Integer.parseInt(maleEmployeeData[0]));
                preparedStatement.setString(2,maleEmployeeData[1]);
                preparedStatement.setString(3,maleEmployeeData[2]);
                preparedStatement.setString(4,maleEmployeeData[3]);
                preparedStatement.setString(5,maleEmployeeData[4]);
                preparedStatement.setString(6,maleEmployeeData[5]);
                preparedStatement.setString(7,maleEmployeeData[6]);
                preparedStatement.setString(8,maleEmployeeData[7]);
                preparedStatement.setInt(9,Integer.parseInt(maleEmployeeData[8]));
                preparedStatement.setString(10,maleEmployeeData[9]);
                preparedStatement.executeUpdate();
            }

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
