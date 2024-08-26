package in.co.nmsworks.week3.day5.homework;

import java.sql.*;
import java.util.*;

/**
 * Practice Questions:
 * 1. Write a program that takes an integer as input and prints whether the number is positive, negative, or zero.
 * 2. Write a program to print the first 10 numbers in the Fibonacci sequence.
 * 3. Write a program that reads integers from the user until the user enters `0`, then prints the sum of all entered integers.
 * 4. Write a program that displays a menu to the user and keeps showing the menu until the user chooses to exit.
 *                 1. Choose Menu A
 *                  2. Choose Menu B
 *                  3. Choose Menu C
 *                  4. Exit
 * 5. Create a POJO class for Student with attributes `name`, `age`, and `grade`.
 * Write a program that creates an object of the `Student` class and prints its details.
 * 6. Write a program that reverses a given string without using built-in reverse methods.
 * 7. Write a program that removes all spaces from a given string and prints the result.
 * 8. Write a program to find the longest substring without repeating characters.
 * 9. Write a program to merge two `ArrayList` objects into a third `ArrayList`.
 * 10. Write a program that reads a list of names, converts it to a `Set` to remove duplicates, and
 * then stores the unique names in a `Map` where the key is the name and the value is the length of the name.
 * 11. Write a program that performs the following operations:
 * - Connects to a database.
 * - Uses a `PreparedStatement` to insert a new record.
 * - Uses a `PreparedStatement` to update an existing record.
 * - Uses `executeQuery` to retrieve and print data from the table.
 * 12. Write a program that reads a file using `FileReader` and wraps it with `BufferedReader` to efficiently read the content.
 * Count and print the number of lines in the file.
 * 13. Write a program that prompts the user for a filename and reads the file content. Handle cases where the file does not exist or cannot be read.
 */

public class HomeWorkPractice{
    public static void main(String[] args) {
        HomeWorkPractice hp = new HomeWorkPractice();
        hp.numberCheck(1);
        System.out.println();
        hp.printFibonacci(10);
        System.out.println();
//        hp.countInput();
        System.out.println();
//        hp.menuDisplay();
        System.out.println();
//        PojoClassExample pojo = new PojoClassExample("Hari",22,'A');
//        System.out.println(pojo);
//        System.out.println();
        hp.reverseString("Hariharan");
        System.out.println();
        hp.removeSpaces("I am Hariharan");
        System.out.println();
        hp.longestString(new String[]{"Hariharan","Hariiiiiiii","India"});
        System.out.println();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        hp.mergeArray(list1 , list2);

        System.out.println();
        List<String> namesList = Arrays.asList("Hariharan","Harish","Hariharan","hari");
        hp.namesMapUnique(namesList);
        System.out.println();
        try {
            hp.dbConnect();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void dbConnect() throws SQLException {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             PreparedStatement ps = conn.prepareStatement("INSERT INTO students (name, gender) VALUES (?, ?)")) {

            ps.setString(1, "Hariharan");
            ps.setString(2, "M");
            ps.executeUpdate();
            try (Statement statement = conn.createStatement();
                 ResultSet rs = statement.executeQuery("SELECT * FROM students")) {
                while (rs.next()) {
                    System.out.println("S.no: " + rs.getInt(1) + " Name: " + rs.getString(2) + "\n Gender: " + rs.getString(3));
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private void namesMapUnique(List<String> namesList) {
        Set<String> uniqueNamesSet = new HashSet<>(namesList);
        Map<String, Integer> namesMap = new HashMap<>();
        for (String name : uniqueNamesSet) {
            namesMap.put(name, name.length());
        }

        System.out.println(namesMap.entrySet());
    }

    private void mergeArray(ArrayList<Integer> list1 , ArrayList<Integer> list2) {
        ArrayList<Integer> mergedList = new ArrayList<>();  // Create a new ArrayList to store the result

        mergedList.addAll(list1);  // Add all elements from the first list
        mergedList.addAll(list2);  // Add all elements from the second list

        System.out.println(mergedList);
    }

    private void longestString(String[] strings) {
        String longestString = "";
        int max = 0;

        for (String string : strings) {
            Set<Character> characterSet = new HashSet<>();
            for (char c : string.toCharArray()) {
                characterSet.add(c);
            }
            int length = characterSet.size();

            if (length > max) {
                max = length;
                longestString = string;
            }
        }
        System.out.println("Longest String is : "+longestString);
    }


    private void removeSpaces(String input) {
        System.out.println("Input String : "+input);
        input = input.replaceAll(" ","");
        System.out.println("Input String (after removing spaces) : "+input);
    }



    private void reverseString(String a) {
        String reversedString = "" ;
        System.out.println("Given String : "+a);
        for (int i = a.length()-1; i >= 0; i--) {
            reversedString += a.charAt(i);
        }
        System.out.println("Reversed String : " +reversedString);
    }

    private void menuDisplay() {
        int input = 0;
        Scanner sc = new Scanner(System.in);
        while (input != 4){
            System.out.println("1.Choose menu A \n2.Choose menu B\n3.Choose menu c\n4.exit");
            input = sc.nextInt();
        }
    }

    private void countInput() {
        Scanner sc = new Scanner(System.in);
        int sum = 0 ;
        int num = 1;
        while (num !=0){
            System.out.print("Press 0 for exit \nEnter the number :");
            num = sc.nextInt();
            sum +=num;
        }
        System.out.println("Sum of given numbers are :: "+sum);
    }

    private void printFibonacci(int i) {
        int num1 = 0;
        int num2 = 1;
        int sum = 0 ;
        for (int j = 0; j <= i; j++) {
            System.out.println(num1);
            sum = num1 + num2 ;
            num1 = num2;
            num2 = sum;
        }
    }

    private void numberCheck(int i) {
        if (i > 0){
            System.out.println(i+" is a positive number !!!");
        }else if (i < 0){
            System.out.println(i+" is a negative number !!!");
        }else{
            System.out.println(i+" is a zero !!!");
        }
    }
}