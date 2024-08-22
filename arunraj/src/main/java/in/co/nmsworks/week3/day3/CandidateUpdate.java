package in.co.nmsworks.week3.day3;
import in.co.nmsworks.week3.day2.Candidate;
import in.co.nmsworks.week3.day2.Program8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CandidateUpdate {
    public static void main(String[] args) {

        CandidateUpdate cu = new CandidateUpdate();
        cu.candidatesDetailsUpdate();

    }

    public void candidatesDetailsUpdate(){

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training","nms","");
            PreparedStatement stmt = con.prepareStatement("INSERT INTO candidates values(?,?,?,?,?,?,?,?)");
            Program8 program8 = new Program8();

            for(Candidate candidates : program8.parseAndGetCandidates()){
                stmt.setInt(1,candidates.getSno());
                stmt.setLong(2,candidates.getRegisterNo());
                stmt.setString(3,candidates.getName());
                stmt.setString(4,candidates.getDept());
                stmt.setString(5,candidates.getCollegeName());
                stmt.setString(6,candidates.getDepartment());
                stmt.setString(7,candidates.getEmail());
                stmt.setString(8,candidates.getAcceptedStatus());
                stmt.executeUpdate();
            }

            stmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
