package in.co.nmsworks.week3.day3;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TraineesUpdate {
    public static void main(String[] args) {
        TraineesUpdate tu = new TraineesUpdate();
        tu.insertValues();

    }
    public List<String[]> listOfStringArray(){
        String[] trainee1 = {"1", "jenifer", "jenifer@nmsworks.co.in"};
        String[] trainee2 = {"2", "premalatha", "premalatha@nmsworks.co.in"};
        String[] trainee3 = {"3", "aarthi", "aarthi@nmsworks.co.in"};
        String[] trainee4 = {"4", "madhumitha", "madhumitha@nmsworks.co.in" };
        String[] trainee5 = {"5", "pavithra", "pavithra@nmsworks.co.in" };
        String[] trainee6 = {"6", "hariharan", "hariharan@nmsworks.co.in" };
        String[] trainee7 = {"7", "krishna", "krishna@nmsworks.co.in"  };
        String[] trainee8 = {"8", "arunraj", "arunraj@nmsworks.co.in" };
        String[] trainee9 = {"9", "priyadharshini", "priyadharshini@nmsworks.co.in" };
        String[] trainee10 = {"10", "sujaritha", "sujaritha@nmsworks.co.in" };
        String[] trainee11 = {"11", "jenish", "jenish@nmsworks.co.in" };
        String[] trainee12 = {"12", "hariharan", "hariharan@nmsworks.co.in" };
        String[] trainee13 = {"13", "muthuraj", "muthuraj@nmsworks.co.in" };
        String[] trainee14 = {"14", "ariharan", "ariharan@nmsworks.co.in" };
        String[] trainee15 = {"15", "siva", "siva@nmsworks.co.in" };

        List<String[]> traineesList = new ArrayList<>();
        traineesList.add(trainee1);
        traineesList.add(trainee2);
        traineesList.add(trainee3);
        traineesList.add(trainee4);
        traineesList.add(trainee5);
        traineesList.add(trainee6);
        traineesList.add(trainee7);
        traineesList.add(trainee8);
        traineesList.add(trainee9);
        traineesList.add(trainee10);
        traineesList.add(trainee11);
        traineesList.add(trainee12);
        traineesList.add(trainee13);
        traineesList.add(trainee14);
        traineesList.add(trainee15);

        return traineesList;
    }

    public void insertValues(){

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training","nms","");
            PreparedStatement stmt = con.prepareStatement("INSERT INTO trainees values(?,?,?)");
            //stmt.executeUpdate();

            for(String[] trainees : listOfStringArray()){
                System.out.println(Arrays.toString(trainees));
                stmt.setInt(1,Integer.parseInt(trainees[0]));
                stmt.setString(2,trainees[1]);
                stmt.setString(3,trainees[2]);
                stmt.executeUpdate();
            }

            stmt.close();
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
