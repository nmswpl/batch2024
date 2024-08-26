package in.co.nmsworks.week3.Day3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class Training {
    public List<String[]> createList(){

        List<String []>valuesList= new ArrayList<>();

        String[] jeni = new String[]{"1", "jenifer", "jenifer@nmsworks.co.in"};
        String[] prema = new String[]{"2", "premalatha", "premalatha@nmsworks.co.in" };
        String[] aarthi = new String[]{"3", "aarthi", "aarthi@nmsworks.co.in" };
        String[] madhu = new String[]{"4", "madhumitha", "madhumitha@nmsworks.co.in" };
        String[] pavi = new String[]{"5", "pavithra", "pavithra@nmsworks.co.in"};
        String[] hari = new String[]{"6", "hariharan", "hariharan@nmsworks.co.in" };
        String[] krishna = new String[]{"7", "krishna", "krishna@nmsworks.co.in" };
        String[] arunraj = new String[]{"8", "arunraj", "arunraj@nmsworks.co.in" };
        String[] priya = new String[]{"9", "priyadharshini", "priyadharshini@nmsworks.co.in" };
        String[] sujaritha = new String[]{"10", "sujaritha", "sujaritha@nmsworks.co.in"};
        String[] jenish = new String[]{"11", "jenish", "jenish@nmsworks.co.in" };
        String[] hariharan = new String[]{"12", "hariharan", "hariharan@nmsworks.co.in" };
        String[] muthuraj = new String[]{"13", "muthuraj", "muthuraj@nmsworks.co.in" };
        String[] ariharan = new String[]{"14", "ariharan", "ariharan@nmsworks.co.in" };
        String[] siva = new String[]{"15", "siva", "siva@nmsworks.co.in" };

        valuesList.add(jeni);
        valuesList.add(prema);
        valuesList.add(aarthi);
        valuesList.add(madhu);
        valuesList.add(pavi);
        valuesList.add(hari);
        valuesList.add(krishna);
        valuesList.add(arunraj);
        valuesList.add(priya);
        valuesList.add(sujaritha);
        valuesList.add(jenish);
        valuesList.add(hariharan);
        valuesList.add(muthuraj);
        valuesList.add(ariharan);
        valuesList.add(siva);

        return valuesList;

    }

    public void fillTable() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
             PreparedStatement ps = connection.prepareStatement("insert into trainees values(?,?,?)");) {

            List<String[]> listArr = createList();
            for(String[] value : listArr){
                ps.setInt(1,Integer.parseInt(value[0]));
                ps.setString(2,value[1]);
                ps.setString(3,value[2]);
                int rowsAffected = ps.executeUpdate();
                System.out.println(rowsAffected);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        Training t1 = new Training();
        t1.fillTable();



    }
}
