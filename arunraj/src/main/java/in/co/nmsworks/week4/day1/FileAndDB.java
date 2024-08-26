/*package in.co.nmsworks.week4.day1;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FileAndDB implements Writer{
    public static void main(String[] args) {
        FileAndDB fdb = new FileAndDB();
        List<Participants> participantsList = fdb.filParsing();
        Participants parti = new Participants();


    }
    public List<Participants> filParsing(){

        try {
            FileReader fr = new FileReader("/home/nms/Downloads/Sample_CSV_Data.csv");
            BufferedReader br = new BufferedReader(fr);
            List<Participants> listOFParticipents = new ArrayList<>();
            String line = null;

            while ((line = br.readLine()) != null) {
                String[] words = line.split("\",\"");
                Participants participants = new Participants(Integer.parseInt(words[0]),words[1].replace("\"","").trim(),Integer.parseInt(words[2]),words[3],
                        words[4],words[5],words[6],words[7],words[8].replace("\"",""),words[9].replace("\""," ").trim());
                listOFParticipents.add(participants);
                br.readLine();
            }
            //System.out.println(listOFParticipents);
            br.close();
            fr.close();
            return listOFParticipents;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    @Override
    public void write() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training","nms","");
            PreparedStatement stmt = ((Connection) con).prepareStatement("INSERT INTO detailsOfCandidates values(?,?,?,?,?,?,?,?,?,?)");
            Participants pr = new Participants();

            for(Participants participant : Participants){
                stmt.setInt(1,participant.getId());
                stmt.setString(2,participant.getName());
                stmt.setInt(3,participant.getAge());
                stmt.setString(4,participant.getEmail());
                stmt.setString(5,participant.getPhone());
                stmt.setString(6,participant.getAddress());
                stmt.setString(7,participant.getEmail());
                stmt.setString(8,participant.getCity());
                stmt.setString(9,participant.getState());
                stmt.setString(10,participant.getCountry());
                stmt.executeUpdate();
            }

            stmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}*/

