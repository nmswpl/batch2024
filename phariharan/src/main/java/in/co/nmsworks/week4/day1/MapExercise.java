package in.co.nmsworks.week4.day1;

import java.sql.*;
import java.util.*;

public class MapExercise {

    static List<Student> studentList = getMapFromDB();
    static Map<Integer, Student> studentMap = generateStudentMapFromList(studentList);

    public static void main(String[] args) {
        MapExercise mapExercise = new MapExercise();

        //Add Entries: Insert new student names and scores into the map.
        System.out.println("Question 1 ----> ");
        mapExercise.addNewEntries("Hariharan", 98, 97, 96, 90);
        mapExercise.printMap(studentMap);

        //Update Scores: Update the scores of existing students. If a student's name is not in the map, add them with the new score.
        System.out.println("Question 2 ----> ");
        mapExercise.updateMarks("Paul Robinson", 89, 74, 98, 89);
        mapExercise.printMap(studentMap);

        //Remove Entries: Remove students who have scored below a specified threshold.
        System.out.println("Question 3 ----> ");
        mapExercise.printMap(studentMap);
        mapExercise.filterStudentByMark("Math", 84);
        mapExercise.printMap(studentMap);

        //Find Maximum Score: Find the student with the highest score.
        //If there are multiple students with the highest score, return any one of them.
        System.out.println("Question 4 ----> ");
        System.out.println(mapExercise.getStudentWithHighestScore("English"));

        //Get All Scores Above Threshold: Retrieve a map of students who have scored above a
        //given threshold, with their names as keys and their scores as values.
        System.out.println("Question 5 ----> ");
        Map<String, Integer> markToStudentMap = mapExercise.generateMarkToStudentMap("Science", 90);
        System.out.println(markToStudentMap.entrySet());

        //Get All Students: Retrieve a set of all student names in the map.
        System.out.println("Question 6 ---->");
        Set<String> nameSet = mapExercise.generateNameSetFromStudentMap();
        System.out.println(nameSet);

        //Check Existence: Check if a specific student exists in the map and
        //if a specific score is present in the map.
        System.out.println("Question 7 ---->");
        Student student = mapExercise.getStudentByName("Paul Robinson", "Math", 89);
        mapExercise.printStudent(student);

        //Merge with Another Map: Merge your map with another map of students and scores.
        // In case of key conflicts, the score from the second map should
        // overwrite the score from the first map.
        System.out.println("Question 8 ----> ");
        Map<Integer, Student> studentMap1 = new HashMap<>();
        studentMap1.put(52, new Student(52, "Dhoni", 87, 86, 92, 80));
        studentMap1.put(53, new Student(53, "Suriya", 97, 96, 93, 95));
        studentMap1.put(54, new Student(54, "Ajith", 82, 86, 85, 83));
        studentMap1.put(55, new Student(55, "Karthi", 77, 76, 62, 76));
        studentMap1.put(2, new Student(1, "Vijay", 57, 66, 82, 80));
        mapExercise.mergeTwoMaps(studentMap, studentMap1);
        mapExercise.printMap(studentMap);


        //Count Scores: Count how many students received each distinct score and
        //return a new map where the key is the score and
        //the value is the count of students who received that score.
        System.out.println("Question 9 ---->");
        Map<Integer, Integer> mapOfDistinctMarks = mapExercise.generateMapOfDistinctMarks("History");
        System.out.println(mapOfDistinctMarks.entrySet());

    }

    private void mergeTwoMaps(Map<Integer, Student> studentMap, Map<Integer, Student> studentMap1) {
        studentMap.putAll(studentMap1);
    }

    private void printMap(Map<Integer, Student> studentMap) {
        for (Map.Entry<Integer, Student> integerStudentEntry : studentMap.entrySet()) {
            System.out.println("Key\t:" + integerStudentEntry.getKey());
            printStudent(integerStudentEntry.getValue());
            System.out.println("*************");
        }
    }

    private Map<Integer, Integer> generateMapOfDistinctMarks(String subject) {
        Map<Integer, Integer> distinctMarkMap = new HashMap<>();
        for (Map.Entry<Integer, Student> integerStudentEntry : studentMap.entrySet()) {
            Student student = integerStudentEntry.getValue();
            int mark = 0;
            mark = getMarkForSubject(subject,student);
            if (mark > 0) {
                if (distinctMarkMap.containsKey(mark)) {
                    distinctMarkMap.put(mark, distinctMarkMap.get(mark) + 1);
                } else {
                    distinctMarkMap.put(mark, 1);
                }
            } else {
                return null;
            }
        }
        return distinctMarkMap;
    }

