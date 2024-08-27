package in.co.nmsworks.week4.day1;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentAdmin {
    Map<Integer, Student> studentIdMap = new HashMap<>();


    public List<Student> connectToDb() {
        List<Student> studentList = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost: 3306/training", "nms", "");
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from Students");
            while (rs.next()) {
                Student student = new Student(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6));

                studentList.add(student);

            }
            rs.close();
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return studentList;
    }
    public Map<Integer,Student> listToMap(){
            for (Student student : connectToDb()){
                studentIdMap.put(student.getId(), student);
            }
            return studentIdMap;
        }
    //1.Add Entries: Insert new student names and scores into the map.
    public void addEntry(int id,String name,int math,
                         int english,int science, int history){
        if(listToMap().containsKey(id)){
            System.out.println("It already exist");
        }
        else {
            Student student = new Student(id,name,math,english,science,history);
            listToMap().put(id,student);
        }
    }
//2.Update Scores: Update the scores of existing students.
// If a student's name is not in the map, add them with the new score.
public void updateScores(int id,String name,int math,int english,int science,int history){
    if(listToMap().containsKey(id)){
        System.out.println("It already exist");
    }
    else {
        Student student = new Student(id,name,math,english,science,history);
        studentIdMap.put(id,student);
    }

}
//6.Get All Students: Retrieve a set of all student names in the map.

    public void getAllStudents(){
    for (Map.Entry<Integer,Student> entry : listToMap().entrySet()){
        Student student = entry.getValue();
        System.out.println(student.getName());
    }
}

    //3.Remove Entries: Remove students who have scored below a specified threshold.
    public void removeEntriesScience(int Science){
        for (Map.Entry<Integer,Student> entry : listToMap().entrySet()){
            Student student = entry.getValue();
            if(student.getScience() < Science){
                listToMap().remove(student);
            }
        }
    }
    //4.Find Maximum Score: Find the student with the highest score.
    // If there are multiple students with the highest score, return any one of them.
    public void highestScore(){

    }
    public void highestScoreEnglish(){
        int max = 0;
        for (Map.Entry<Integer,Student> entry : listToMap().entrySet()){
            Student student = entry.getValue();
            if(student.getEnglish() > max){
                max = student.getEnglish();
            }
        }
        for (Map.Entry<Integer,Student> entry : listToMap().entrySet()){
            Student student = entry.getValue();
            if(max == student.getEnglish()){
                System.out.println(student);
            }
        }
    }
    public void highestScoreMath(){
        int max = 0;
        for (Map.Entry<Integer,Student> entry : listToMap().entrySet()){
            Student student = entry.getValue();
            if(student.getMath() > max){
                max = student.getMath();
            }
        }
        for (Map.Entry<Integer,Student> entry : listToMap().entrySet()){
            Student student = entry.getValue();
            if(max == student.getMath()){
                System.out.println(student);
            }
        }
    }
    public void highestScoreScience(){
        int max = 0;
        for (Map.Entry<Integer,Student> entry : listToMap().entrySet()){
            Student student = entry.getValue();
            if(student.getScience() > max){
                max = student.getScience();
            }
        }
        for (Map.Entry<Integer,Student> entry : listToMap().entrySet()){
            Student student = entry.getValue();
            if(max == student.getScience()){
                System.out.println(student);
            }
        }
    }public void highestScoreHistory(){
        int max = 0;
        for(Map.Entry<Integer,Student> entry : listToMap().entrySet()){
            Student student = entry.getValue();
            if(student.getHistory() > max){
                max = student.getHistory();
            }
        }
        for (Map.Entry<Integer,Student> entry : listToMap().entrySet()){
            Student student = entry.getValue();
            if(student.getHistory() == max){
                System.out.println(student);
            }
        }
    }
    //8.Merge with Another Map: Merge your map with another map of students and scores.
    // In case of key conflicts, the score from the second map should overwrite the score from the first map.
    public void mergeMap(){
        Map<Integer, Student> newMap = new HashMap<Integer, Student>();
        newMap.put(54, new Student(54, "Pavi", 90,88,87,98));
        newMap.put(55, new Student(55, "Madhu", 80,89,88,94));
        newMap.put(56, new Student(56, "Priya", 91,89,92,93));
        studentIdMap.putAll(newMap);
        System.out.println(studentIdMap);
    }
    //7.Check Existence: Check if a specific student exists in the map and if a specific score is present in the map.
    public void checkExistence(String name, String subject, Integer mark){
        if(subject.equalsIgnoreCase("math")){
            for(Integer studentID: studentIdMap.keySet()){
                if(studentIdMap.get(studentID).getMath() == mark && studentIdMap.get(studentID).getName().equalsIgnoreCase(name)){
                    System.out.println("Student Exist" );
                }
            }
        } else if (subject.equalsIgnoreCase("english")) {
            for(Integer studentID: studentIdMap.keySet()){
                if(studentIdMap.get(studentID).getEnglish() == mark && studentIdMap.get(studentID).getName().equalsIgnoreCase(name)){
                    System.out.println("Student Exist" );
                }
            }
        } else if (subject.equalsIgnoreCase("science")) {
            for(Integer studentID: studentIdMap.keySet()){
                if(studentIdMap.get(studentID).getScience() == mark && studentIdMap.get(studentID).getName().equalsIgnoreCase(name)){
                    System.out.println("Student Exist" );
                }
            }
        } else if (subject.equalsIgnoreCase("history")) {
            for(Integer studentID: studentIdMap.keySet()){
                if(studentIdMap.get(studentID).getHistory() == mark && studentIdMap.get(studentID).getName().equalsIgnoreCase(name)){
                    System.out.println("Student Exist" );
                }
            }
        }
    }



    public static void main(String[] args) {
        StudentAdmin db = new StudentAdmin();
        db.connectToDb();
        db.listToMap();
        db.addEntry(51,"Aarthi",76,86,78,90);
        db.removeEntriesScience(80);
        db.getAllStudents();
        db.highestScoreEnglish();
        db.highestScoreMath();
        db.highestScoreScience();
        db.highestScoreHistory();
        db.updateScores(51,"Aarthi",78,98,78,67);
        db.checkExistence("Aarthi","math",78);
        for (Map.Entry<Integer,Student> entry : db.studentIdMap.entrySet()){
            System.out.println(entry);
        }


    }
}






