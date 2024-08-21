package in.co.nmsworks.week3.day3;

import in.co.nmsworks.week3.day2.Candidate;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class CandidateDbWriter {
    public void writeIntoDb(List<Candidate> candidateList) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training", "nms", "")) {
            String sql = "insert into candidate values(?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            int noOfRows = 0;

            for (Candidate candidate : candidateList) {
                preparedStatement.setInt(1,candidate.getSno());
                preparedStatement.setLong(2,candidate.getRegNo());
                preparedStatement.setString(3,candidate.getName());
                preparedStatement.setString(4,candidate.getBranch());
                preparedStatement.setString(5,candidate.getCollegeName());
                preparedStatement.setString(6,candidate.getDept());
                preparedStatement.setString(7,candidate.getEmail());
                preparedStatement.setString(8,candidate.getAcceptedStatus());
                noOfRows += preparedStatement.executeUpdate();
            }
            System.out.println(noOfRows+" Rows Affected");
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws IOException {
        Candidate c1 = new Candidate();
        CandidateDbWriter dbWriter = new CandidateDbWriter();
        dbWriter.writeIntoDb(c1.getCandidateList());
    }
}