package in.co.nmsworks.week3.day5;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TraineeTable {
    public static void main(String[] args) {
        TraineeTable tt = new TraineeTable();
        FileParsing fp = new FileParsing();
        fp.tableToFile(tt.traineeToList());

    }
    public List<Trainees> traineeToList() {

        {
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training", "nms", "");
                PreparedStatement ps = con.prepareStatement("SELECT * FROM trainees");
                ResultSet rs = ps.executeQuery();
                List<Trainees> listOfTrainees = new ArrayList<>();


                while (rs.next()) {
                    Trainees trainee = new Trainees(rs.getInt(1),rs.getString(2),rs.getString(3));
                    listOfTrainees.add(trainee);
                }
                for (Trainees trainee : listOfTrainees){
                    System.out.println(trainee);
                }
                rs.close();
                ps.close();
                con.close();
                return listOfTrainees;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
