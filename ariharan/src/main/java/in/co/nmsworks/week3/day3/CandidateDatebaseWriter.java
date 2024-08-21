package in.co.nmsworks.week3.day3;

import in.co.nmsworks.week3.day2.Candidate;
import in.co.nmsworks.week3.day2.Practice8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

public class CandidateDatebaseWriter {
    public void candidatesDetailsToDatabase() {
        try {
        Practice8 p8=new Practice8();
        List<Candidate> candidatesList=p8.fileParsing();
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
        PreparedStatement ps = connection.prepareStatement("Insert into candidates values(?,?,?,?,?,?,?,?)");

            for (Candidate object : candidatesList) {
                ps.setInt(1,object.getSerialNumber() );
                ps.setLong(2, object.getRegNumber());
                ps.setString(3, object.getName());
                ps.setString(4, object.getDept());
                ps.setString(5, object.getCollegeName());
                ps.setString(6, object.getDeptInOffice());
                ps.setString(7, object.getEmail());
                ps.setString(8, object.getAcceptedStatus());
                System.out.println(ps.executeUpdate());
            }
            ps.close();
            connection.close();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args){
        new CandidateDatebaseWriter().candidatesDetailsToDatabase();
    }
}

