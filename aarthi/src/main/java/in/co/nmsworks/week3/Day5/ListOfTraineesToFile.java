package in.co.nmsworks.week3.Day5;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ListOfTraineesToFile {
    public List<Trainees> createList(){

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
            Statement stmt = connection.createStatement();
            //ResultSet rs = stmt.executeQuery("Select * from trainees");
            List<Trainees> listOfTrainees = new ArrayList<>();

            for(Trainees value : listOfTrainees){
                //rs.getInt(1);
                //rs.getString(2);
                //rs.getString(3);
            }
            //rs.close();
            stmt.close();
            connection.close();
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
        return createList();
    }

    public static void main(String[] args) {
        ListOfTraineesToFile listOfTraineesToFile = new ListOfTraineesToFile();
        listOfTraineesToFile.createList();
    }
}

