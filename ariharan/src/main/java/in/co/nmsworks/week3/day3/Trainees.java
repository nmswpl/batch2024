package in.co.nmsworks.week3.day3;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1, jenifer, jenifer@nmsworks.co.in
//2, premalatha, premalatha@nmsworks.co.in
//3, aarthi, aarthi@nmsworks.co.in
//4, madhumitha, madhumitha@nmsworks.co.in
//5, pavithra, pavithra@nmsworks.co.in
//6, hariharan, hariharan@nmsworks.co.in
//7, krishna, krishna@nmsworks.co.in
//8, arunraj, arunraj@nmsworks.co.in
//9, priyadharshini, priyadharshini@nmsworks.co.in
//10, sujaritha, sujaritha@nmsworks.co.in
//11, jenish, jenish@nmsworks.co.in
//12, hariharan, hariharan@nmsworks.co.in
//13, muthuraj, muthuraj@nmsworks.co.in
//14, ariharan, ariharan@nmsworks.co.in
//15, siva, siva@nmsworks.co.in
public class Trainees {
    public List<String[]> traineesList(){
        List<String[]> traineesDetails=new ArrayList<>();
        String[] trainee1={"21", "jenifer", "jenifer@nmsworks.co.in"};
        String[] trainee2={"22", "premalatha", "premalatha@nmsworks.co.in" };
        String[] trainee3={"23", "aarthi", "aarthi@nmsworks.co.in "};
        String[] trainee4={"24", "madhumitha", "madhumitha@nmsworks.co.in "};
        String[] trainee5={"25", "pavithra", "pavithra@nmsworks.co.in "};
        String[] trainee6={"26", "hariharan", "hariharan@nmsworks.co.in" };
        String[] trainee7={"27", "krishna", "krishna@nmsworks.co.in"};
        String[] trainee8={"28", "arunraj", "arunraj@nmsworks.co.in"};
        String[] trainee9={"29", "priyadharshini", "priyadharshini@nmsworks.co.in"};
        String[] trainee10={"30", "sujaritha", "sujaritha@nmsworks.co.in" };
        String[] trainee11={"31", "jenish", "jenish@nmsworks.co.in"};
        String[] trainee12={"32", "hariharan", "hariharan@nmsworks.co.in"};
        String[] trainee13={"33", "muthuraj", "muthuraj@nmsworks.co.in" };
        String[] trainee14={"34", "ariharan", "ariharan@nmsworks.co.in"};
        String[] trainee15={"35", "siva", "siva@nmsworks.co.in"};
        traineesDetails.add(trainee1);
        traineesDetails.add(trainee2);
        traineesDetails.add(trainee3);
        traineesDetails.add(trainee4);
        traineesDetails.add(trainee5);
        traineesDetails.add(trainee6);
        traineesDetails.add(trainee7);
        traineesDetails.add(trainee8);
        traineesDetails.add(trainee9);
        traineesDetails.add(trainee10);
        traineesDetails.add(trainee11);
        traineesDetails.add(trainee12);
        traineesDetails.add(trainee13);
        traineesDetails.add(trainee14);
        traineesDetails.add(trainee15);
        return traineesDetails;
    }
    public List<List<String>> listOfTraineesDetails(List<String[]> traineesDetails){
        List<List<String>> listtraineesDetails=new ArrayList<>();
        List<String> trainee=new ArrayList<>();

        for (String[] traineesDetail : traineesDetails) {
            trainee= Arrays.asList(traineesDetail);
            listtraineesDetails.add(trainee);
        }
        return listtraineesDetails;
    }

    public void fillDetails(List<List<String>> traineesDetails){
        try {
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
            PreparedStatement ps=connection.prepareStatement("Insert into trainees values(?,?,?)");
            for (List<String> trainee: traineesDetails) {
                ps.setInt(1,Integer.parseInt(trainee.get(0)));
                ps.setString(2,trainee.get(1).trim());
                ps.setString(3,trainee.get(2).trim());
                System.out.println(ps.executeUpdate());
            }
            ps.close();
            connection.close();


        }catch (SQLException e){
            throw new RuntimeException(e);

        }
    }

    public static void main(String[] args) {
//        new Trainees().fillDetails(new Trainees().traineesList());
        new Trainees().fillDetails(new Trainees().listOfTraineesDetails(new Trainees().traineesList()));
    }
}
