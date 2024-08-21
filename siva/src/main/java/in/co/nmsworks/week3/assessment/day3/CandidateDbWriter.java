package in.co.nmsworks.week3.assessment.day3;

import in.co.nmsworks.week3.assessment.day2.Candidate;
import in.co.nmsworks.week3.assessment.day2.Program8;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CandidateDbWriter {
    public static void main(String[] args) {
        new CandidateDbWriter().candidateDbWriter();

    }
    public void candidateDbWriter(){
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
            PreparedStatement ps = con.prepareStatement("INSERT INTO candidate VALUES(?,?,?,?,?,?,?,?)")) {

            Program8 program8 = new Program8();
            for (Candidate candidate : program8.fileParsing()) {

                ps.setInt(1,candidate.getsNo());
                ps.setLong(2,candidate.getRegisterNo());
                ps.setString(3,candidate.getName());
                ps.setString(4,candidate.getDept());
                ps.setString(5,candidate.getCollegeName());
                ps.setString(6,candidate.getDepartment());
                ps.setString(7,candidate.getEmail());
                ps.setString(8,candidate.getAcceptedStatus());
                ps.executeUpdate();

            }

        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
