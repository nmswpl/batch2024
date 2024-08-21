package in.co.nmsworks.week3.day3;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question1 {
    public List<String[]> listOfStringArray() {
        List<String[]> traineesList = new ArrayList<>();
        traineesList.add(new String[]{"1", "jenifer", "jenifer@nmsworks.co.in"});
        traineesList.add(new String[]{"2", "premalatha", "premalatha@nmsworks.co.in"});
        traineesList.add(new String[]{"3", "aarthi", "aarthi@nmsworks.co.in"});
        traineesList.add(new String[]{"4", "pavithra", "pavithra@nmsworks.co.in"});
        traineesList.add(new String[]{"5", "madhumitha", "madhumitha@nmsworks.co.in"});
        traineesList.add(new String[]{"6", "hariharan p", "phariharan@nmsworks.co.in"});
        traineesList.add(new String[]{"7", "krishna", "krishna@nmsworks.co.in"});
        traineesList.add(new String[]{"8", "arunraj", "arunraj@nmsworks.co.in"});
        traineesList.add(new String[]{"9", "priyadharshini", "priyadharshini@nmsworks.co.in"});
        traineesList.add(new String[]{"10", "sujaritha", "sujaritha@nmsworks.co.in"});
        traineesList.add(new String[]{"11", "jenish", "jenish@nmsworks.co.in"});
        traineesList.add(new String[]{"12", "hariharan kr", "krhariharan@nmsworks.co.in"});
        traineesList.add(new String[]{"13", "muthuraj", "muthuraj@nmsworks.co.in"});
        traineesList.add(new String[]{"14", "ariharan", "ariharan@nmsworks.co.in"});
        traineesList.add(new String[]{"15", "siva", "siva@nmsworks.co.in"});
        return traineesList;
    }

    public List<List<String>> listOflist(){
        List<List<String>> traineesList = new ArrayList<>();
        traineesList.add(Arrays.asList("1", "jenifer", "jenifer@nmsworks.co.in"));
        traineesList.add(Arrays.asList("2", "premalatha", "premalatha@nmsworks.co.in"));
        traineesList.add(Arrays.asList("3", "aarthi", "aarthi@nmsworks.co.in"));
        traineesList.add(Arrays.asList("4", "pavithra", "pavithra@nmsworks.co.in"));
        traineesList.add(Arrays.asList("5", "madhumitha", "madhumitha@nmsworks.co.in"));
        traineesList.add(Arrays.asList("6", "hariharan p", "phariharan@nmsworks.co.in"));
        traineesList.add(Arrays.asList("7", "krishna", "krishna@nmsworks.co.in"));
        traineesList.add(Arrays.asList("8", "arunraj", "arunraj@nmsworks.co.in"));
        traineesList.add(Arrays.asList("9", "priyadharshini", "priyadharshini@nmsworks.co.in"));
        traineesList.add(Arrays.asList("10", "sujaritha", "sujaritha@nmsworks.co.in"));
        traineesList.add(Arrays.asList("11", "jenish", "jenish@nmsworks.co.in"));
        traineesList.add(Arrays.asList("12", "hariharan kr", "krhariharan@nmsworks.co.in"));
        traineesList.add(Arrays.asList("13", "muthuraj", "muthuraj@nmsworks.co.in"));
        traineesList.add(Arrays.asList("14", "ariharan", "ariharan@nmsworks.co.in"));
        traineesList.add(Arrays.asList("15", "siva", "siva@nmsworks.co.in"));
        return traineesList;
    }

    public void fillTable(List<List<String>> traineesList) throws SQLException {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training", "nms", "")) {
            String sql = "insert into trainees values(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            int noOfRows = 0;

            for (List<String> trainee : traineesList) {
                preparedStatement.setInt(1,Integer.parseInt(trainee.get(0)));
                preparedStatement.setString(2,trainee.get(1));
                preparedStatement.setString(3,trainee.get(2));
                noOfRows += preparedStatement.executeUpdate();
            }

//            for (String[] trainee : traineesList) {
//                preparedStatement.setInt(1,Integer.parseInt(trainee[0]));
//                preparedStatement.setString(2,trainee[1]);
//                preparedStatement.setString(3,trainee[2]);
//                noOfRows += preparedStatement.executeUpdate();
//            }
            System.out.println(noOfRows+" Rows Affected");
            preparedStatement.close();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws SQLException {
        Question1 q1 = new Question1();
        q1.fillTable(q1.listOflist());
        //q1.fillTable(q1.listOfStringArray());
    }
}