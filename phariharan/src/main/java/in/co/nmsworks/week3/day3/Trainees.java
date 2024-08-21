package in.co.nmsworks.week3.day3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Trainees {
    public static void main(String[] args) {
        Trainees trainees = new Trainees();
        List<String[]> traineesList = trainees.getTraineesList();
        trainees.fillTablesWithListOfStringArray(traineesList);
        List<List<String>> traineesListOfList = trainees.getTraineesListOfList(traineesList);
        trainees.fillTablesWithListOfList(traineesListOfList);
    }

    private List<List<String>> getTraineesListOfList(List<String[]> traineesList) {
        List<List<String>> trainesList = new ArrayList<>();
        for (String[] strings : traineesList) {
            List<String> traineeDetailList = new ArrayList<>();
            for (String string : strings) {
                traineeDetailList.add(string);
                ;
            }
            trainesList.add(traineeDetailList);
        }
        return trainesList;
    }

    private void fillTablesWithListOfList(List<List<String>> traineesList) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             PreparedStatement ps = connection.prepareStatement("Insert into traines values(?,?,?)")) {
            int counter = 0;
            for (List<String> strings : traineesList) {
                ps.setInt(1, Integer.parseInt(strings.get(0)));
                ps.setString(2, strings.get(1));
                ps.setString(3, strings.get(2));
                ps.execute();
                counter++;
            }
            System.out.println(counter + " lines changed");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void fillTablesWithListOfStringArray(List<String[]> traineesList) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             PreparedStatement ps = connection.prepareStatement("Insert into traines values(?,?,?)")) {
            int counter = 0;
            for (String[] strings : traineesList) {
                ps.setInt(1, Integer.parseInt(strings[0]));
                ps.setString(2, strings[1]);
                ps.setString(3, strings[2]);
                ps.execute();
                counter++;
            }
            System.out.println(counter + " lines changed ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private List<String[]> getTraineesList() {
        List<String[]> traineeList = new ArrayList<>();
        traineeList.add(new String[]{"1", "jenifer", "jenifer@nmsworks.co.in"});
        traineeList.add(new String[]{"2", "premalatha", "premalatha@nmsworks.co.in"});
        traineeList.add(new String[]{"3", "aarthi", "aarthi@nmsworks.co.in"});
        traineeList.add(new String[]{"4", "madhumitha", "madhumitha@nmsworks.co.in"});
        traineeList.add(new String[]{"5", "pavithra", "pavithra@nmsworks.co.in"});
        traineeList.add(new String[]{"6", "hariharan", "hariharan@nmsworks.co.in"});
        traineeList.add(new String[]{"7", "krishna", "krishna@nmsworks.co.in"});
        traineeList.add(new String[]{"8", "arunraj", "arunraj@nmsworks.co.in"});
        traineeList.add(new String[]{"9", "priyadharshini", "priyadharshini@nmsworks.co.in"});
        traineeList.add(new String[]{"10", "sujaritha", "sujaritha@nmsworks.co.in"});
        traineeList.add(new String[]{"11", "jenish", "jenish@nmsworks.co.in"});
        traineeList.add(new String[]{"12", "hariharan", "hariharan@nmsworks.co.in"});
        traineeList.add(new String[]{"13", "muthuraj", "muthuraj@nmsworks.co.in"});
        traineeList.add(new String[]{"14", "ariharan", "ariharan@nmsworks.co.in"});
        traineeList.add(new String[]{"15", "siva", "siva@nmsworks.co.in"});

        return traineeList;
    }
}