    private Student getStudentByName(String name, String subject, int mark) {
        for (Map.Entry<Integer, Student> integerStudentEntry : studentMap.entrySet()) {
            Student student = integerStudentEntry.getValue();
            int studentMark = getMarkForSubject(subject, student);
            if (name.equals(student.getName()) && mark == studentMark) {
                return student;
            }
        }return null;
    }

    private Set<String> generateNameSetFromStudentMap() {
        Set<String> nameSet = new HashSet<>();
        for (Map.Entry<Integer, Student> integerStudentEntry : studentMap.entrySet()) {
            nameSet.add(integerStudentEntry.getValue().getName());
        }
        return nameSet;
    }

    private Map<String, Integer> generateMarkToStudentMap(String subject, int minMark) {
        Map<String, Integer> markToStudentMap = new HashMap<>();
        for (Integer key : studentMap.keySet()) {
            Student student = studentMap.get(key);
            int mark = getMarkForSubject(subject, student);
            if (mark > minMark) {
                markToStudentMap.put(student.getName(), mark);
            }
        }
        return markToStudentMap;
    }

    private void printStudent(Student student) {
        if (student != null) {
            System.out.println("Student Id\t:" + student.getId());
            System.out.println("Student Name\t:" + student.getName());
            System.out.println("Marks\t:");
            System.out.println("\tMath Mark\t:" + student.getMathMark());
            System.out.println("\tEnglish Mark\t:" + student.getEnglishMark());
            System.out.println("\tScience Mark\t:" + student.getScienceMark());
            System.out.println("\tHistory Mark\t:" + student.getHistoryMark());
        } else {
            System.out.println("Not Found !!!");
        }
    }

    private String getStudentWithHighestScore(String subject) {
        String studentNameOfHighestMark = null;
        int maxMark = Integer.MIN_VALUE;
        for (Integer integer : studentMap.keySet()) {
            Student student = studentMap.get(integer);
            int mark = getMarkForSubject(subject, student);
            if (mark > maxMark) {
                maxMark = mark;
                studentNameOfHighestMark = student.getName();
            }

        }

        return studentNameOfHighestMark;
    }

    private void filterStudentByMark(String subject, int mark) {
        Set<Integer> keysToDelete = new HashSet<>();
        for (Map.Entry<Integer, Student> integerStudentEntry : studentMap.entrySet()) {
            Student student = integerStudentEntry.getValue();
            int key = integerStudentEntry.getKey();
            if (getMarkForSubject(subject, student) > mark) {
                keysToDelete.add(key);
            }
        }
        for (Integer i : keysToDelete) {
            studentMap.remove(i);
        }
    }

    private int getMarkForSubject(String subject, Student student) {
        switch (subject.toUpperCase()) {
            case "MATH":
                return student.getMathMark();
            case "ENGLISH":
                return student.getEnglishMark();
            case "SCIENCE":
                return student.getScienceMark();
            case "HISTORY":
                return student.getHistoryMark();
            default:
                System.out.println("Subject Incorrect !!!");
                break;
        }
        return 0;
    }

    private void updateMarks(String name, int mathMark, int englishMark, int scienceMark, int historyMark) {
        for (Integer integer : studentMap.keySet()) {
            if (name.equals(studentMap.get(integer).getName())) {
                studentMap.replace(integer, new Student(integer, name, mathMark, englishMark, scienceMark, historyMark));
                return;
            }
        }
        addNewEntries(name, mathMark, englishMark, scienceMark, historyMark);
    }

    private void addNewEntries(String name, int mathMark, int englishMark, int scienceMark, int historyMark) {
        studentMap.put(studentMap.size() + 1, new Student(studentMap.size() + 1, name, mathMark, englishMark, scienceMark, historyMark));
        System.out.println("new Student name inserted Successfully !!!");
    }

    private static Map<Integer, Student> generateStudentMapFromList(List<Student> studentList) {
        Map<Integer, Student> studentMap = new HashMap<>();
        for (Student student : studentList) {
            studentMap.put(student.getId(), student);
        }
        return studentMap;
    }

    private static List<Student> getMapFromDB() {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             Statement statement = conn.createStatement();
             ResultSet rs = statement.executeQuery("SELECT * FROM Students")) {
            List<Student> studentList = new ArrayList<>();
            while (rs.next()) {
                studentList.add(new Student(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6)));
            }
            return studentList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
