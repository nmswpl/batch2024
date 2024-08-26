package in.co.nmsworks.week3.day5;

import in.co.nmsworks.week3.day2.Candidate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class Library {
    public static void main(String[] args) {
        Library library = new Library();
        library.fillTablesWithBooks();

    }

    private void fillTablesWithBooks() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             PreparedStatement ps = connection.prepareStatement("Insert into Library values (?,?,?,?,?,?)");
             FileReader fr = new FileReader("D:\\OfficeWork\\phariharan\\src\\main\\java\\in\\co\\nmsworks\\week3\\day5\\Library.csv");
             BufferedReader bufferedReader = new BufferedReader(fr)) {
            String string = bufferedReader.readLine();
            List<Candidate> candidatesList = new ArrayList<>();
            while ((string = bufferedReader.readLine()) != null) {
                string = string.replaceAll("\",","---");
                String[] stringArray = string.split("---");
//                System.out.println(stringArray[0]);
                String[] stringsCleaned0 = stringArray[0].split(",\"");
                System.out.println(stringsCleaned0[0]);
                System.out.println(stringsCleaned0[1]);
                System.out.println(stringArray[1].replaceAll("\"","").trim());
                System.out.println(stringArray[2].replaceAll("\"","").trim());
                System.out.println(stringArray[3]);



//                stringArray[0])+""+stringArray[1].replaceAll("\"","").trim()+""+stringArray[2].replaceAll("\"","").trim()+""+stringArray[3].replaceAll("\"","").trim()+""+stringArray[4]);
                ps.setLong(1, Long.parseLong(stringsCleaned0[0]));
                ps.setString(2, stringsCleaned0[1].trim());
                ps.setString(3, stringArray[1].replaceAll("\"","").trim());
                ps.setString(4, stringArray[2].replaceAll("\"","").trim().trim());
                ps.setString(5, stringArray[3]);
                ps.setBoolean(6, true);

                ps.execute();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
