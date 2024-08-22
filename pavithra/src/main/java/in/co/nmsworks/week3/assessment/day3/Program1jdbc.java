package in.co.nmsworks.week3.assessment.day3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Program1jdbc {

    public List<String[]> listArray() {
        String[] values1 = new String[]{"1", "jenifer", "jenifer@nmsworks.co.in"};
        String[] values2 = new String[]{"2", "premalatha", "premalatha@nmsworks.co.in"};
        String[] values3 = new String[]{"3", "aarthi", "aarthi@nmsworks.co.in"};
        String[] values4 = new String[]{"4", "madhumitha", "madhumitha@nmsworks.co.in"};
        String[] values5 = new String[]{"5", "pavithra", "pavithra@nmsworks.co.in"};
        String[] values6 = new String[]{"6", "hariharan", "hariharan@nmsworks.co.in"};
        String[] values7 = new String[]{"7", "krishna", "krishna@nmsworks.co.in"};
        String[] values8 = new String[]{"8", "arunraj", "arunraj@nmsworks.co.in"};
        String[] values9 = new String[]{"9", "priyadharshini", "priyadharshini@nmsworks.co.in"};
        String[] values10 = new String[]{"10", "sujaritha", "sujaritha@nmsworks.co.in"};
        String[] values11 = new String[]{"11", "jenish", "jenish@nmsworks.co.in"};
        String[] values12 = new String[]{"12", "hariharankr", "hariharankr@nmsworks.co.in"};
        String[] values13 = new String[]{"13", "muthuraj", "muthuraj@nmsworks.co.in"};
        String[] values14 = new String[]{"14", "ariharan", "ariharan@nmsworks.co.in"};
        String[] values15 = new String[]{"15", "siva", "siva@nmsworks.co.in"};

        List<String[]> valueLists = new ArrayList<>();
        valueLists.add(values1);
        valueLists.add(values2);
        valueLists.add(values3);
        valueLists.add(values4);
        valueLists.add(values5);
        valueLists.add(values6);
        valueLists.add(values7);
        valueLists.add(values8);
        valueLists.add(values9);
        valueLists.add(values10);
        valueLists.add(values11);
        valueLists.add(values12);
        valueLists.add(values13);
        valueLists.add(values14);
        valueLists.add(values15);

        return valueLists;
    }

    public void fillTable() {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "")) {

            PreparedStatement ps = con.prepareStatement("INSERT INTO trainees values(?,?,?)");

            List<String[]> listArray = listArray();

            for (String[] values : listArray) {

                ps.setInt(1, Integer.parseInt(values[0]));
                ps.setString(2, values[1]);
                ps.setString(3, values[2]);


                int rows = ps.executeUpdate();
                System.out.println(rows);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

       public static void main(String[] args) {
           Program1jdbc p1 = new Program1jdbc();
           p1.fillTable();
    }
}
