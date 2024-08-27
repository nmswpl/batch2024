package in.co.nmsworks.week4.day1.homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class StudentsAdmin {
    Map<Integer,Student> idToStudent=new HashMap<>();
    public static void main(String[] args){
        StudentsAdmin studentsAdmin=new StudentsAdmin();
        studentsAdmin.retriveFromDb();
//        studentsAdmin.updateScoresOfStudents("Abi",99,85,30,96);
      //  studentsAdmin.removeStudentBasedOnSubjectMarks("maths",80);
        //      System.out.println(studentsAdmin.getScoresAboveThreshold("maths",50));
        //    System.out.println(studentsAdmin.getAllStudents());

        // System.out.println(studentsAdmin.mergeWithAnotherMap());
       // System.out.println(studentsAdmin.specificMarksToStudents("science"));
    }
    public Map<Integer,Student> retriveFromDb(){

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
            PreparedStatement ps=con.prepareStatement("Select * from Students")){
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                Student student=new Student();
                student.setId(rs.getInt(1));
                student.setName(rs.getString(2));
                student.setMathsMark(rs.getInt(3));
                student.setEnglishMark(rs.getInt(4));
                student.setScienceMark(rs.getInt(5));
                student.setHistoryMark(rs.getInt(6));
                idToStudent.put(rs.getInt(1),student);

            }
            rs.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return idToStudent;
    }
    public void addStudent(Student student){
        student.setId(idToStudent.size()+1);
        idToStudent.put(idToStudent.size()+1,student);
        System.out.println(idToStudent);
    }
    public void updateScoresOfStudents(String name,int mathsMark,int engMark,int sciMark,int historyMark){
        boolean add=true;
        for (Map.Entry<Integer, Student> studentEntry : idToStudent.entrySet()) {
            if(studentEntry.getValue().getName().equalsIgnoreCase(name)){
                studentEntry.getValue().setMathsMark(mathsMark);
                studentEntry.getValue().setEnglishMark(engMark);
                studentEntry.getValue().setScienceMark(sciMark);
                studentEntry.getValue().setHistoryMark(historyMark);
                add=false;
                break;
            }
        }
        if (add)
            addStudent(new Student(name,mathsMark,engMark,sciMark,historyMark));
    }

    public void removeStudentBasedOnSubjectMarks(String subjectName,int mark){
        boolean status=true;
        List<Integer> idListToRemove=new ArrayList<>();
        if(subjectName.equalsIgnoreCase("maths")){
            for (Map.Entry<Integer, Student> studentEntry : idToStudent.entrySet()){
                if(studentEntry.getValue().getMathsMark()<=mark) {
                    idListToRemove.add(studentEntry.getKey());
                    status=false;
                }
            }
        }
        else if(subjectName.equalsIgnoreCase("science")){
            for (Map.Entry<Integer, Student> studentEntry : idToStudent.entrySet()){
                if(studentEntry.getValue().getScienceMark()<=mark) {
                    idListToRemove.add(studentEntry.getKey());
                    status=false;
                }
            }
        }
        else if(subjectName.equalsIgnoreCase("english")){
            for (Map.Entry<Integer, Student> studentEntry : idToStudent.entrySet()){
                if(studentEntry.getValue().getEnglishMark()<=mark) {
                    idListToRemove.add(studentEntry.getKey());
                    status = false;
                }
            }
        }
        else if(subjectName.equalsIgnoreCase("history")){
            for (Map.Entry<Integer, Student> studentEntry : idToStudent.entrySet()){
                if(studentEntry.getValue().getHistoryMark()<=mark) {
                    idListToRemove.add(studentEntry.getKey());
                    status = false;
                }
            }
        }
        for (Integer id : idListToRemove) {
            idToStudent.remove(id);
        }
        if(status)
            System.out.println("there is no under performance");
        else
            System.out.println("successfully deleted");

    }
    public Student findMaxScore(String subjectName){
        Student topper=new Student();
        if(subjectName.equalsIgnoreCase("maths")){
            Integer max=Integer.MIN_VALUE;
            for (Map.Entry<Integer, Student> studentEntry : idToStudent.entrySet()){
                if(studentEntry.getValue().getMathsMark()>max) {
                    max=studentEntry.getValue().getMathsMark();
                    topper=studentEntry.getValue();
                }
            }
        }
        else if(subjectName.equalsIgnoreCase("science")){
            Integer max=Integer.MIN_VALUE;
            for (Map.Entry<Integer, Student> studentEntry : idToStudent.entrySet()){
                if(studentEntry.getValue().getScienceMark()>max) {
                    max=studentEntry.getValue().getScienceMark();
                    topper=studentEntry.getValue();
                }
            }
        }
        else if(subjectName.equalsIgnoreCase("english")){
            Integer max=Integer.MIN_VALUE;
            for (Map.Entry<Integer, Student> studentEntry : idToStudent.entrySet()){
                if(studentEntry.getValue().getEnglishMark()>max) {
                    max=studentEntry.getValue().getEnglishMark();
                    topper=studentEntry.getValue();
                }
            }
        }
        else if(subjectName.equalsIgnoreCase("history")){
            Integer max=Integer.MIN_VALUE;
            for (Map.Entry<Integer, Student> studentEntry : idToStudent.entrySet()){
                if(studentEntry.getValue().getHistoryMark()>max) {
                    max=studentEntry.getValue().getHistoryMark();
                    topper=studentEntry.getValue();
                }
            }
        }
        return topper;
    }

    public Map<String,Integer> getScoresAboveThreshold(String subjectName,int threshold){
        Map<String,Integer> nameToScore=new HashMap<>();
        if(subjectName.equalsIgnoreCase("maths")){
            for (Map.Entry<Integer, Student> studentEntry : idToStudent.entrySet()){
                if(studentEntry.getValue().getMathsMark()>threshold) {
                    nameToScore.put(studentEntry.getValue().getName(),studentEntry.getValue().getMathsMark());
                }
            }
        }
        else if(subjectName.equalsIgnoreCase("science")){
            for (Map.Entry<Integer, Student> studentEntry : idToStudent.entrySet()){
                if(studentEntry.getValue().getScienceMark()>threshold) {
                    nameToScore.put(studentEntry.getValue().getName(),studentEntry.getValue().getScienceMark());
                }
            }
        }
        else if(subjectName.equalsIgnoreCase("english")){
            for (Map.Entry<Integer, Student> studentEntry : idToStudent.entrySet()){
                if(studentEntry.getValue().getEnglishMark()>threshold) {
                    nameToScore.put(studentEntry.getValue().getName(),studentEntry.getValue().getEnglishMark());
                }
            }
        }
        else if(subjectName.equalsIgnoreCase("history")){
            for (Map.Entry<Integer, Student> studentEntry : idToStudent.entrySet()){
                if(studentEntry.getValue().getHistoryMark()>threshold) {
                    nameToScore.put(studentEntry.getValue().getName(),studentEntry.getValue().getHistoryMark());
                }
            }
        }
        return nameToScore;
    }
    public Set<String> getAllStudents(){
        Set<String> names=new HashSet<>();
        for (Map.Entry<Integer, Student> studentEntry : idToStudent.entrySet()){
            names.add(studentEntry.getValue().getName());
        }
        return names;
    }

    public void checkExistence(String name,String subjectName,int mark){
        boolean status=false;
        if(subjectName.equalsIgnoreCase("maths")){
            for (Map.Entry<Integer, Student> studentEntry : idToStudent.entrySet()){
                if(studentEntry.getValue().getMathsMark()==mark && studentEntry.getValue().getName().equalsIgnoreCase(name)) {
                    status=true;
                    break;
                }
            }
        }
        else if(subjectName.equalsIgnoreCase("science")){
            for (Map.Entry<Integer, Student> studentEntry : idToStudent.entrySet()){
                if(studentEntry.getValue().getScienceMark()==mark && studentEntry.getValue().getName().equalsIgnoreCase(name)) {
                    status=true;
                    break;
                }
            }
        }
        else if(subjectName.equalsIgnoreCase("english")){
            for (Map.Entry<Integer, Student> studentEntry : idToStudent.entrySet()){
                if(studentEntry.getValue().getEnglishMark()==mark && studentEntry.getValue().getName().equalsIgnoreCase(name)) {
                    status=true;
                    break;
                }
            }
        }
        else if(subjectName.equalsIgnoreCase("history")){
            for (Map.Entry<Integer, Student> studentEntry : idToStudent.entrySet()){
                if(studentEntry.getValue().getHistoryMark()==mark && studentEntry.getValue().getName().equalsIgnoreCase(name)) {
                    status=true;
                    break;
                }
            }
        }
        if (status)
            System.out.println("student exists");
        else
            System.out.println("student is not exists");

    }

    public Map<Integer, Student> mergeWithAnotherMap(){
        Map<Integer,Student> tempIdToStudent=new HashMap<>();
        tempIdToStudent.put(102,new Student(102,"Abi",90,96,100,99));
        tempIdToStudent.put(46,new Student(46,"Rita Evans",60,66,50,39));
        tempIdToStudent.put(103,new Student(103,"muthu",87,86,100,89));
        idToStudent.putAll(tempIdToStudent);
        return idToStudent;
    }

    public Map<Integer,Integer> specificMarksToStudents(String subjectName){
        Map<Integer,Integer> marksWithStudents=new HashMap<>();
        Integer value;
        if(subjectName.equalsIgnoreCase("maths")){
            for (Map.Entry<Integer, Student> studentEntry : idToStudent.entrySet()) {
                if(marksWithStudents.containsKey(studentEntry.getValue().getMathsMark())) {
                    value = marksWithStudents.get(studentEntry.getValue().getMathsMark())+1;
                }
                else{
                    value=1;
                }
                marksWithStudents.put(studentEntry.getValue().getMathsMark(),value);
            }
        }
        else if(subjectName.equalsIgnoreCase("science")){
            for (Map.Entry<Integer, Student> studentEntry : idToStudent.entrySet()) {
                if(marksWithStudents.containsKey(studentEntry.getValue().getScienceMark())) {
                    value = marksWithStudents.get(studentEntry.getValue().getScienceMark())+1;
                }
                else{
                    value=1;
                }
                marksWithStudents.put(studentEntry.getValue().getScienceMark(),value);
            }
        }
        else if(subjectName.equalsIgnoreCase("english")){
            for (Map.Entry<Integer, Student> studentEntry : idToStudent.entrySet()) {
                if(marksWithStudents.containsKey(studentEntry.getValue().getEnglishMark())) {
                    value = marksWithStudents.get(studentEntry.getValue().getEnglishMark())+1;
                }
                else{
                    value=1;
                }
                marksWithStudents.put(studentEntry.getValue().getEnglishMark(),value);
            }
        }
        else if(subjectName.equalsIgnoreCase("history")){
            for (Map.Entry<Integer, Student> studentEntry : idToStudent.entrySet()) {
                if(marksWithStudents.containsKey(studentEntry.getValue().getHistoryMark())) {
                    value = marksWithStudents.get(studentEntry.getValue().getHistoryMark())+1;
                }
                else{
                    value=1;
                }
                marksWithStudents.put(studentEntry.getValue().getHistoryMark(),value);
            }
        }

        return marksWithStudents;


    }
}