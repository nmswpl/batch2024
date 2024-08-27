package in.co.nmsworks.week4.day1;

import java.sql.*;
import java.util.*;

public class GetStudentFromDB {
    public List<Student> studentFromDb(){
        List<Student> studentDetails = new ArrayList<>();

        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms","");
            PreparedStatement preparedStatement = connection.prepareStatement("select * from Students")){
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next())
            {
                studentDetails.add(new Student(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getInt(6)));
            }
            System.out.println(studentDetails);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return studentDetails;
    }

    Map<Integer,Student> idToStudent = new HashMap<>();
    public Map<Integer,Student> covertMap() {

        for (Student student : studentFromDb()) {
            idToStudent.put(student.getId(), student);
        }
        return idToStudent;
    }
     public void addEntries(int id,Student student)
     {
         idToStudent.put(idToStudent.size() + 1,student);
         System.out.println(idToStudent);
     }

     public void updateScore(String newName, int math, int english, int science, int history)
     {
         for (Integer student : idToStudent.keySet())
             if(idToStudent.equals(student))
                 idToStudent.replace(student,new Student(student,"Prema",51,45,65,66));
             else
                idToStudent.put(student,new Student());
     }

     public void removeEntries(int thershold)
     {
         List<Integer> newStudentMarkList = new ArrayList<>();
         for (Map.Entry<Integer, Student> entry : idToStudent.entrySet()) {
             if (entry.getValue().getMath() < thershold) {
                 newStudentMarkList.add(entry.getKey());
             }
         }
         for (Integer id : newStudentMarkList) {
             idToStudent.remove(id);
         }
         System.out.println(idToStudent);


     }


    public void findMaxScore(String subjectName){
        int higestMark = 0;
        for (Map.Entry<Integer, Student> entry : idToStudent.entrySet()) {
            if(entry.getValue().getMath() >= higestMark) {
                higestMark += entry.getValue().getMath();
                System.out.println(higestMark);
            }
            else if (entry.getValue().getEnglish() >= higestMark) {
                higestMark += entry.getValue().getEnglish();
                System.out.println(higestMark);
            } else if (entry.getValue().getHistory() >= higestMark) {
                higestMark += entry.getValue().getHistory();
                System.out.println(higestMark);
            } else if (entry.getValue().getScience() >= higestMark) {
                higestMark += entry.getValue().getScience();
                System.out.println(higestMark);
            }
        }
     }
    public int getSubjectMark(Student student, String subjectName) {
        switch (subjectName.toLowerCase()) {
            case "maths":
                return student.getMath();
            case "english":
                return student.getEnglish();
            case "science":
                return student.getScience();
            case "history":
                return student.getHistory();
            default:
                return Integer.MIN_VALUE;
        }
    }

    public Map<String, Integer> namesToTheirScores(String subjectName, int thresholdMark) {
        Map<String, Integer> namesToScoresMap = new HashMap<>();
        for (Student student : idToStudent.values()) {
            int mark = getSubjectMark(student, subjectName);
            if (mark > thresholdMark) {
                namesToScoresMap.put(student.getName(), mark);
            }
        }
        if (namesToScoresMap.isEmpty()) {
            System.out.println("subject: " + subjectName);
        }
        return namesToScoresMap;
    }

    public Set<String> retrieveAllStudentNames() {
        Set<String> setOfStudentNames = new HashSet<>();
        for (Student student : idToStudent.values()) {
            setOfStudentNames.add(student.getName());
        }
        return setOfStudentNames;
    }

    public void checkExistence(String studentName, String subjectName, int mark) {
        boolean studentExists = false;
        for (Student student : idToStudent.values()) {
            if ((getSubjectMark(student, subjectName)) == mark && student.getName().equalsIgnoreCase(studentName)) {
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

        idToStudent.putAll(studentsMap);
        System.out.println(idToStudent);
    }

    public Map<Integer, Integer> scoreAndItsCountMap(String subjectName) {
        Map<Integer, Integer> scoreAndItsCount = new HashMap<>();
        for (Student student : idToStudent.values()) {
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

        GetStudentFromDB student = new GetStudentFromDB();
        student.studentFromDb();
        student.covertMap();
        //student.addEntries(GetStudentFromDB.idToStudent.size() + 1,new Student(GetStudentFromDB.idToStudent.size() + 1,"Prema",56,76,55,76);
        student.updateScore("Premalatha",45, 65,70,60);
        student.removeEntries(76);
        student.findMaxScore("science");
        System.out.println("New Map with names and its values...");
        System.out.println(student.namesToTheirScores("english", 85));
        System.out.println("Set of all Student Names...");
        System.out.println(student.retrieveAllStudentNames());
        student.checkExistence("Prema","maths",80);
        student.mergeWithAnotherMap();
        System.out.println("Distinct scores and its counts...");
        System.out.println(student.scoreAndItsCountMap("science"));

    }
}
