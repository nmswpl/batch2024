package in.co.nmsworks.week4;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentAdmin {
    Map<Integer, Student> mapOfStudents = new HashMap<>();

    public static void main(String[] args) {
        StudentAdmin studentAdmin = new StudentAdmin();
        studentAdmin.dbToList();
        studentAdmin.listToMap();
        studentAdmin.addEntry(51, "Pavi", 80, 89, 78, 90);
        studentAdmin.updateScores(51, "Pavi", 78, 98, 78, 67);
        studentAdmin.removeEntriesMath(80);
        studentAdmin.getAllStudents();
        studentAdmin.highestScoreEnglish();
        studentAdmin.checkExistence("Pavi","Maths",80);
        for (Map.Entry<Integer, Student> entry : studentAdmin.mapOfStudents.entrySet()) {
            System.out.println(entry);
        }


    }

    public List<Student> dbToList() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Students");
            List<Student> students = new ArrayList<>();
            while (rs.next()) {
                Student student = new Student(rs.getInt(1), rs.getString(2),
                        rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6));
                students.add(student);
            }
            //System.out.println(students);

            stmt.close();
            con.close();

            return students;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Map<Integer, Student> listToMap() {
        for (Student student : dbToList()) {
            mapOfStudents.put(student.getId(), student);
        }
        for (Map.Entry<Integer, Student> entry : mapOfStudents.entrySet()) {
            System.out.println(entry);
        }
        return mapOfStudents;
    }

    public void addEntry(int id, String name, int mathm,
                         int englishm, int sciencem, int historym) {
        if (listToMap().containsKey(id)) {
            System.out.println("Already exixts..");
        } else {
            Student student = new Student(id, name, mathm, englishm, sciencem, historym);
            listToMap().put(id, student);
        }
        for (Map.Entry<Integer, Student> entry : listToMap().entrySet()) {
            System.out.println(entry);
        }
    }

    public void removeEntriesMath(int mathsMark) {
        for (Map.Entry<Integer, Student> entry : listToMap().entrySet()) {
            Student student = entry.getValue();
            if (student.getMaths() < mathsMark) {
                listToMap().remove(student);
            }
        }
        for (Map.Entry<Integer, Student> entry : listToMap().entrySet()) {
            System.out.println(entry);
        }
    }

    public void getAllStudents() {
        for (Map.Entry<Integer, Student> entry : listToMap().entrySet()) {
            Student student = entry.getValue();
            System.out.println(student.getName());
        }
    }

    public void updateScores(int id, String name, int mathm, int englishm, int sciencem, int historym) {
        if (listToMap().containsKey(id)) {
            System.out.println("It already exist");
        } else {
            Student student = new Student(id, name, mathm, englishm, sciencem, historym);
            mapOfStudents.put(id, student);
        }

    }

    public void highestScoreEnglish() {
        int max = 0;
        for (Map.Entry<Integer, Student> entry : listToMap().entrySet()) {
            Student student = entry.getValue();
            if (student.getHistory() > max) {
                max = student.getHistory();
            }
        }
        for (Map.Entry<Integer, Student> entry : listToMap().entrySet()) {
            Student student = entry.getValue();
            if (max == student.getEnglish()) {
                System.out.println(student);
            }
        }
    }
    public void checkExistence(String name, String subject, Integer mark){
        if(subject.equalsIgnoreCase("math")){
            for(Integer studentID: mapOfStudents.keySet()){
                if(mapOfStudents.get(studentID).getMaths() == mark && mapOfStudents.get(studentID).getName().equalsIgnoreCase(name)){
                    System.out.println("Student Exist" );
                }
            }
        } else if (subject.equalsIgnoreCase("english")) {
            for(Integer studentID: mapOfStudents.keySet()){
                if(mapOfStudents.get(studentID).getEnglish() == mark && mapOfStudents.get(studentID).getName().equalsIgnoreCase(name)){
                    System.out.println("Student Exist" );
                }
            }
        } else if (subject.equalsIgnoreCase("science")) {
            for(Integer studentID: mapOfStudents.keySet()){
                if(mapOfStudents.get(studentID).getScience() == mark && mapOfStudents.get(studentID).getName().equalsIgnoreCase(name)){
                    System.out.println("Student Exist" );
                }
            }
        } else if (subject.equalsIgnoreCase("history")) {
            for(Integer studentID: mapOfStudents.keySet()){
                if(mapOfStudents.get(studentID).getHistory() == mark && mapOfStudents.get(studentID).getName().equalsIgnoreCase(name)){
                    System.out.println("Student Exist" );
                }
            }
        }
    }



}

