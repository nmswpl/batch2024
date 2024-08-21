package in.co.nmsworks.week3.day3;

import in.co.nmsworks.week3.day2.Candidate;
import in.co.nmsworks.week3.day2.Que08;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class CandidateDBWriter {
    public static void main(String[] args) {
        CandidateDBWriter candidateDBWriter = new CandidateDBWriter();
        Que08 getCandidate = new Que08();
        try {
            List<Candidate> candidatesList = getCandidate.getCandidatesList();
            candidateDBWriter.fillTablesWithListOfCandidate(candidatesList);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void fillTablesWithListOfCandidate(List<Candidate> traineesList) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             PreparedStatement ps = connection.prepareStatement("Insert into Candidates values (?,?,?,?,?,?,?)")) {
            int counter = 0;
            for (Candidate candidate : traineesList) {
                ps.setLong(1, candidate.getRegNo());
                ps.setString(2, candidate.getName());
                ps.setString(3, candidate.getDepartment());
                ps.setString(4, candidate.getCollegeName());
                ps.setString(5, candidate.getDepartment());
                ps.setString(6, candidate.getEmailId());
                ps.setString(7, candidate.getStatus());

                ps.execute();
                counter++;

            }
            System.out.println(counter + " lines changed ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
