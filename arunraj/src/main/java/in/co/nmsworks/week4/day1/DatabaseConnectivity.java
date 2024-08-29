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
        //db.addEntry(51,"Arun",80,89,78,90);
        /*db.getAllStudents();
        db.highestScoreEnglish();
        db.highestScoreMath();
        db.highestScoreScience();
        db.highestScoreHistory();*/
        //db.updateScores(51,"Arun",78,98,78,67);
        //db.removeEntriesMath(80);
        //db.aboveTheThresholdMath(80);
        //db.aboveTheThresholdEng(80);
        //db.aboveThreshold(80,89,90,78);
        System.out.println(db.occuranceOfMath(89));


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
                 listToMap().remove(student.getId());
             }
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

    public void aboveTheThresholdMath(int mathM){
        Map<String ,Integer> listOfMathThres = new HashMap<>();
        for (Map.Entry<Integer,Student> entry : listToMap().entrySet()){
            Student student = entry.getValue();
            if(student.getMathMark() > mathM){
            listOfMathThres.put(student.getName(),student.getMathMark());
            }
        }
        for (Map.Entry<String,Integer> entry : listOfMathThres.entrySet()){
            System.out.println(entry);
        }
    }
    public void aboveTheThresholdEng(int engM){
        Map<String ,Integer> listOfEngThres = new HashMap<>();
        for (Map.Entry<Integer,Student> entry : listToMap().entrySet()){
            Student student = entry.getValue();
            if(student.getEnglishMark() > engM){
                listOfEngThres.put(student.getName(),student.getEnglishMark());
            }
        }
        for (Map.Entry<String,Integer> entry : listOfEngThres.entrySet()){
            System.out.println(entry);
        }
    }

    public void aboveThreshold(int mathM,int engM,int sciM,int hisM){
        Map<String ,Student> listOfThres = new HashMap<>();
        for (Map.Entry<Integer,Student> entry : listToMap().entrySet()){
            Student student = entry.getValue();
            if(student.getMathMark() > mathM || student.getEnglishMark() > engM ||
            student.getScienceMark() > sciM || student.getHistoryMark() > hisM){
                listOfThres.put(student.getName(),student);
            }
        }
        for (Map.Entry<Integer,Student> entry : listToMap().entrySet()){
            System.out.println(entry);
        }
    }

    public void mergeAnotherMap(){


    }

    public Map<Integer,Integer> occuranceOfMath(int mathM){
        Map<Integer,Integer> markToOccurence = new HashMap<>();
        for (Map.Entry<Integer, Student> entry : mapOfStudents.entrySet()) {
            Integer mark = entry.getValue().getMathMark();
            if(mathM == mark) {
                int count = markToOccurence.getOrDefault(mark, 0);
                markToOccurence.put(mark, count + 1);
            }
        }
        return markToOccurence;
    }
}
         /*for (Map.Entry<Integer,Student> entry : listToMap().entrySet()){
             System.out.println(entry);
         }*/