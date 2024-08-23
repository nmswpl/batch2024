package in.co.nmsworks.week3.day5;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CreateCandidateDetails {
    public static void main(String[] args) {

        CreateCandidateDetails createCandidateDetails = new CreateCandidateDetails();
        List<Trainees> traineesList = createCandidateDetails.getTraineeDetails();
         createCandidateDetails.writeTraineeDetails(traineesList);
    }

    public List<Trainees> getTraineeDetails(){
        List<Trainees> trainees = new ArrayList<>();
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms","")){

            PreparedStatement preparedStatement = connection.prepareStatement("select * from trainees");
            ResultSet resultSet = preparedStatement.executeQuery();
           while(resultSet.next()){
               trainees.add(new Trainees(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3)));
           }


        }catch (SQLException e) {
            e.printStackTrace();
        }

        return  trainees;

    }

    public  void writeTraineeDetails(List<Trainees> traineesList){
        try(FileWriter fileWriter = new FileWriter("Trainees.txt",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            for (Trainees Trainees : traineesList) {
                bufferedWriter.append("*****************"+ Trainees.getId()+". Row "+"**********************");
                bufferedWriter.newLine();
                bufferedWriter.append("id: " + Trainees.getId());
                bufferedWriter.newLine();
                bufferedWriter.append("Name " + Trainees.getName());
                bufferedWriter.newLine();
                bufferedWriter.append("Email:" + Trainees.getEmailid());
                bufferedWriter.newLine();
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
