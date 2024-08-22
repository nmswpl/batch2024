package in.co.nmsworks.week3.assesment.day3;

import in.co.nmsworks.week3.assesment.day2.Candidate;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class CandidateDBWriter {
    public void insert(List<Candidate> candidateList) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "")) {
            String sql = "insert into Candidate values(?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            int rowsAffected = 0;

            for (Candidate candidate : candidateList) {
                preparedStatement.setInt(1, candidate.getsNo());
                preparedStatement.setLong(2, candidate.getRegNo());
                preparedStatement.setString(3, candidate.getName());
                preparedStatement.setString(4, candidate.getDept());
                preparedStatement.setString(5, candidate.getCollegeName());
                preparedStatement.setString(6, candidate.getDepartment());
                preparedStatement.setString(7, candidate.getEmail());
                preparedStatement.executeUpdate();
            }
            System.out.println(rowsAffected + " Rows Affected");
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws IOException {
        Candidate can = new Candidate();
        CandidateDBWriter dbWriter = new CandidateDBWriter();
        dbWriter.insert(can.getCandidateList());
    }
}

