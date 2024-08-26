package in.co.nmsworks.week4.day1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public interface Writer {

    public void saveToFile(String[] femaleArray);
    public void saveToDb(String[] maleArray);

}

class WrieToDb implements Writer{

    public void saveToFile(String[] femaleEMployeeArray){

        try(FileWriter fileWriter = new FileWriter("femaleEmployee.txt",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (int i = 0; i < 1; i++) {

                bufferedWriter.append("******************************************");
                bufferedWriter.newLine();
                bufferedWriter.append("ID: "+femaleEMployeeArray[0]);
                bufferedWriter.newLine();
                bufferedWriter.append("Name: "+femaleEMployeeArray[1]);
                bufferedWriter.newLine();
                bufferedWriter.append("Age: "+femaleEMployeeArray[2]);
                bufferedWriter.newLine();
                bufferedWriter.append("Email: "+femaleEMployeeArray[3]);
                bufferedWriter.newLine();
                bufferedWriter.append("Phone: "+femaleEMployeeArray[4]);
                bufferedWriter.newLine();
                bufferedWriter.append("Address: "+femaleEMployeeArray[5]);
                bufferedWriter.newLine();
                bufferedWriter.append("City: "+femaleEMployeeArray[6]);
                bufferedWriter.newLine();
                bufferedWriter.append("State: "+femaleEMployeeArray[7]);
                bufferedWriter.newLine();
                bufferedWriter.append("ZipCode: "+femaleEMployeeArray[8]);
                bufferedWriter.newLine();
                bufferedWriter.append("County: "+femaleEMployeeArray[9]);
                bufferedWriter.newLine();
                bufferedWriter.append("*******************************************");
                bufferedWriter.newLine();
                bufferedWriter.newLine();
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }

    @Override
    public void saveToDb(String[] maleArray) {
        int i =0;
         try(Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms","")) {
             PreparedStatement preparedStatement = connection.prepareStatement("insert into emp values(?,?,?,?,?,?,?,?,?,?)");
             preparedStatement.setInt(1,Integer.parseInt(maleArray[0]));
             preparedStatement.setString(2,maleArray[1]);
             preparedStatement.setInt(3,Integer.parseInt(maleArray[2]));
             preparedStatement.setString(4,maleArray[3]);
             preparedStatement.setString(5,maleArray[4]);
             preparedStatement.setString(6,maleArray[5]);
             preparedStatement.setString(7,maleArray[6]);
             preparedStatement.setString(8,maleArray[7]);
             preparedStatement.setInt(9,Integer.parseInt(maleArray[8]));
             preparedStatement.setString(10,maleArray[9]);

           ;
             i+= preparedStatement.executeUpdate();

             System.out.println(i+ " Rows Affected");

             preparedStatement.close();
         }catch(Exception e){
             System.out.println(e);
         }
    }
}
