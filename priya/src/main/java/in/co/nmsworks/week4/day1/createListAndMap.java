package in.co.nmsworks.week4.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class createListAndMap {
    public List<Student> getStudentList() {
        List<Student> students = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             PreparedStatement select = connection.prepareStatement("select * from Students")) {
            ResultSet rs = select.executeQuery();
            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt(1));
                student.setName(rs.getString(2));
                student.setMathMark(rs.getInt(3));
                student.setEnglishMark(rs.getInt(4));
                student.setScienceMark(rs.getInt(5));
                student.setHistoryMark(rs.getInt(6));
                students.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    public Map<Integer, Student> createMap() {

        Map<Integer, Student> idToStudents = new HashMap<>();

        List<Student> students = getStudentList();
        for (Student student : students) {
            idToStudents.put(student.getId(), student);
        }
        return idToStudents;
    }

    public static void main(String[] args) {
        StudentManager s = new StudentManager();
        s.addEntry(51, "priya", 100, 100, 100, 100);
      // s.updateScores("mani",90,90,90,90);
        s.updateScores("priya",90,90,90,90);
        //s.removeStudent("english",80);
       // s.getTopper("english");
       // s.retrieveStudentNames();
       // System.out.println(s.checkExistence("priya","history",10));
       //System.out.println(s.getNameToScores("maths",90));
       // System.out.println(s.getScoreToStudentCount("english"));
        //System.out.println(s.getMergedMap());
    }
}
class StudentManager {

    createListAndMap c = new createListAndMap();
    Map<Integer, Student> idToStudents = c.createMap();


    public void addEntry(int id, String name, int math, int eng, int sci, int his) {

        idToStudents.put(id, new Student(id, name, math, eng, sci, his));

    }


    public void updateScores(String name, int math, int eng, int science, int history) {
        System.out.println(idToStudents.size());
        for (Map.Entry<Integer, Student> entry : idToStudents.entrySet()) {

            if (entry.getValue().getName().equalsIgnoreCase(name)) {
                Student value = entry.getValue();
                value.setId(entry.getKey());
                value.setName(name);
                value.setMathMark(math);
                value.setEnglishMark(eng);
                value.setScienceMark(science);
                value.setHistoryMark(history);
                idToStudents.put(entry.getKey(),entry.getValue());
            }
            else {
                idToStudents.put((idToStudents.size() + 1), new Student(idToStudents.size() + 1, name, math, eng, science, history));
            }
            System.out.println(idToStudents.size());
            for (Integer i : idToStudents.keySet()) {
                System.out.println(i + " " + idToStudents.get(i));
            }

        }
    }


    public void removeStudent(String subject, int threshold) {
        if (subject.equalsIgnoreCase("maths")) {
            idToStudents.entrySet().removeIf(entry -> entry.getValue().getMathMark() < threshold);
        } else if (subject.equalsIgnoreCase("english")) {
            idToStudents.entrySet().removeIf(entry -> entry.getValue().getEnglishMark() < threshold);
        } else if (subject.equalsIgnoreCase("science")) {
            idToStudents.entrySet().removeIf(entry -> entry.getValue().getScienceMark() < threshold);
        } else if (subject.equalsIgnoreCase("history")) {
            idToStudents.entrySet().removeIf(entry -> entry.getValue().getHistoryMark() < threshold);
        }
        System.out.println(idToStudents.size());

    }

    public void getTopper(String subject) {
        int max = 0;
        String topper = "";
        if (subject.equalsIgnoreCase("maths")) {
            for (Map.Entry<Integer, Student> entry : idToStudents.entrySet()) {
                if (entry.getValue().getMathMark() > max) {
                    max = entry.getValue().getMathMark();
                    topper = entry.getValue().getName();
                }
            }
            System.out.println(topper + " " + max);
        }
        if (subject.equalsIgnoreCase("english")) {
            for (Map.Entry<Integer, Student> entry : idToStudents.entrySet()) {
                if (entry.getValue().getEnglishMark() > max) {
                    max = entry.getValue().getEnglishMark();
                    topper = entry.getValue().getName();
                }
            }
            System.out.println(topper + " " + max);
        }
        if (subject.equalsIgnoreCase("science")) {
            for (Map.Entry<Integer, Student> entry : idToStudents.entrySet()) {
                if (entry.getValue().getScienceMark() > max) {
                    max = entry.getValue().getScienceMark();
                    topper = entry.getValue().getName();
                }
            }
            System.out.println(topper + " " + max);
        }
        if (subject.equalsIgnoreCase("history")) {
            for (Map.Entry<Integer, Student> entry : idToStudents.entrySet()) {
                if (entry.getValue().getHistoryMark() > max) {
                    max = entry.getValue().getHistoryMark();
                    topper = entry.getValue().getName();
                }
            }
            System.out.println(topper + " " + max);
        }

    }

