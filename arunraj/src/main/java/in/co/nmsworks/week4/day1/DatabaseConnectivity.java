package in.co.nmsworks.week4.day1;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DatabaseConnectivity {
    Map<Integer,Student> mapOfStudents = new HashMap<>();

    public static void main(String[] args) {
        DatabaseConnectivity db = new DatabaseConnectivity();
        db.dbToList();
        db.listToMap();
        /*db.addEntry(51,"Arun",80,89,78,90);
        db.removeEntriesMath(80);
        db.getAllStudents();
        db.highestScoreEnglish();
        db.highestScoreMath();
        db.highestScoreScience();
        db.highestScoreHistory();*/
        db.updateScores(51,"Arun",78,98,78,67);
        for (Map.Entry<Integer,Student> entry : db.mapOfStudents.entrySet()){
            System.out.println(entry);
        }


    }
     public List<Student> dbToList(){
         try {
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training","nms","");
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("select * from Students");
             List<Student> students = new ArrayList<>();
             while (rs.next()){
                 Student student = new Student(rs.getInt(1),rs.getString(2),
                         rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getInt(6));
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

    public Map<Integer,Student> listToMap(){
        for (Student student : dbToList()){
            mapOfStudents.put(student.getId(), student);
        }
        /*for (Map.Entry<Integer,Student> entry : mapOfStudents.entrySet()){
            System.out.println(entry);
        }*/
        return mapOfStudents;
    }

     public void addEntry(int id,String name,int mathm,
                          int englishm,int sciencem, int historym){
        if(listToMap().containsKey(id)){
            System.out.println("It already contains");
        }
        else {
            Student student = new Student(id,name,mathm,englishm,sciencem,historym);
            listToMap().put(id,student);
        }
         /*for (Map.Entry<Integer,Student> entry : listToMap().entrySet()){
             System.out.println(entry);
         }*/
     }

     public void removeEntriesMath(int mathMark){
         for (Map.Entry<Integer,Student> entry : listToMap().entrySet()){
             Student student = entry.getValue();
             if(student.getMathMark() < mathMark){
                 listToMap().remove(student);
             }
         }
         for (Map.Entry<Integer,Student> entry : listToMap().entrySet()){
             System.out.println(entry);
         }
     }

     public void getAllStudents(){
         for (Map.Entry<Integer,Student> entry : listToMap().entrySet()){
             Student student = entry.getValue();
             System.out.println(student.getName());
         }
     }

     public void updateScores(int id,String name,int mathm,int englishm,int sciencem,int historym){
         if(listToMap().containsKey(id)){
             System.out.println("It already exist");
         }
         else {
             Student student = new Student(id,name,mathm,englishm,sciencem,historym);
             mapOfStudents.put(id,student);
         }

     }

     public void highestScoreEnglish(){
        int max = 0;
         for (Map.Entry<Integer,Student> entry : listToMap().entrySet()){
             Student student = entry.getValue();
             if(student.getEnglishMark() > max){
                 max = student.getEnglishMark();
             }
         }
         for (Map.Entry<Integer,Student> entry : listToMap().entrySet()){
             Student student = entry.getValue();
             if(max == student.getEnglishMark()){
                 System.out.println(student);
             }
         }
    }

    public void highestScoreMath(){
        int max = 0;
        for (Map.Entry<Integer,Student> entry : listToMap().entrySet()){
            Student student = entry.getValue();
            if(student.getMathMark() > max){
                max = student.getMathMark();
            }
        }
        for (Map.Entry<Integer,Student> entry : listToMap().entrySet()){
            Student student = entry.getValue();
            if(max == student.getMathMark()){
                System.out.println(student);
            }
        }
    }

    public void highestScoreScience(){
        int max = 0;
        for (Map.Entry<Integer,Student> entry : listToMap().entrySet()){
            Student student = entry.getValue();
            if(student.getScienceMark() > max){
                max = student.getScienceMark();
            }
        }
        for (Map.Entry<Integer,Student> entry : listToMap().entrySet()){
            Student student = entry.getValue();
            if(max == student.getScienceMark()){
                System.out.println(student);
            }
        }
    }

    public void highestScoreHistory(){
        int max = 0;
        for(Map.Entry<Integer,Student> entry : listToMap().entrySet()){
            Student student = entry.getValue();
            if(student.getHistoryMark() > max){
                max = student.getHistoryMark();
            }
        }
        for (Map.Entry<Integer,Student> entry : listToMap().entrySet()){
            Student student = entry.getValue();
            if(student.getHistoryMark() == max){
                System.out.println(student);
            }
        }
    }
}
