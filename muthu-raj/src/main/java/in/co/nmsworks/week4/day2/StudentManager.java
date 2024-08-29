package in.co.nmsworks.week4.day2;

import java.sql.*;
import java.util.*;

public class StudentManager {
    private static Connection con;
    public StudentManager()
    {
        try {
            String url = "jdbc:mysql://localhost:3306/training";
            con = DriverManager.getConnection(url);
        }
        catch (SQLException e)
        {
            System.err.println("DB Connection Error");
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        StudentManager sm = new StudentManager();
//        sm.addStudent();
        sm.updateStudent();
//        sm.removeStudent();
//        sm.findTopStudent();
//        sm.getAllScoresAboveThreshold();
//        sm.getAllStudents();
//        sm.checkExistence();
//        sm.mergeMapAndDB();
//        sm.countScores();
        close();

    }

    private void mergeMapAndDB()
    {
        Map<Integer, Student> idToStudentMap = new HashMap<>();
        Student s = new Student();
        s.setId(52);
        s.setName("John Blesswin");
        s.setMath(78);
        s.setEnglish(89);
        s.setScience(98);
        s.setHistory(80);
        idToStudentMap.put(s.getId(), s);

        s = new Student();
        s.setId(51);
        s.setName("John");
        s.setMath(43);
        s.setEnglish(43);
        s.setScience(23);
        s.setHistory(53);
        idToStudentMap.put(s.getId(), s);

        s = new Student();
        s.setId(53);
        s.setName("John");
        s.setMath(54);
        s.setEnglish(12);
        s.setScience(31);
        s.setHistory(56);
        idToStudentMap.put(s.getId(), s);

        for (Integer id : idToStudentMap.keySet())
        {
            if(getStudentAsList().contains(id))
            {
                String sql = "UPDATE Students SET math = ?, english = ?, science = ?, history = ?";
                try(PreparedStatement ps = con.prepareStatement(sql))
                {
                    ps.setInt(1,idToStudentMap.get(id).getMath());
                    ps.setInt(2,idToStudentMap.get(id).getEnglish());
                    ps.setInt(3,idToStudentMap.get(id).getScience());
                    ps.setInt(4,idToStudentMap.get(id).getHistory());
                    ps.executeUpdate();

                    System.out.println("Student details updated!");
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            else {
                String sql = "INSERT INTO Students VALUES(?, ?, ?, ?, ?, ?)";
                try(PreparedStatement ps = con.prepareStatement(sql))
                {
                    ps.setInt(1,id);
                    ps.setInt(2,idToStudentMap.get(id).getMath());
                    ps.setInt(3,idToStudentMap.get(id).getEnglish());
                    ps.setInt(4,idToStudentMap.get(id).getScience());
                    ps.setInt(5,idToStudentMap.get(id).getHistory());
                    ps.executeUpdate();

                    System.out.println("Student details inserted!");
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
    }

    private static List<Integer> getStudentAsList() {
        List<Integer> studentIDList = new ArrayList<>();

        String sql = "SELECT id FROM Students";
        try(PreparedStatement ps = con.prepareStatement(sql))
        {
            try(ResultSet rs = ps.executeQuery())
            {
                while(rs.next())
                {
                    studentIDList.add(rs.getInt(1));
                }
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return studentIDList;
    }

    private void countScores() {
        Scanner sc = new Scanner(System.in);
        Map<Integer,Integer> distinctMarks = new HashMap<>();

        String subject = "";
        System.out.println("Enter the subject name :: ");
        subject = sc.nextLine().trim();

        try(PreparedStatement ps = con.prepareStatement("SELECT " + subject + ",COUNT(*) FROM Students GROUP BY " + subject ))
        {
            try(ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {

                    distinctMarks.put(rs.getInt(1), rs.getInt(2));
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println(distinctMarks);

    }

    private void checkExistence() {

        Scanner sc = new Scanner(System.in);

        String name = "";
        System.out.println("Enter the student name :: ");
        name = sc.nextLine().trim();

        System.out.println("Enter mark :: ");
        int mark = sc.nextInt();

        try(PreparedStatement ps = con.prepareStatement("SELECT * FROM Students WHERE name = " + "'" + name + "'"))
        {
            try(ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {

                    if(rs.getInt(3) == mark)
                    {
                        System.out.println("Student exists and specified mark is found in maths");
                        return;
                    }
                    else if(rs.getInt(4) == mark)
                    {
                        System.out.println("Student exists and specified mark is found in english");
                        return;
                    }
                    else if(rs.getInt(5) == mark)
                    {
                        System.out.println("Student exists and specified mark is found in science");
                        return;
                    }
                    else if(rs.getInt(6) == mark)
                    {
                        System.out.println("Student exists and specified mark is found in history");
                        return;
                    }

                    System.out.println("Student exists");
                    return;
                }
                System.out.println("Student does not exist");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    private void getAllStudents() {
        List<String> studentNames = new ArrayList<>();
        try(PreparedStatement ps = con.prepareStatement("SELECT * FROM Students" ))
        {
            try(ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    studentNames.add(rs.getString(1));
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


        System.out.println("Student name list ::");
        for (String studentName : studentNames) {
            System.out.println(studentName);
        }
    }

    private void getAllScoresAboveThreshold() {

        Scanner sc = new Scanner(System.in);

        String subject = "";
        System.out.println("Enter the subject name :: ");
        subject = sc.nextLine().trim();

        System.out.println("Enter mark :: ");
        int mark = sc.nextInt();

        try(PreparedStatement ps = con.prepareStatement("SELECT name, " + subject + " FROM Students WHERE " + subject + " > " + mark ))
        {
            try(ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    System.out.println("-------------x------------");
                    System.out.println("Name :: " + rs.getString(1));
                    System.out.println( subject + " mark :: " + rs.getString(2));
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private void findTopStudent() {

        Scanner sc = new Scanner(System.in);

        String subject = "";
        System.out.println("Enter the subject name :: ");
        subject = sc.nextLine().trim();


        try(PreparedStatement ps = con.prepareStatement("SELECT name FROM Students ORDER BY " + subject + " LIMIT 1" ))
        {
            try(ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    System.out.println("The top student in " + subject + " is " + rs.getString(1));
                }
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    private void removeStudent() {

        Scanner sc = new Scanner(System.in);

        String subject = "";
        System.out.println("Enter the subject name :: ");
        subject = sc.nextLine();

        System.out.println("Enter mark :: ");
        int mark = sc.nextInt();

        try (PreparedStatement ps = con.prepareStatement("DELETE FROM Students WHERE " + subject + " < " + mark )) {
            int row = ps.executeUpdate();

            System.out.println(row + " student removed!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void updateStudent()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student id :: ");
        int id = sc.nextInt();

        if(!studentExist(id))
        {
            System.out.println("Student does not exist");
        }
        String subject = "";

        System.out.println("Enter the subject name :: ");
        sc.nextLine();
        subject = sc.nextLine();

        System.out.println("Enter mark :: ");
        int mark = sc.nextInt();

        try(PreparedStatement ps = con.prepareStatement("UPDATE Students WHERE id = (?) SET (?) = (?)"))
        {
            ps.setInt(1,id);
            ps.setString(2,subject);
            ps.setInt(3,mark);
            ps.executeUpdate();

            System.out.println("Student mark updated!");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }

    private static boolean studentExist(int id)
    {
        try(Statement st = con.createStatement())
        {
            try(ResultSet rs =  st.executeQuery("SELECT * FROM Students WHERE id = " + "'" + id + "'"))
            {
                while(rs.next())
                {
                    return true;
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    private void addStudent()
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name :: ");
        String name = sc.nextLine();

        System.out.println("Enter maths mark::");
        int mathMark = sc.nextInt();

        System.out.println("Enter English mark::");
        int engMark = sc.nextInt();

        System.out.println("Enter Science mark::");
        int sciMark = sc.nextInt();

        System.out.println("Enter history mark::");
        int historyMark = sc.nextInt();

        try(PreparedStatement ps = con.prepareStatement("INSERT INTO Students (name,math,english,science,history) VALUES(?, ?, ?, ?, ?)"))
        {
            ps.setString(1,name);
            ps.setInt(2,mathMark);
            ps.setInt(3,engMark);
            ps.setInt(4,engMark);
            ps.setInt(5,historyMark);

            ps.executeUpdate();

            System.out.println("Student Added!");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void close()  {
        try {
            con.close();
        }
        catch (Exception e)
        {
            System.out.println("Error in closing the connection");
            e.printStackTrace();
        }
    }
}