    public void retrieveStudentNames() {
        for (Integer i : idToStudents.keySet()) {
            System.out.println(idToStudents.get(i).getName());
        }
    }

    public boolean checkExistence(String name, String subject, int score) {
        boolean isExist = false;
        if (subject.equalsIgnoreCase("history")) {
            for (Integer i : idToStudents.keySet()) {

                if (idToStudents.get(i).getName().equalsIgnoreCase(name) && idToStudents.get(i).getHistoryMark() == score) {
                    isExist = true;
                }

            }
        }
        if (subject.equalsIgnoreCase("maths")) {
            for (Integer i : idToStudents.keySet()) {

                if (idToStudents.get(i).getName().equalsIgnoreCase(name) && idToStudents.get(i).getMathMark() == score) {
                    isExist = true;
                }

            }
        }
        if (subject.equalsIgnoreCase("english")) {
            for (Integer i : idToStudents.keySet()) {

                if (idToStudents.get(i).getName().equalsIgnoreCase(name) && idToStudents.get(i).getEnglishMark() == score) {
                    isExist = true;
                }

            }
        }
        if (subject.equalsIgnoreCase("science")) {
            for (Integer i : idToStudents.keySet()) {

                if (idToStudents.get(i).getName().equalsIgnoreCase(name) && idToStudents.get(i).getScienceMark() == score) {
                    isExist = true;
                }

            }
        }
        return isExist;
    }

    public Map<String, Integer> getNameToScores(String sub, int threshold) {
        Map<String, Integer> nameToScienceScores = new HashMap<>();
        Map<String, Integer> nameToMathScores = new HashMap<>();
        Map<String, Integer> nameToHistoryScores = new HashMap<>();
        Map<String, Integer> nameToEnglishScores = new HashMap<>();
        if (sub.equalsIgnoreCase("science")) {
            for (Integer i : idToStudents.keySet()) {
                if (idToStudents.get(i).getScienceMark() >= threshold) {
                    nameToScienceScores.put(idToStudents.get(i).getName(), idToStudents.get(i).getScienceMark());
                }
            }
           // System.out.println(nameToScienceScores.size());
            return nameToScienceScores;
        }
        if (sub.equalsIgnoreCase("maths")) {
            for (Integer i : idToStudents.keySet()) {
                if (idToStudents.get(i).getMathMark() >= threshold) {
                    nameToMathScores.put(idToStudents.get(i).getName(), idToStudents.get(i).getMathMark());
                }
            }
            System.out.println(nameToMathScores.size());
            return nameToMathScores;
        }
        if (sub.equalsIgnoreCase("english")) {
            for (Integer i : idToStudents.keySet()) {
                if (idToStudents.get(i).getEnglishMark() >= threshold) {
                    nameToEnglishScores.put(idToStudents.get(i).getName(), idToStudents.get(i).getEnglishMark());
                }
            }
            System.out.println(nameToEnglishScores.size());
            return nameToEnglishScores;
        }
        if (sub.equalsIgnoreCase("HISTORY")) {
            for (Integer i : idToStudents.keySet()) {
                if (idToStudents.get(i).getHistoryMark() >= threshold) {
                    nameToHistoryScores.put(idToStudents.get(i).getName(), idToStudents.get(i).getHistoryMark());
                }
            }
            System.out.println(nameToHistoryScores.size());
            return nameToHistoryScores;
        }
        else {
            return new HashMap<>();
        }

    }

    public  Map<Integer,Integer> getScoreToStudentCount(String sub){
        Map<Integer,Integer> scoreToStudentCount = new HashMap<>(Collections.emptyMap());
        for (Integer i : idToStudents.keySet()) {
            int score =  idToStudents.get(i).getHistoryMark();

                if(scoreToStudentCount.containsKey(score)){
                    scoreToStudentCount.put(score,(scoreToStudentCount.get(score)+1));
               }
                else {
                    scoreToStudentCount.put(score,1);
                }
        }
        System.out.println(scoreToStudentCount.size());
        return scoreToStudentCount;
    }

    public Map<String,Integer> getMergedMap(){
        Map<String,Integer> map = new HashMap<>(Collections.emptyMap());
        map.put("Rita Evans",100);
        map.put("Tinku",99);
        Map<String,Integer> map1 = getNameToScores("maths",90);
        for (String s : map1.keySet()) {
            if(map.containsKey(s)){
                map.put(s,map1.get(s));
            }
            else {
               map.put(s,map.get(s));
            }
        }
        return map;
    }
}
