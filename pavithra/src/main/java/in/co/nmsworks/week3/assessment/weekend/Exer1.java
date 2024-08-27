package in.co.nmsworks.week3.assessment.weekend;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.*;

/**
 * 1. Write a program that takes an integer as input and prints whether the number is positive, negative, or zero.
 * 2.Write a program to print the first 10 numbers in the Fibonacci sequence.
 * 3. Write a program that reads integers from the user until the user enters `0`, then prints the sum of all entered integers.
 * 4.Write a program that displays a menu to the user and keeps showing the menu until the user chooses to exit.
 * 	1. Choose Menu A
 * 	2. Choose Menu B
 * 	3. Choose Menu C
 * 	4. Exit
 * 5.Create a POJO class for Student with attributes `name`, `age`, and `grade`.
 * 	Write a program that creates an object of the `Student` class and prints its details.
 * 	6. Write a program that reverses a given string without using built-in reverse methods.
 * 	7. Write a program that removes all spaces from a given string and prints the result.
 * 	8. Write a program to find the longest substring without repeating characters.
 * 	9.Write a program to merge two `ArrayList` objects into a third `ArrayList`.
 * 	10. Write a program that reads a list of names, converts it to a `Set` to remove duplicates,
 * 	and then stores the unique names in a `Map` where the key is the name and the value is the length of the name.
 * 	12. Write a program that reads a file using `FileReader` and wraps it with `BufferedReader`
 * 	to efficiently read the content. Count and print the number of lines in the file.
 */

public class Exer1 {
    public void num(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scan.nextInt();

        if(num == 0)
        {
            System.out.println("The number is zero");
        }
        else if (num < 0)
        {
            System.out.println("The number is negative");
        }
        else
        {
            System.out.println("The number is positive");
        }
    }

    public void fibonacci()
    {
        int num1 = 0;
        int num2 = 1;
        int num3;
        System.out.print(num1 + ","  +num2);

        for(int i = 1; i <=10;i++ ){
            num3 = num1 + num2;
            System.out.print("," + num3);
            num1 = num2;
            num2 = num3;
        }

    }
    public void sum(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int sum = 0;
        while(true) {
            int num = scan.nextInt();
            if (num != 0) {
                sum += num;
            } else {
                System.out.println("Quit");
                break;
            }
        }
        System.out.println("The sum of number is : " + sum);

    }

    public void menuDisplay(){
        Scanner scan =  new Scanner(System.in);
        int choice = 0;

        while(choice !=4){
            System.out.println("Enter the Menu Type : ");
            choice = scan.nextInt();
            System.out.println("Menu List ");
            System.out.println("1 . Menu A ");
            System.out.println("2 . Menu B ");
            System.out.println("3 . Menu C ");
            System.out.println("4 . Exit ");

            switch(choice){
                case 1:
                    System.out.println("You choose Menu A");
                    break;
                case 2:
                    System.out.println("You choose Menu B");
                    break;
                case 3:
                    System.out.println("You choose Menu C");
                    break;
                case 4:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Please enter between 1 to 4 ");
            }
        }
    }
    public void removeSpace(){
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter the input string : ");
        String name = scan.nextLine();

        System.out.println("After removing spaces : " + name.replace(" ",""));

    }

    public void mergeList(){
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Pink");

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Blueberry");
        fruits.add("Banana");
        fruits.add("DragonFruit");

        List<String> mergelists = new ArrayList<>();
        mergelists.addAll(colors);
        mergelists.addAll(fruits);

        System.out.println(mergelists);

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

    public void nameToLength(){
        List<String> nameList = new ArrayList<>();
        Set<String> nameSet = new HashSet<>();
        Map<String, Integer> namesAndLength = new HashMap<>();

        nameList.add("Jenifer");
        nameList.add("Premalatha");
        nameList.add("Aarthi");
        nameList.add("Pavithra");
        nameList.add("Madhumitha");
        nameList.add("Hariharan");
        nameList.add("Krishna");
        nameList.add("Arunraj");
        nameList.add("Priyadharshini");
        nameList.add("Sujaritha");
        nameList.add("Jenish");
        nameList.add("Muthuraj");
        nameList.add("Jenifer");
        nameList.add("Premalatha");

        System.out.println("Names in List : ");
        for (String namesInList : nameList) {
            System.out.println(namesInList);
            nameSet.add(namesInList);
        }
        System.out.println("Size of list : " +nameList.size());
        System.out.println(" ");
        System.out.println("Names in Set : ");
        for (String namesInSet : nameSet) {
            System.out.println(namesInSet);
            namesAndLength.put(namesInSet, namesInSet.length());
        }
        System.out.println("Size of set : " +nameSet.size());
        System.out.println(" ");
        System.out.println("Names and length of names : ");
        for (Map.Entry entry : namesAndLength.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("Size of map : " + namesAndLength.size());
    }
    public void countAndPrintLine(){
        try {
            FileReader fr = new FileReader("/home/nms/Downloads/input.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            int count = 0;
            while (line != null){
                line = br.readLine();
                System.out.println(line);
                count++;
            }
            System.out.println("Number of lines : " +count);
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    public static void main(String[] args) {
        Exer1 ex1 = new Exer1();
        //ex1.num();
        //ex1.fibonacci();
        //ex1.sum();
       // ex1.menuDisplay();
        //ex1.removeSpace()
        // ex1.mergeList();
        //ex1.nameToLength();
        //ex1.countAndPrintLine();
        //ex1.longestSubstring("aabbcc");
    }
}
