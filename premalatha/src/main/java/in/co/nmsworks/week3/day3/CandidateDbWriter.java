package in.co.nmsworks.week3.day3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import in.co.nmsworks.week3.day2.Candidate;
import in.co.nmsworks.week3.day2.Runner;
import in.co.nmsworks.week3.day2.getCandidateDetails;

public class CandidateDbWriter {
        public static void main(String[] args) {
            try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms","")){
                List<Candidate> candidatesList= getCandidateDetails.getDetails();
                PreparedStatement preparedStatement = connection.prepareStatement("insert into candidate values(?,?,?,?,?,?,?,?)");
                int i = 0;
                for(Candidate candidates: candidatesList){
                    preparedStatement.setInt(1,candidates.getSno());
                    preparedStatement.setLong(2,candidates.getRegNo());
                    preparedStatement.setString(3,candidates.getName());
                    preparedStatement.setString(4,candidates.getDept());
                    preparedStatement.setString(5,candidates.getCollegeName());
                    preparedStatement.setString(6,candidates.getBranch());
                    preparedStatement.setString(7,candidates.getEmail());
                    preparedStatement.setString(8,candidates.getAcceptedStatus());

                    i +=preparedStatement.executeUpdate();
                }
                System.out.println(i + " Rows Affected");
            }catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
