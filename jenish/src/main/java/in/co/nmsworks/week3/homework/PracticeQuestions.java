package in.co.nmsworks.week3.homework;

import java.io.*;
import java.sql.*;
import java.util.*;

public class PracticeQuestions {
    public void positiveOrNegative(int num){
        if(num == 0){
            System.out.println(num+" is zero");
        }
        else if(num < 0){
            System.out.println(num+" is negative number");
        }
        else if(num > 0){
            System.out.println(num+" is positive number");
        }
    }

    public void fibonacci(int num){
        int a = 0;
        int b = 1;
        System.out.println("Fibonacci numbers till "+num+" terms...");
        for (int i = 1; i <= num ; i++) {
            System.out.print(a+", ");
            int sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println();
    }

    public void sumOfNumbers(){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int num = 0;
       do {
            System.out.println("Enter a number: ");
            num = sc.nextInt();
            sum += num;
        } while(num != 0);
        System.out.println("Sum of all numbers: "+sum);
    }

    public void displayContent(){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        do{
            System.out.println("1.Choose Menu A");
            System.out.println("2.Choose Menu B");
            System.out.println("3.Choose Menu C");
            System.out.println("4.Exit");
            System.out.println("Enter your choice: ");
            num = sc.nextInt();
        }while (num != 4);
    }

    public void reverseString(String str){
        String result = "";
        for (int i = str.length() - 1; i >= 0 ; i--) {
            result += str.charAt(i);
        }
        System.out.println("Reversed String: "+result);
    }

    public void removeSpaces(String str){
        System.out.println("Trimmed String: "+str.replaceAll(" ",""));
    }

    public void longestSubstring(String str){
        String temp = "";
        String longestSubString = "";

        for (int i = 0; i < str.length() ; i++) {
            if(temp.indexOf(str.charAt(i)) == -1){
                temp += str.charAt(i);
            }
            else{
                if(temp.length() > longestSubString.length()){
                    longestSubString = temp;
                }
                temp = temp.substring(temp.indexOf(str.charAt(i)) + 1) + str.charAt(i);
            }
        }
        if(temp.length() > longestSubString.length()){
            longestSubString = temp;
        }
        System.out.println("Longest Substring :: "+longestSubString);
    }

    public void mergeTwoArrayList(){
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1,4,5,6,3,7));
        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(2,5,6,7,3));
        List<Integer> numbers3 = new ArrayList<>();
        for (Integer num : numbers1) {
            numbers3.add(num);
        }
        for (Integer num : numbers2) {
            numbers3.add(num);
        }
        System.out.println(numbers3);
    }

    public void addItToSetOfNames(){
        List<String> namesList = new ArrayList<>(Arrays.asList("Jeff","Sam","John","Dhoni","Virat","Jeff","Sam"));
        Set<String> namesSet = new HashSet<>(namesList);
        Map<String,Integer> namesToItsLength = new HashMap<>();
        Iterator<String> iterator = namesSet.iterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            namesToItsLength.put(name,name.length());
        }
        System.out.println(namesToItsLength);
    }

    public void connectToDatabase() {
        String insertSql = "INSERT INTO Student VALUES (?, ?, ?)";
        String updateSql = "UPDATE Student SET name = ? WHERE id = ?";

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training", "nms", "")) {
            try (PreparedStatement insertStatement = connection.prepareStatement(insertSql)) {
                insertStatement.setInt(1, 101);
                insertStatement.setString(2, "Jeff");
                insertStatement.setString(3, "jeff@gmail.com");
                int noOfRows = insertStatement.executeUpdate();
                System.out.println(noOfRows + " rows affected");
            }

            try (PreparedStatement updateStatement = connection.prepareStatement(updateSql)) {
                updateStatement.setString(1, "Sam");
                updateStatement.setInt(2, 101);
                int noOfRows = updateStatement.executeUpdate();
                System.out.println(noOfRows + " rows affected");
            }

            try (Statement statement = connection.createStatement();
                 ResultSet rs = statement.executeQuery("SELECT * FROM Student")) {
                while (rs.next()) {
                    System.out.println("Id :: " + rs.getInt(1));
                    System.out.println("Name :: " + rs.getString(2));
                    System.out.println("EmailId :: " + rs.getString(3));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void readFileContent() {
        try (FileReader reader = new FileReader("");
             BufferedReader bufferedReader = new BufferedReader(reader)) {

            String line = bufferedReader.readLine();
            int count = 0;
            while(line != null){
                count++;
                line = bufferedReader.readLine();
            }
            System.out.println("Total No of Lines in the File :: "+count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readAndHandleFileCases(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a File name :: ");
        String filePath = sc.nextLine();
        try (FileReader reader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(reader)) {

            String line = bufferedReader.readLine();
            while (line != null) {
                line = bufferedReader.readLine();
            }
            System.out.println("File reading completed");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

        public static void main(String[] args) {
        PracticeQuestions pq = new PracticeQuestions();
        pq.positiveOrNegative(3);
        pq.fibonacci(10);
        pq.sumOfNumbers();
        pq.displayContent();
        Student s1 = new Student();
        s1.setName("Jeff");
        s1.setAge(22);
        s1.setGrade("A");
        System.out.println(s1);
        pq.reverseString("hello");
        pq.removeSpaces("    Hello World   ");
        pq.longestSubstring("abdbcdf");
        pq.mergeTwoArrayList();
        pq.addItToSetOfNames();
        pq.connectToDatabase();
        pq.readFileContent();
        pq.readAndHandleFileCases();
    }
}