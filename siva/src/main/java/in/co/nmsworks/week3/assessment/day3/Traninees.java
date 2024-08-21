package in.co.nmsworks.week3.assessment.day3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Traninees {

    public List<String[]> listOfStringArray() {
        String[] details1 = new String[]{"1", "jenifer", "jenifer@nmsworks.co.in"};
        String[] details2 = new String[]{"2", "premalatha", "premalatha@nmsworks.co.in"};
        String[] details3 = new String[]{"3", "aarthi", "aarthi@nmsworks.co.in"};
        String[] details4 = new String[]{"4", "madhumitha", "madhumitha@nmsworks.co.in"};
        String[] details5 = new String[]{"5", "pavithra", "pavithra@nmsworks.co.in"};
        String[] details6 = new String[]{"6", "hariharan", "hariharan@nmsworks.co.in"};
        String[] details7 = new String[]{"7", "krishna", "krishna@nmsworks.co.in"};
        String[] details8 = new String[]{"8", "arunraj", "arunraj@nmsworks.co.in"};
        String[] details9 = new String[]{"9", "priyadharshini", "priyadharshini@nmsworks.co.in"};
        String[] details10 = new String[]{"10", "sujaritha", "sujaritha@nmsworks.co.in"};
        String[] details11 = new String[]{"11", "jenish", "jenish@nmsworks.co.in"};
        String[] details12 = new String[]{"12", "hariharan", "hariharan@nmsworks.co.in"};
        String[] details13 = new String[]{"13", "muthuraj", "muthuraj@nmsworks.co.in"};
        String[] details14 = new String[]{"14", "ariharan", "ariharan@nmsworks.co.in"};
        String[] details15 = new String[]{"15", "siva", "siva@nmsworks.co.in"};

        List<String[]> studentsDetails = new ArrayList<>();
        studentsDetails.add(details1);
        studentsDetails.add(details2);
        studentsDetails.add(details3);
        studentsDetails.add(details4);
        studentsDetails.add(details5);
        studentsDetails.add(details6);
        studentsDetails.add(details7);
        studentsDetails.add(details8);
        studentsDetails.add(details9);
        studentsDetails.add(details10);
        studentsDetails.add(details11);
        studentsDetails.add(details12);
        studentsDetails.add(details13);
        studentsDetails.add(details14);
        studentsDetails.add(details15);
        return studentsDetails;
    }

   /* public void insertValues() {

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training ");
             PreparedStatement ps = con.prepareStatement("INSERT INTO trainees VALUES (?,?,?)")) {

            for (String[] strings : listOfStringArray()) {

                ps.setInt(1, Integer.parseInt(strings[0]));
                ps.setString(2, strings[1]);
                ps.setString(3, strings[2]);
                ps.executeUpdate();

            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }*/

    public List<List<String>> listOfListString() {
        List<List<String>> listOfList = new ArrayList<>();
        List<String[]> trainees = listOfStringArray();
        for (String[] strings : trainees) {

                List<String> stringList =Arrays.asList(strings);
                listOfList.add(stringList);





        }


        return listOfList;
    }
    public void fillValues() {

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training ");
             PreparedStatement ps = con.prepareStatement("INSERT INTO trainees VALUES (?,?,?)")) {
            List<List<String>> listOfList =listOfListString();
            System.out.println(listOfList);
            for (List<String> stringList :listOfList) {
                System.out.println(stringList);

                ps.setInt(1, Integer.parseInt(stringList.get(0)));
                ps.setString(2,stringList.get(1));
                ps.setString(3,stringList.get(2));
                ps.executeUpdate();



            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public static void main(String[] args) {
        Traninees traninees = new Traninees();
        //traninees.insertValues();
        traninees.listOfStringArray();
        traninees.listOfListString();
        traninees.fillValues();

    }
}
