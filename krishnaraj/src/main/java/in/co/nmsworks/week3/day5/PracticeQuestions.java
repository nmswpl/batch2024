package in.co.nmsworks.week3.day5;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;

public class PracticeQuestions {

    public static void main(String[] args) {
        PracticeQuestions practiceQuestions = new PracticeQuestions();
        practiceQuestions.checkNumber(10);
        practiceQuestions.printFibonacciSeries(11);
        practiceQuestions.calculateSumOfArray();
        practiceQuestions.menuBar();
        practiceQuestions.reverseString("abcd");
        practiceQuestions.mergerArrayList();
        practiceQuestions.setToMapConversion();
        practiceQuestions.removeSpace("ab cd ef");
        //practiceQuestions.usePreparedStatement(10,"abcd","Dev");
        practiceQuestions.countLine();
        practiceQuestions.fileReading();
    }


    public  void checkNumber(int number) {
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }

    public  void printFibonacciSeries(int n) {
        int first = 0, second = 1;
        System.out.print("Fibonacci Series: " + first + ", " + second);
        for (int i = 2; i < n; i++) {
            int sumValue = first + second;
            System.out.print(", " + sumValue);
            first = second;
            second = sumValue;
        }
    }

    public  void calculateSumOfArray() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;
        do {
            System.out.print("Enter an intege or enter 0 to stop : ");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);
        System.out.println("The total sum is: " + sum);
    }

    public  void menuBar() {
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.println("\nMenu Options:");
            System.out.println("a. Option A");
            System.out.println("b. Option B");
            System.out.println("c. Option C");
            System.out.println("Type exit to quit.");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine().trim().toLowerCase();
            switch (choice) {
                case "a":
                    System.out.println("You selected Option A.");
                    break;
                case "b":
                    System.out.println("You selected Option B.");
                    break;
                case "c":
                    System.out.println("You selected Option C.");
                    break;
                case "exit":
                case "e":
                    System.out.println("exit ...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!choice.equals("exit"));

        scanner.close();
    }

    public void reverseString(String word) {
        String reversedword = "";
        for (int i = 0; i < word.length(); i++) {
            reversedword += word.charAt(i);
        }
    }

    public void mergerArrayList() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 8, 10);
        List<Integer> mergedList = new ArrayList<>();
        for (Integer i : list1) {
            mergedList.add(i);
        }
        for (Integer i : list2) {
            mergedList.add(i);
        }
        for (Integer i : mergedList) {
            System.out.println(i);
        }
    }

    /**
     * Write a program that reads a list of names, converts it to a `Set` to remove duplicates,
     * and then stores the unique names in a `Map` where the key is the name and the value is the length of the name
     **/
    public void setToMapConversion() {
        List<String> nameOfList = Arrays.asList("aaaa", "bbbb", "cccc");
        Set<String> names1 = new HashSet<>(nameOfList);
        Map<String, Integer> nameToLength = new HashMap<>();
        for (String name : names1) {
            nameToLength.put(name, name.length());
        }
    }

    //. Write a program that removes all spaces from a given string and prints the result.
    public void removeSpace(String stringValue) {
        stringValue = stringValue.replace(" ", "");
        System.out.println(stringValue);
    }

    /***Write a program that performs the following operations:
     - Connects to a database.
     - Uses a `PreparedStatement` to insert a new record.
     - Uses a `PreparedStatement` to update an existing record.
     - Uses `executeQuery` to retrieve and print data from the table.
     ***/
    public void usePreparedStatement(int id, String name, String department) {
        String sql = "insert into student (id,name dept) values(?,?,?)";
        String sql2 = "update student set name=krish where id =? ";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training"); PreparedStatement preparedStatement = connection.prepareStatement(sql); PreparedStatement preparedStatement1 = connection.prepareStatement(sql2)) {
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, department);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                preparedStatement1.executeUpdate();
            }
            System.out.println("the student data was inserted ...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**** Write a program that reads a file using `FileReader` and wraps it with `BufferedReader` to
     *  efficiently read the content.
     *  Count and print the number of lines in the file. ***/
    public void countLine() {
        try {
            FileReader fileReader = new FileReader("/home/nms/Downloads/india.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int count = 0;
            while ((bufferedReader.readLine()) != null) {
                count++;
            }
            System.out.println("The total line in file : " + count);
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
/****
    Write a program that prompts the user for a filename and reads the file content.
    Handle cases where the file does not exist or cannot be read.   ***/
    public void fileReading() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a file path : ");
        String filePath = scanner.nextLine();
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

