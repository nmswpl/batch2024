package in.co.nmsworks.week4.day1;

import java.sql.*;
import java.util.*;

public class StudentManager {
    Map<Integer,Student> studentDetailsMap = new HashMap<>();

    public List<Student> readFromDb(){
        List<Student> studentList = new ArrayList<>();
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "Jenish7474");
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Students")) {
            while (rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int mathsMark = rs.getInt(3);
                int englishMark = rs.getInt(4);
                int scienceMark = rs.getInt(5);
                int historyMark = rs.getInt(6);
                Student student = new Student(id,name,mathsMark,englishMark,scienceMark,historyMark);
                studentList.add(student);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return studentList;
    }

    public void fillMap(List<Student> studentList){
        for (Student student : studentList) {
            studentDetailsMap.put(student.getId(),student);
        }
        //System.out.println(studentDetailsMap);
    }

    public void addStudent(Student student){
        studentDetailsMap.put(studentDetailsMap.size() + 1, student);
        System.out.println("Student Successfully added.");
        System.out.println(studentDetailsMap);
    }

    public void updateScoreOfTheStudent(String studentName, int mark, String subjectName) {
        boolean studentFound = false;
        for (Map.Entry<Integer, Student> entry : studentDetailsMap.entrySet()) {
            Student student = entry.getValue();
            if (student.getName().equalsIgnoreCase(studentName)) {
                updateSubjectMark(student, mark, subjectName);
                studentDetailsMap.put(entry.getKey(), student);
                studentFound = true;
                break;
            }
        }
        if (!studentFound) {
            Student newStudent = new Student();
            newStudent.setName(studentName);
            updateSubjectMark(newStudent, mark, subjectName);
            studentDetailsMap.put(studentDetailsMap.size() + 1, newStudent);
        }
        System.out.println("After Update...");
        System.out.println(studentDetailsMap);
    }

    public void updateSubjectMark(Student student, int mark, String subjectName) {
        switch (subjectName.toLowerCase()) {
            case "maths":
                student.setMathsMark(mark);
                break;
            case "english":
                student.setEnglishMark(mark);
                break;
            case "science":
                student.setScienceMark(mark);
                break;
            case "history":
                student.setHistoryMark(mark);
                break;
            default:
                throw new IllegalArgumentException("Unknown subject: " + subjectName);
        }
    }

    public void removeStudent(String subjectName, int thresholdMark) {
        Iterator<Map.Entry<Integer, Student>> iterator = studentDetailsMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Student> entry = iterator.next();
            Student student = entry.getValue();
            if (getSubjectMark(student, subjectName) < thresholdMark) {
                iterator.remove();
            }
        }
        System.out.println("After deletion...");
        System.out.println(studentDetailsMap);
    }

    public int getSubjectMark(Student student, String subjectName) {
        switch (subjectName.toLowerCase()) {
            case "maths":
                return student.getMathsMark();
            case "english":
                return student.getEnglishMark();
            case "science":
                return student.getScienceMark();
            case "history":
                return student.getHistoryMark();
            default:
                return Integer.MIN_VALUE;
        }
    }

    public void findHighestMark(String subjectName) {
        String topStudent = "";
        int highestMark = Integer.MIN_VALUE;
        for (Student student : studentDetailsMap.values()) {
            int mark = getSubjectMark(student, subjectName);
            if (mark > highestMark) {
                highestMark = mark;
                topStudent = student.getName();
            }
        }
        if (highestMark == Integer.MIN_VALUE) {
            System.out.println("Unknown subject: " + subjectName);
        } else {
            System.out.println("Highest mark scored Student is " + topStudent);
        }
    }

    public Map<String, Integer> namesToTheirScores(String subjectName, int thresholdMark) {
        Map<String, Integer> namesToScoresMap = new HashMap<>();
        for (Student student : studentDetailsMap.values()) {
            int mark = getSubjectMark(student, subjectName);
            if (mark > thresholdMark) {
                namesToScoresMap.put(student.getName(), mark);
            }
        }
        if (namesToScoresMap.isEmpty()) {
            System.out.println("Unknown subject: " + subjectName);
        }
        return namesToScoresMap;
    }

    public Set<String> retrieveAllStudentNames() {
        Set<String> setOfStudentNames = new HashSet<>();
        for (Student student : studentDetailsMap.values()) {
            setOfStudentNames.add(student.getName());
        }
        return setOfStudentNames;
    }

    public void checkExistence(String studentName, String subjectName, int mark) {
        boolean studentExists = false;
        for (Student student : studentDetailsMap.values()) {
            if (getSubjectMark(student, subjectName) == mark && student.getName().equalsIgnoreCase(studentName)) {
                studentExists = true;
                break;
            }
        }
        if (studentExists) {
            System.out.println("Student exists");
        } else {
            System.out.println("Student does not exist");
        }
    }

    public void mergeWithAnotherMap(){
        Map<Integer, Student> studentsMap = new HashMap<>();
        studentsMap.put(52, new Student(52,"Sam",80,90,85,76));
        studentsMap.put(53, new Student(53,"James",82,94,87,78));
        studentsMap.put(54, new Student(54,"Jack",78,92,83,77));
        studentsMap.put(8, new Student(8,"Jimmy",78,89,82,85));

        studentDetailsMap.putAll(studentsMap);
        System.out.println(studentDetailsMap);
    }

    public Map<Integer, Integer> scoreAndItsCountMap(String subjectName) {
        Map<Integer, Integer> scoreAndItsCount = new HashMap<>();
        for (Student student : studentDetailsMap.values()) {
            int mark = getSubjectMark(student, subjectName);
            if (mark != Integer.MIN_VALUE) {
                scoreAndItsCount.put(mark, scoreAndItsCount.getOrDefault(mark, 0) + 1);
            }
        }
        if (scoreAndItsCount.isEmpty()) {
            System.out.println("Unknown subject: " + subjectName);
        }
        return scoreAndItsCount;
    }

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.fillMap(studentManager.readFromDb());
        studentManager.addStudent(new Student(studentManager.studentDetailsMap.size() + 1,"Jenish",90,92,94,86));
        studentManager.updateScoreOfTheStudent("Jenish", 88, "maths");
        studentManager.removeStudent("history",70);
        studentManager.findHighestMark("science");
        System.out.println("New Map with names and its values...");
        System.out.println(studentManager.namesToTheirScores("english", 85));
        System.out.println("Set of all Student Names...");
        System.out.println(studentManager.retrieveAllStudentNames());
        studentManager.checkExistence("Jenish","maths",88);
        studentManager.mergeWithAnotherMap();
        System.out.println("Distinct scores and its counts...");
        System.out.println(studentManager.scoreAndItsCountMap("history"));
    }
}