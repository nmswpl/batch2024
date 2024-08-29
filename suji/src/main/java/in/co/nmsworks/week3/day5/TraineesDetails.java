package in.co.nmsworks.week3.day5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TraineesDetails {
    List<Trainees> ls = new ArrayList<>();

    public List<Trainees> getDataFromDb() throws IOException, SQLException {
        String s[] = new String[15];

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
             Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery("select * from trainees");
            for (int i = 1; i <= 15; i++) {
                if (rs.next()) {
                    String id = String.valueOf(rs.getInt(1));
                    String name = rs.getString(2);
                    String email = rs.getString(3);
                    //System.out.println(Arrays.toString(s));
                    Trainees ob = new Trainees(id, name, email);
                    ls.add(ob);
                }
            }
        }
        return ls;
    }


    public void writeFile(List<Trainees> ls) throws IOException {
        FileWriter fw = new FileWriter("/home/nms/Documents/details.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fw);
        for (Trainees o : ls) {
            System.out.println(o);

            bufferedWriter.write("Id" + o.getId() + " " + o.getName() + " " + o.getEmail());
            bufferedWriter.newLine();
        }


        bufferedWriter.close();
        fw.close();
    }


    public static void main(String[] args) throws SQLException, IOException {
        TraineesDetails obj = new TraineesDetails();
        List<Trainees> ls = obj.getDataFromDb();
        obj.writeFile(ls);
    }
}


