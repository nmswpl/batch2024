package in.co.nmsworks.week3.assignment.Day3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Trainees {
    public static void main(String[] args) {
        Trainees trainee = new Trainees();
        trainee.arrayList();
        trainee.insertToDatabases();
    }

    List<String[]> valueList = new ArrayList<>();

    public List<String[]> arrayList() {
        String[] v1 = {"1", "jenifer", "jenifer@nmsworks.co.in"};
        String[] v2 = {"2", "premalatha", "premalatha@nmsworks.co.in"};
        String[] v3 = {"3", "aarthi", "aarthi@nmsworks.co.in"};
        String[] v4 = {"4", "madhumitha", "madhumitha@nmsworks.co.in"};
        String[] v5 = {"5", "pavithra", "pavithra@nmsworks.co.in"};
        String[] v6 = {"6", "hariharan", "hariharan@nmsworks.co.in"};
        String[] v7 = {"7", "krishna", "krishna@nmsworks.co.in"};
        String[] v8 = {"8", "arunraj", "arunraj@nmsworks.co.in"};
        String[] v9 = {"9", "priyadharshini", "priyadharshini@nmsworks.co.in"};
        String[] v10 = {"10", "sujaritha", "sujaritha@nmsworks.co.in"};
        String[] v11 = {"11", "jenish", "jenish@nmsworks.co.in"};
        String[] v12 = {"12", "hariharan", "hariharan@nmsworks.co.in"};
        String[] v13 = {"13", "muthuraj", "muthuraj@nmsworks.co.in"};
        String[] v14 = {"14", "ariharan", "ariharan@nmsworks.co.in"};
        String[] v15 = {"15", "siva", "siva@nmsworks.co.in"};

        valueList.add(v1);
        valueList.add(v2);
        valueList.add(v3);
        valueList.add(v4);
        valueList.add(v5);
        valueList.add(v6);
        valueList.add(v7);
        valueList.add(v8);
        valueList.add(v9);
        valueList.add(v10);
        valueList.add(v11);
        valueList.add(v12);
        valueList.add(v13);
        valueList.add(v14);
        valueList.add(v15);

        return valueList;


    }

    public void insertToDatabases() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
            PreparedStatement ps = connection.prepareStatement("INSERT INTO trainees VALUES(?,?,?)");
            for(String[] values : valueList) {
                ps.setInt(1,Integer.parseInt(values[0]));
                ps.setString(2,values[1]);
                ps.setString(3,values[2]);
                int rowsAffected = ps.executeUpdate();
                System.out.println(rowsAffected);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

