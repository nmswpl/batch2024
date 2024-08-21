package in.co.nmsworks.week3.day3;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {


        Exercise1 exercise1 = new Exercise1();
        List<String[]> list = exercise1.getList();
        exercise1.fillTable(list);
        List<List<String[]>> listOfList= exercise1.getListOfList();
        exercise1.fillTable2(listOfList);

    }

    private void fillTable2(List<List<String[]>> listOfList) {

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms",""))
        {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into trainees values(?,?,?)");
            for (int i = 0; i < listOfList.get(0).size(); i++) {


                preparedStatement.setInt(1, Integer.parseInt(listOfList.get(0).get(i)[0]));
                preparedStatement.setString(2, listOfList.get(0).get(i)[1]);
                preparedStatement.setString(3, listOfList.get(0).get(i)[2]);

                int affectedRows = preparedStatement.executeUpdate();
                System.out.println(affectedRows + " Rows Affected");
                preparedStatement.close();
            }

        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private List<List<String[]>> getListOfList() {
        List<List<String[]>> listOfList = new ArrayList<>();
        listOfList.addAll(Arrays.asList(getList()));
        return listOfList;
    }

    public List<String[]> getList(){
         List<String[]> traineeList = new ArrayList<>();
        traineeList.add(new String[]{"1", "jenifer", "jenifer@nmsworks.co.in"});
        traineeList.add(new String[]{"2", "premalatha", "premalatha@nmsworks.co.in"});
        traineeList.add(new String[]{"3", "aarthi", "aarthi@nmsworks.co.in"});
        traineeList.add(new String[]{"4", "pavithra", "pavithra@nmsworks.co.in"});
        traineeList.add(new String[]{"5", "madhumitha", "madhumitha@nmsworks.co.in"});
        traineeList.add(new String[]{"6", "hariharan p", "phariharan@nmsworks.co.in"});
        traineeList.add(new String[]{"7", "krishna", "krishna@nmsworks.co.in"});
        traineeList.add(new String[]{"8", "arunraj", "arunraj@nmsworks.co.in"});
        traineeList.add(new String[]{"9", "priyadharshini", "priyadharshini@nmsworks.co.in"});
        traineeList.add(new String[]{"10", "sujaritha", "sujaritha@nmsworks.co.in"});
        traineeList.add(new String[]{"11", "jenish", "jenish@nmsworks.co.in"});
        traineeList.add(new String[]{"12", "hariharan kr", "krhariharan@nmsworks.co.in"});
        traineeList.add(new String[]{"13", "muthuraj", "muthuraj@nmsworks.co.in"});
        traineeList.add(new String[]{"14", "ariharan", "ariharan@nmsworks.co.in"});
        traineeList.add(new String[]{"15", "siva", "siva@nmsworks.co.in"});


         return traineeList;
    }



    public  void  fillTable(List<String[]> list){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms","");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into trainees values(?,?,?)");
            for (String[] strings : list) {
                preparedStatement.setInt(1, Integer.parseInt(strings[0]));
                preparedStatement.setString(2,strings[1]);
                preparedStatement.setString(3,strings[2]);

                int i = preparedStatement.executeUpdate();
                System.out.println(i + "Rows Affected");
                preparedStatement.close();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
