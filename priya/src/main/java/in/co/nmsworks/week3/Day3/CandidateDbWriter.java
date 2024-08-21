package in.co.nmsworks.week3.Day3;

import in.co.nmsworks.week3.Day2.Candidate;

import java.sql.*;
import java.util.List;

public class CandidateDbWriter {
    public void fillTable() {
        Candidate c = new Candidate();
        List<Candidate> listOfCandidates = c.getCandidatesList();
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
             PreparedStatement ps = connection.prepareStatement("INSERT INTO candidates VALUES(?,?,?,?,?,?,?,?)")) {
            for (Candidate candidate : listOfCandidates) {
                System.out.println(candidate);
                ps.setInt(1, (Integer.parseInt(candidate.getSerialNo())));
                ps.setString(2, (candidate.getRegisterNumber()));
                ps.setString(3, candidate.getName());
                ps.setString(4, candidate.getDept());
                ps.setString(5, candidate.getCollegeName());
                ps.setString(6, candidate.getDepartment());
                ps.setString(7, candidate.getEmail());
                ps.setString(8, candidate.getAcceptedStatus());
                ;
                ps.execute();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        CandidateDbWriter candidateDbWriter = new CandidateDbWriter();
        candidateDbWriter.fillTable();
    }
}
