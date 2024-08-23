package in.co.nmsworks.week3.day5;
import in.co.nmsworks.week3.day2.Candidates;
import in.co.nmsworks.week3.day2.getCandidateDetails;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CreateCandidateDetails {
    public static void main(String[] args) {

        CreateCandidateDetails createCandidateDetails = new CreateCandidateDetails();
        List<trainee> traineeList = createCandidateDetails.getTraineeDetails();
         createCandidateDetails.writeTraineeDetails(traineeList);



    }

    public List<trainee> getTraineeDetails(){
        List<trainee> trainees = new ArrayList<>();
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms","")){

            PreparedStatement preparedStatement = connection.prepareStatement("select * from trainees");
            ResultSet resultSet = preparedStatement.executeQuery();
           while(resultSet.next()){
               trainees.add(new trainee(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3)));
           }


        }catch (SQLException e) {
            e.printStackTrace();
        }

        return  trainees;

    }

    public  void writeTraineeDetails(List<trainee> traineeList){
        try(FileWriter fileWriter = new FileWriter("trainee.txt",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            for (trainee trainee : traineeList) {
                bufferedWriter.append("*****************"+ trainee.getId()+". Row "+"**********************");
                bufferedWriter.newLine();
                bufferedWriter.append("id: " + trainee.getId());
                bufferedWriter.newLine();
                bufferedWriter.append("Name " + trainee.getName());
                bufferedWriter.newLine();
                bufferedWriter.append("Email:" +trainee.getEmailid());
                bufferedWriter.newLine();
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
