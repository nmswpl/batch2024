package in.co.nmsworks.week4.day2;

import in.co.nmsworks.week4.day1.Student;

import java.sql.*;
import java.util.*;

public class StudentManagerDb{
    private static final String URL = "jdbc:mysql://localhost:3306/Training";
    private static final String USER = "nms";
    private static final String PASSWORD = "";
    List<Student> studentList = new ArrayList<>();

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public List<Student> readFromDb() {
        String query = "select * from Students";
        try (Connection connection = getConnection();
             Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(query)) {

            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int mathsMark = rs.getInt(3);
                int englishMark = rs.getInt(4);
                int scienceMark = rs.getInt(5);
                int historyMark = rs.getInt(6);
                Student student = new Student(id, name, mathsMark, englishMark, scienceMark, historyMark);
                studentList.add(student);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return studentList;
    }

    public void addStudent(Student student) {
        String query = "insert into Students values (?, ?, ?, ?, ?, ?)";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {

            preparedStatement.setInt(1, student.getId());
            preparedStatement.setString(2, student.getName());
            preparedStatement.setInt(3, student.getMathsMark());
            preparedStatement.setInt(4, student.getEnglishMark());
            preparedStatement.setInt(5, student.getScienceMark());
            preparedStatement.setInt(6, student.getHistoryMark());

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected+" rows Affected");
            System.out.println("Student successfully added.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateScoreOfTheStudent(String studentName, int mark, String subjectName) {
        String columnName = getColumnName(subjectName);
        String query = "update Students set " + columnName + " = ? where name = ?";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, mark);
            preparedStatement.setString(2, studentName);
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected == 0) {
                addStudent(new Student((studentList.size() + 1), studentName, 0, 0, 0, 0)); // Initial marks can be 0
                updateScoreOfTheStudent(studentName, mark, subjectName);
            }

            System.out.println("Score successfully updated.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String getColumnName(String subjectName) {
        switch (subjectName.toLowerCase()) {
            case "maths": return "math";
            case "english": return "english";
            case "science": return "science";
            case "history": return "history";
            default: throw new IllegalArgumentException("Unknown subject: " + subjectName);
        }
    }

    public void removeStudent(String subjectName, int thresholdMark) {
        String columnName = getColumnName(subjectName);
        String query = "delete from Students where " + columnName + " < ?";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, thresholdMark);
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " students removed.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void findHighestMark(String subjectName) {
        String columnName = getColumnName(subjectName);
        String query = "select name, " + columnName + " from Students order by " + getColumnName(subjectName) + " desc limit 1";
        try (Connection connection = getConnection();
             Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(query)) {

            if (rs.next()) {
                String topStudent = rs.getString("name");
                int highestMark = rs.getInt(getColumnName(subjectName));
                System.out.println("Highest mark scored by Student " + topStudent + " with mark " + highestMark);
            } else {
                System.out.println("No records found for subject: " + subjectName);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Map<String, Integer> namesToTheirScores(String subjectName, int thresholdMark) {
        Map<String, Integer> namesToScoresMap = new HashMap<>();
        String columnName = getColumnName(subjectName);
        String query = "select name, " + columnName + " from Students where " + getColumnName(subjectName) + " > ?";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, thresholdMark);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                namesToScoresMap.put(rs.getString("name"), rs.getInt(getColumnName(subjectName)));
            }

            if (namesToScoresMap.isEmpty()) {
                System.out.println("No students found with marks above " + thresholdMark + " in " + subjectName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return namesToScoresMap;
    }

    public Set<String> retrieveAllStudentNames() {
        Set<String> setOfStudentNames = new HashSet<>();
        String query = "select name from Students";
        try (Connection connection = getConnection();
             Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(query)) {

            while (rs.next()) {
                setOfStudentNames.add(rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return setOfStudentNames;
    }

    public void checkExistence(String studentName, String subjectName, int mark) {
        String columnName = getColumnName(subjectName);
        String query = "select count(*) from Students where name = ? and " + columnName + " = ?";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, studentName);
            preparedStatement.setInt(2, mark);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next() && rs.getInt(1) > 0) {
                System.out.println("Student exists");
            } else {
                System.out.println("Student does not exist");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void mergeWithAnotherMap() {
        Map<Integer, Student> studentsMap = new HashMap<>();

        studentsMap.put(52, new Student(52, "Sam", 80, 90, 85, 76));
        studentsMap.put(53, new Student(53, "James", 82, 94, 87, 78));
        studentsMap.put(54, new Student(54, "Jack", 78, 92, 83, 77));
        studentsMap.put(8, new Student(8, "Jimmy", 78, 89, 82, 85));

        for (Student student : studentsMap.values()) {
            addStudent(student);
        }
        System.out.println("Merged with another map.");
    }

    public Map<Integer, Integer> scoreAndItsCountMap(String subjectName) {
        Map<Integer, Integer> scoreAndItsCount = new HashMap<>();
        String columnName = getColumnName(subjectName);
        String query = "select " + columnName + ", count(*) from Students group by " + columnName;

        try (Connection connection = getConnection();
             Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(query)) {

            while (rs.next()) {
                int mark = rs.getInt(columnName);
                int count = rs.getInt(2);
                scoreAndItsCount.put(mark, count);
            }

            if (scoreAndItsCount.isEmpty()) {
                System.out.println("No records found for subject: " + subjectName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return scoreAndItsCount;
    }

    public static void main(String[] args) {
        StudentManagerDb studentManagerDb = new StudentManagerDb();
        studentManagerDb.readFromDb();
        studentManagerDb.addStudent(new Student((studentManagerDb.studentList.size() + 1),"Jenish",96,87,74,86));
        studentManagerDb.updateScoreOfTheStudent("Jenish",86, "science");
        studentManagerDb.removeStudent("history",75);
        studentManagerDb.findHighestMark("maths");
        System.out.println("Names to Scores Map : "+studentManagerDb.namesToTheirScores("english", 80));
        System.out.println("Set of all Student names : "+studentManagerDb.retrieveAllStudentNames());
        studentManagerDb.checkExistence("Jenish","science", 86);
        studentManagerDb.mergeWithAnotherMap();
        System.out.println("Distinct Scores and its count : "+studentManagerDb.scoreAndItsCountMap("history"));
    }
}