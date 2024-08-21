package in.co.nmsworks.week3.Day3;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        Q1 q1 = new Q1();
        q1.fillTable();
    }

    public List<String[]> createList() {
        List<String[]> traineeList = new ArrayList<>();
        traineeList.add(new String[]{"1", "jenifer", "jenifer@nmsworks.co.in"});
        traineeList.add(new String[]{"2", "premalatha", "premalatha@nmsworks.co.in"});
        traineeList.add(new String[]{"3", "aarthi", "aarthi@nmsworks.co.in"});
        traineeList.add(new String[]{"4", "madhumitha", "madhumitha@nmsworks.co.in"});
        traineeList.add(new String[]{"5", "pavithra", "pavithra@nmsworks.co.in"});
        traineeList.add(new String[]{"6", "hariharan", "hariharan@nmsworks.co.in"});
        traineeList.add(new String[]{"7", "krishna", "krishna@nmsworks.co.in "});
        traineeList.add(new String[]{"8", "arunraj", "arunraj@nmsworks.co.in"});
        traineeList.add(new String[]{"9", "priyadharshini", "priyadharshini@nmsworks.co.in"});
        traineeList.add(new String[]{"10", "sujaritha", "sujaritha@nmsworks.co.in"});
        traineeList.add(new String[]{"11", "jenish", "jenish@nmsworks.co.in "});
        traineeList.add(new String[]{"12", "hariharan", "hariharan@nmsworks.co.in "});
        traineeList.add(new String[]{"13", "muthuraj", "muthuraj@nmsworks.co.in"});
        traineeList.add(new String[]{"14", "ariharan", "ariharan@nmsworks.co.in "});
        traineeList.add(new String[]{"15", "siva", "siva@nmsworks.co.in"});
        return traineeList;
    }

    public List<List<String>> createListOfList() {
        List<String[]> stringarrayList = createList();
        List<List<String>> employeeList = new ArrayList<>(Collections.emptyList());
        for (String[] strings : stringarrayList) {
            employeeList.add(Arrays.asList(strings));
        }
        return employeeList;
    }

    public void fillTable() {
        List<List<String>> lists = createListOfList();
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
             Statement s = connection.createStatement();
             PreparedStatement ps = connection.prepareStatement("INSERT INTO trainees VALUES(?,?,?)")) {
            s.executeUpdate("Truncate table trainees");
            for (List<String> list : lists) {

                ps.setInt(1, Integer.parseInt(list.get(0)));
                ps.setString(2, list.get(1));
                ps.setString(3, list.get(2));
                ps.executeUpdate();
            }
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

}
