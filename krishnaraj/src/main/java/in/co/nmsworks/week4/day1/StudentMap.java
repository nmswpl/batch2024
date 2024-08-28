package in.co.nmsworks.week4.day1;

import java.sql.*;
import java.util.*;

public class StudentMap {
    List<Student> studentList = new ArrayList<>(getStudentFromDb());
    Map<Integer, Student> idToStudentMap = new HashMap<>();

    public List<Student> getStudentFromDb() {
        List<Student> students = new ArrayList<>();
        String url = "jdbc:mysql://localhost:3306/training";
        try {
            Connection connection = DriverManager.getConnection(url);
            Statement statement = connection.createStatement();

            String query = "SELECT id, name, math, english, science, history FROM Students";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int math = resultSet.getInt("math");
                int english = resultSet.getInt("english");
                int science = resultSet.getInt("science");
                int history = resultSet.getInt("history");
                students.add(new Student(id, name, math, english, science, history));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    public Map<Integer, Student> convertListToMap(List<Student> students) {
        Map<Integer, Student> studentMap = new HashMap<>();
        for (Student student : students) {
            studentMap.put(student.getId(), student);
        }
        return studentMap;
    }

    public void addStudentToMap(Student student) {
        idToStudentMap.put(student.getId(), student);
    }

    public void updateScore(String name, int math, int english, int science) {
        boolean studentFound = false;
        for (Student student : idToStudentMap.values()) {
            if (student.getName().equals(name)) {
                student.setMath(math);
                student.setEnglish(english);
                student.setScience(science);
                student.setHistory(student.getHistory());
                studentFound = true;
                break;
            }
        }
        if (!studentFound){
            int newId = idToStudentMap.size();
            idToStudentMap.put(newId,new Student(newId,name,math,english,science,0));
        }
    }
    public void removeStudentBelowThresHold(String subject,Integer score){
        Map<Integer, Student> filteredMap = new HashMap<>();
        for (Student value : idToStudentMap.values()) {
            int totalScore = value.getEnglish()+ value.getMath()+ value.getHistory()+ value.getScience();
            if (totalScore >=score){
                filteredMap.put(value.getId(),value);
            }
        }
        idToStudentMap.clear();
        idToStudentMap.putAll(filteredMap);
    }
    public Student findStudentWithHighestScore(String subject) {
        if (subject == null) {
            System.out.println("Subject is null.");
            return null;
        }

        Student topStudent = null;
        int highestScore = Integer.MIN_VALUE;

        for (Student student : idToStudentMap.values()) {
            if (student == null) {
                continue; // Skip null students
            }

            int score = 0;

            switch (subject.toLowerCase()) {
                case "math":
                    score = student.getMath();
                    break;
                case "english":
                    score = student.getEnglish();
                    break;
                case "science":
                    score = student.getScience();
                    break;
                case "history":
                    score = student.getHistory();
                    break;
                default:
                    System.out.println("Subject not found.");
                    return null; // Exit early if the subject is invalid
            }

            if (score > highestScore) {
                highestScore = score;
                topStudent = student;
            }
        }

        if (topStudent == null) {
            System.out.println("No students found with the given subject.");
        }

        return topStudent;
    }
    public Map<String, Integer> getStudentsAboveThreshold(Map<Integer, Student> idToStudentMap1, int threshold, String subject) {
        Map<String, Integer> resultMap = new HashMap<>();

        for (Student student : idToStudentMap1.values()) {
            int score = 0;
            switch (subject.toLowerCase()) {
                case "math":
                    score = student.getMath();
                    break;
                case "english":
                    score = student.getEnglish();
                    break;
                case "science":
                    score = student.getScience();
                    break;
                case "history":
                    score = student.getHistory();
                    break;
                default:
                    System.out.println("wrong subject...");
            }
            if (score > threshold) {
                resultMap.put(student.getName(), score);
            }
        }
        return resultMap;
    }
    public Set<String> getAllStudentNames(Map<Integer, Student> studentMap) {
        Set<String> studentNames = new HashSet<>();
        for (Student student : studentMap.values()) {
            studentNames.add(student.getName());
        }
        return studentNames;
    }
    public Integer getScoreForSubject(Map<Integer, Student> studentMap,String studentName, String subject) {
        Student student = studentMap.get(studentName);

        if (student != null) {
            switch (subject.toLowerCase()) {
                case "math":
                    return student.getMath();
                case "english":
                    return student.getEnglish();
                case "science":
                    return student.getScience();
                case "history":
                    return student.getHistory();
                default:
                    System.out.println("Invalid subject provided.");
                    return null;
            }
        } else {
            System.out.println("Student not found.");
            return 1;
        }
    }
    public Map<Integer, Integer> countDistinctMarks(Map<Integer, Student> studentMap,String subject) {
        Map<Integer, Integer> scoreCountMap = new HashMap<>();

        for (Student student : studentMap.values()) {
            Integer score = null;
            switch (subject.toLowerCase()) {
                case "math":
                    score = student.getMath();
                    break;
                case "english":
                    score = student.getEnglish();
                    break;
                case "science":
                    score = student.getScience();
                    break;
                case "history":
                    score = student.getHistory();
                    break;
                default:
                    System.out.println("Invalid subject provided.");
                    return scoreCountMap;
            }

            if (score != null) {
                scoreCountMap.put(score, scoreCountMap.getOrDefault(score, 0) + 1);
            }
        }
        return scoreCountMap;
    }

    public static void main(String[] args) {
        StudentMap studentMap = new StudentMap();
        Map<Integer,Student> idToStudentMap =studentMap.convertListToMap(studentMap.studentList);
//        studentMap.addStudentToMap(new Student(51,"anbu",10,10,10,10));
//        studentMap.updateScore("anbu",12,12,12);
//        studentMap.removeStudentBelowThresHold("math",80);
//
//        Student topStudent = studentMap.findStudentWithHighestScore("math");
//
//        if (topStudent != null) {
//            System.out.println("Top student's math score: " + topStudent.getMath());
//            topStudent.getStudentDetail();
//        } else {
//            System.out.println("No top student found for the given subject.");
//        }
//        Map<String,Integer> resultMap = new HashMap<>();
//        resultMap =studentMap.getStudentsAboveThreshold(idToStudentMap,60,"math");
//        for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
//            System.out.println("student : "+entry.getKey() +" value : "+entry.getValue());
//        }
//
//        Set<String> names = studentMap.getAllStudentNames(idToStudentMap);
//        for (String name : names) {
//            System.out.println("names : "+name);
//        }
//
//        int score = studentMap.getScoreForSubject(idToStudentMap,"John Doe","math");
//        if (score !=1 ){
//            System.out.println("student score : "+score);
//        }
//
//        Map<Integer,Integer> scoreCountMap =studentMap.countDistinctMarks(idToStudentMap,"math");
//        for (Map.Entry<Integer, Integer> integerIntegerEntry : scoreCountMap.entrySet()) {
//            System.out.println("score : "+ integerIntegerEntry.getKey()+ " count : "+integerIntegerEntry.getValue());
//        }
    }
}
