package in.co.nmsworks.week4.day1;

import java.sql.*;
import java.util.*;

public class StudentSearcher {
    Map<Integer, Student> idToStudent = new HashMap<>();
    public static void main(String[] args) {
        StudentSearcher studentSearcher = new StudentSearcher();
        studentSearcher.addEntries(studentSearcher.covertMap().size()+1,new Student(studentSearcher.covertMap().size()+1,"Siva",80,70,60,45));
        studentSearcher.updateScores("Siva",70,60,50,90);
        studentSearcher.removeEntries(80);
        System.out.println(studentSearcher.findMaxScore());
        System.out.println(studentSearcher.getAllScoreAboveThreshold(60));
        studentSearcher.getAllStudents();
        studentSearcher.checkExistence("Siva",45);
        System.out.println(studentSearcher.mergeAnotherMap());

    }
    public List<Student> getStudentFromDb(){
        List<Student> studentList = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training ");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from Students");
            while (rs.next()){

                studentList.add(new Student(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getInt(6)));



            }
            rs.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return studentList;

    }
    public Map<Integer,Student> covertMap() {

        for (Student student : getStudentFromDb()) {
            idToStudent.put(student.getId(), student);

        }
        return idToStudent;
    }
    public void addEntries(int id,Student student){
        idToStudent.put(id,student);
        System.out.println(covertMap());

        }
        public void updateScores(String name,int mathMark,int englishMark,int scienceMark,int historyMark){
            for (Integer student : covertMap().keySet()) {
                if(name.equals(covertMap().get(student).getName())){
                    covertMap().replace(student,new Student(student,name,mathMark,englishMark,scienceMark,historyMark));
                }
                else {
                    covertMap().put(student,new Student(student,name,mathMark,englishMark,scienceMark,historyMark));
                }

            }

            }
            public void removeEntries(int thershold){
                List<Integer> toRemove = new ArrayList<>();
                for (Map.Entry<Integer, Student> entry : idToStudent.entrySet()) {
                    if (entry.getValue().getMathMark() < thershold) {
                        toRemove.add(entry.getKey());
                    }
                }
                for (Integer id : toRemove) {
                    idToStudent.remove(id);
                }
                System.out.println(idToStudent);


            }
    public String findMaxScore() {

        int highestMark = Integer.MIN_VALUE;
        String studentName = null;

        for (Student student : idToStudent.values()) {
            if (student.getMathMark() > highestMark) {
                highestMark = student.getMathMark();
                studentName = student.getName();
            }
        }

        return studentName != null ? studentName : "No student has a math score";
    }
    public Map<String, Integer> getAllScoreAboveThreshold(int threshold) {
        Map<String, Integer> nameToMark = new HashMap<>();
        for (Student student : idToStudent.values()) {
            if (student.getEnglishMark() > threshold) {
                nameToMark.put(student.getName(), student.getEnglishMark());
            }
        }
        return nameToMark;
    }
    public void getAllStudents(){
        Set<String> names = new HashSet<>();
        for (Student student : idToStudent.values()) {
            names.add(student.getName());

        }
        System.out.println(names);




    }
    public void checkExistence(String name, int historyMark) {
        boolean exists = false;
        for (Student student : idToStudent.values()) {
            if (student.getName().equals(name) && student.getHistoryMark() == historyMark) {
                exists = true;
                break;
            }
        }
        if (exists) {
            System.out.println("Specific student and mark exist");
        } else {
            System.out.println("Not exist");
        }
    }
    public Map<Integer,Student> mergeAnotherMap(){
        Map<Integer,Student> idToStudent1 = new HashMap<>();
        idToStudent1.put(52,new Student(52,"Deepack",70,60,80,95));
        idToStudent1.put(53,new Student(53,"Kamalesh",75,65,85,90));
        idToStudent1.put(54,new Student(54,"Vishwa",80,70,70,95));
        idToStudent1.put(49,new Student(55,"Navanee",70,60,80,95));
        covertMap().putAll(idToStudent1);
        return covertMap();
    }




}




    







