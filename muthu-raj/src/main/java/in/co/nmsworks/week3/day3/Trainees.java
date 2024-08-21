package in.co.nmsworks.week3.day3;

import in.co.nmsworks.week3.day2.Candidate;
import in.co.nmsworks.week3.day2.Question8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.List;

public class Trainees {
    public static void main(String[] args) {
//        fillTrainee1();
//        fillTrainee2();
        candidateDBWriter();
    }

    private static List<List<String>> listOfList() {

        return Arrays.asList(Arrays.asList("1,jenifer,jenifer@nmsworks.co.in"),
                Arrays.asList("2,premalatha,premalatha@nmsworks.co.in"),
                Arrays.asList("3,aarthi,aarthi@nmsworks.co.in"),
                Arrays.asList("4,madhumitha,madhumitha@nmsworks.co.in"),
                Arrays.asList("5,pavithra,pavithra@nmsworks.co.in"),
                Arrays.asList("6,hariharan,hariharan@nmsworks.co.in"),
                Arrays.asList("7,krishna,krishna@nmsworks.co.in"),
                Arrays.asList("8,arunraj,arunraj@nmsworks.co.in"),
                Arrays.asList("9,priyadharshini,priyadharshini@nmsworks.co.in"),
                Arrays.asList("10,sujaritha,sujaritha@nmsworks.co.in"),
                Arrays.asList("11,jenish,jenish@nmsworks.co.in"),
                Arrays.asList("12,hariharan,hariharan@nmsworks.co.in"),
                Arrays.asList("13,muthuraj,muthuraj@nmsworks.co.in"),
                Arrays.asList("14,ariharan,ariharan@nmsworks.co.in"),
                Arrays.asList("15,siva,siva@nmsworks.co.in")

        );
    }

    private static List<String> listOfStringArray() {

        return Arrays.asList("1,jenifer,jenifer@nmsworks.co.in",
                "2,premalatha,premalatha@nmsworks.co.in",
                "3,aarthi,aarthi@nmsworks.co.in",
                "4,madhumitha,madhumitha@nmsworks.co.in",
                "5,pavithra,pavithra@nmsworks.co.in",
                "6,hariharan,hariharan@nmsworks.co.in",
                "7,krishna,krishna@nmsworks.co.in",
                "8,arunraj,arunraj@nmsworks.co.in",
                "9,priyadharshini,priyadharshini@nmsworks.co.in",
                "10,sujaritha,sujaritha@nmsworks.co.in",
                "11,jenish,jenish@nmsworks.co.in",
                "12,hariharan,hariharan@nmsworks.co.in",
                "13,muthuraj,muthuraj@nmsworks.co.in",
                "14,ariharan,ariharan@nmsworks.co.in",
                "15,siva,siva@nmsworks.co.in"
        );
    }

    private static void fillTrainee1() {

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training")) {

            try (PreparedStatement ps = con.prepareStatement("INSERT INTO trainees VALUES ( ?, ?, ?)")) {
                List<String> traineeDetails = listOfStringArray();

                for (String traineeDetail : traineeDetails) {

                    String[] details = traineeDetail.split(",");

                    ps.setInt(1, Integer.parseInt(details[0]));
                    ps.setString(2, details[1]);
                    ps.setString(3, details[2]);

                    ps.executeUpdate();
                }
            }

        }
        catch (Exception e) {
            System.out.println("Something went wrong!");
            e.printStackTrace();
        }
    }

    private static void fillTrainee2() {

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training"))
        {
            try (PreparedStatement ps = con.prepareStatement("INSERT INTO trainees VALUES ( ?, ?, ?)"))
            {
                List<List<String>> traineeDetails = listOfList();

                for (List<String> traineeDetail : traineeDetails) {
                    for (String details : traineeDetail) {
                        String[] detail = details.split(",");

                        ps.setInt(1, Integer.parseInt(detail[0]));
                        ps.setString(2, detail[1]);
                        ps.setString(3, detail[2]);

                        ps.executeUpdate();
                    }
                }
            }
        }
        catch (Exception e) {
            System.out.println("Something went wrong!");
            e.printStackTrace();

        }
    }

    private static void candidateDBWriter() {

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training")) {

            List<Candidate> candidates = Question8.getCandidateDetails();
            System.out.println("candidates" + candidates);

            try (PreparedStatement ps = con.prepareStatement("INSERT INTO candidates VALUES ( ?, ?, ?, ?, ?, ?, ?, ?)"))
            {
                for (Candidate candidate : candidates) {
                    ps.setInt(1, candidate.getSno());
                    ps.setLong(2, candidate.getRegisterNo());
                    ps.setString(3,candidate.getName());
                    ps.setString(4,candidate.getDept() );
                    ps.setString(5,candidate.getCollegeName());
                    ps.setString(6,candidate.getDept());
                    ps.setString(7,candidate.getEmail());
                    ps.setString(8, String.valueOf(candidate.getStatus()));

                    ps.executeUpdate();

                }
                System.out.println("Rows Inserted");
            }
        }
        catch (Exception e) {
            System.out.println("Something went wrong!");
            e.printStackTrace();
        }
    }
}
