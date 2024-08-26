package in.co.nmsworks.week3.practise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

/*
1. Write a program that takes an integer as input and prints whether the number is positive, negative, or zero.
2. Write a program to print the first 10 numbers in the Fibonacci sequence.
3. Write a program that reads integers from the user until the user enters `0`,
then prints the sum of all entered integers.
4. Write a program that displays a menu to the user and keeps showing the menu until the user chooses to exit.
	1. Choose Menu A
	2. Choose Menu B
	3. Choose Menu C
	4. Exit
5. Create a POJO class for Student with attributes `name`, `age`, and `grade`.
Write a program that creates an object of the `Student` class and prints its details.
6. Write a program that reverses a given string without using built-in reverse methods.
7. Write a program that removes all spaces from a given string and prints the result.
8. Write a program to find the longest substring without repeating characters.
9. Write a program to merge two `ArrayList` objects into a third `ArrayList`.
10. Write a program that reads a list of names, converts it to a `Set` to remove duplicates,
and then stores the unique names in a `Map` where the key is the name and the value is the length of the name.
11. Write a program that performs the following operations:
     - Connects to a database.
     - Uses a `PreparedStatement` to insert a new record.
     - Uses a `PreparedStatement` to update an existing record.
     - Uses `executeQuery` to retrieve and print data from the table.
12. Write a program that reads a file using `FileReader` and wraps it with `BufferedReader` to efficiently
 read the content. Count and print the number of lines in the file.
13. Write a program that prompts the user for a filename and reads the file content.
 Handle cases where the file does not exist or cannot be read.
 */
public class PractiseQuestions {
    public void positiveOrNegativeOrZero(int num) {
        if (num > 0) {
            System.out.println("Positive Number");
        } else if (num < 0) {
            System.out.println("Negative Number");
        } else
            System.out.println("Zero");
    }

    public void fibonacciNumber() {
        int firstNumber = 0;
        int secondNumber = 1;
        System.out.println(firstNumber +"," + secondNumber);
        for (int i = 2; i <= 10; i++) {
            int a = firstNumber + secondNumber;
            System.out.println(a);
            firstNumber = secondNumber;
            secondNumber = a;
        }
    }

    public void sumOfIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers (0 to stop):");
        int number = scanner.nextInt();
        int sum = 0;

        while (true) {

            if (number == 0) {
                break;
            }
            sum += number;
        }
        System.out.println("Sum of all entered integers: " + sum);
    }


    public void mergeArrayList() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Grey");
        colors.add("Black");
        colors.add("Brown");

        List<String> foods = new ArrayList<>();
        foods.add("Dosa");
        foods.add("Idly");
        foods.add("Pongal");

        List<String> colorsFood = new ArrayList<>();
        colorsFood.addAll(colors);
        colorsFood.addAll(foods);

        System.out.println(colorsFood);
    }

    public void listOfNames() {
        List<String> names = new ArrayList<>();
        names.add("Atchaya");
        names.add("Raji");
        names.add("Jeni");
        names.add("Nasi");
        names.add("Dharani");
        names.add("Pavithra");
        names.add("Atchaya");
        names.add("Raji");
        names.add("Jeni");

        System.out.println(names);

        Set<String> nameList = new HashSet<>();
        nameList.addAll(names);

        System.out.println(nameList);

        Map<Set<String>, Integer> namesAndItsLength = new HashMap<>();
        for (int i = 0; i < nameList.size(); i++) {
            namesAndItsLength.put(nameList, nameList.size());
        }

        System.out.println(namesAndItsLength);
    }

    public void reverseString(String word) {
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.println(word.charAt(i));
        }
    }

    public void removeSpace() {
        String line = "To remove the space in this line";
        String[] array = line.split(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Space removed string : " + array[i]);
        }
    }


    public void databaseConnectivity() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
             PreparedStatement preparedStatement = connection.prepareStatement("Insert into practise values(?, ?, ?)")) {
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "Atchaya");
            preparedStatement.setString(3, "Dev");
            preparedStatement.executeUpdate();
            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "Prema");
            preparedStatement.setString(3, "Dev");
            preparedStatement.executeUpdate();
            preparedStatement.executeUpdate("Update practise set name= \"Raji\" where id = 2");
            preparedStatement.executeUpdate("delete from practise where name = \"Raji\"");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void execute() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms", "");
             PreparedStatement preparedStatement = connection.prepareStatement("select * from practise")) {
            preparedStatement.executeQuery();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void readFile() {
        try {
            FileReader fr = new FileReader("/home/nms/Downloads/sample1.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                count++;
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {

        PractiseQuestions pq = new PractiseQuestions();
        pq.positiveOrNegativeOrZero(-5);
        pq.fibonacciNumber();
        pq.sumOfIntegers();
        pq.reverseString("Number");
        pq.removeSpace();
        pq.databaseConnectivity();
        pq.execute();
        pq.readFile();
        pq.listOfNames();
        pq.mergeArrayList();
    }
}
