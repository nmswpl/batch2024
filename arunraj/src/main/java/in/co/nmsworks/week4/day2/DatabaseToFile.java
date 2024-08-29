package in.co.nmsworks.week4.day2;

import in.co.nmsworks.week4.day1.Student;

import java.sql.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DatabaseToFile {
    static Connection conn;
    static PreparedStatement ps;
    static int id = 50;

    static {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training", "nms", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        DatabaseToFile dbExercise1 = new DatabaseToFile();
        dbExercise1.addNewStudent("Mark", 90, 87, 79, 97);
        dbExercise1.updateMark("Mark", "Math", 99);
        dbExercise1.removeStudent("Math", 80);
        dbExercise1.getMaximumScore("Math");
        dbExercise1.getAllScore("Math", 98);
        Set<String> nameSet = dbExercise1.getStudentName();
        for (String name : nameSet) {
            System.out.println(name);
        }
        dbExercise1.retriveStudent("Hariharan", "Math", 99);
        dbExercise1.countScores("Math");

        Map<Integer, Student> studentMap1 = new HashMap<>();
        studentMap1.put(52, new Student(52, "Dhoni", 87, 86, 92, 80));
        studentMap1.put(53, new Student(53, "Suriya", 97, 96, 93, 95));
        studentMap1.put(54, new Student(54, "Ajith", 82, 86, 85, 83));
        studentMap1.put(55, new Student(55, "Karthi", 77, 76, 62, 76));
        studentMap1.put(2, new Student(2, "Vijay", 57, 66, 82, 80));
        dbExercise1.mergeWithDb(studentMap1);
    }

    private void mergeWithDb(Map<Integer, Student> studentMap1) {
        String query = "SELECT id FROM Students";
        try (PreparedStatement ps = conn.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int studentId = rs.getInt(1);
                Student student = studentMap1.get(studentId);

                if (student != null) {
                    updateMark(student.getName(), student.getMathMark(), student.getEnglishMark(), student.getScienceMark(), student.getHistoryMark());
                } else {
                    System.out.println("Student with ID " + studentId + " is not found in the map.");
                }
            }
            for (Map.Entry<Integer, Student> entry : studentMap1.entrySet()) {
                int studentId = entry.getKey();
                if (!isAvailableById(studentId)) {
                    Student student = entry.getValue();
                    addNewStudent(student.getName(), student.getMathMark(), student.getEnglishMark(), student.getScienceMark(), student.getHistoryMark());
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private boolean isAvailableById(int studentId) {
        String query = "SELECT COUNT(*) FROM Students WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, studentId);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


    private void countScores(String subject) {
        try {
            String query = "SELECT " + subject + ", COUNT(*) FROM Students GROUP BY " + subject;
            ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Score: " + rs.getInt(1) + ", Count: " + rs.getInt(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void retriveStudent(String name, String subject, int mark) {
        try {
            String query = "SELECT name FROM Students WHERE name = ? AND " + subject + " = ?";
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setInt(2, mark);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Name: " + rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Set<String> getStudentName() {
        Set<String> nameSet = new HashSet<>();
        try {
            String query = "SELECT name FROM Students";
            ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                nameSet.add(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nameSet;
    }

    private void getAllScore(String subject, int mark) {
        try {
            String query = "SELECT name, " + subject + " FROM Students WHERE " + subject + " > ?";
            ps = conn.prepareStatement(query);
            ps.setInt(1, mark);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Name: " + rs.getString(1) + "\tMark: " + rs.getInt(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void getMaximumScore(String subject) {
        try {
            String query = "SELECT name, " + subject + " FROM Students ORDER BY " + subject + " DESC LIMIT 1";
            ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("Name: " + rs.getString(1) + " Mark: " + rs.getInt(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void removeStudent(String subject, int mark) {
        try {
            String query = "DELETE FROM Students WHERE " + subject + " < ?";
            ps = conn.prepareStatement(query);
            ps.setInt(1, mark);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updateMark(String name, String subject, int mark) {
        try {
            if (isAvailable(name)) {
                String query = "UPDATE Students SET " + subject + " = ? WHERE name = ?";
                ps = conn.prepareStatement(query);
                ps.setInt(1, mark);
                ps.setString(2, name);
                ps.executeUpdate();
            } else {
                addNewStudent(name, 0, 0, 0, 0);
                updateMark(name, subject, mark);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updateMark(String name, int mathMark, int englishMark, int scienceMark, int historyMark) {
        try {
            if (isAvailable(name)) {
                String query = "UPDATE Students SET Math = ?, English = ?, Science = ?, History = ? WHERE name = ?";
                ps = conn.prepareStatement(query);
                ps.setInt(1, mathMark);
                ps.setInt(2, englishMark);
                ps.setInt(3, scienceMark);
                ps.setInt(4, historyMark);
                ps.setString(5, name);
                ps.executeUpdate();
            } else {
                addNewStudent(name, mathMark, englishMark, scienceMark, historyMark);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void addNewStudent(String name, int mathMark, int englishMark, int scienceMark, int historyMark) {
        try {
            String query = "INSERT INTO Students (id, name, Math, English, Science, History) VALUES (?, ?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(query);
            ps.setInt(1, ++id);
            ps.setString(2, name);
            ps.setInt(3, mathMark);
            ps.setInt(4, englishMark);
            ps.setInt(5, scienceMark);
            ps.setInt(6, historyMark);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private boolean isAvailable(String name) {
        try {
            String query = "SELECT COUNT(*) FROM Students WHERE name = ?";
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}