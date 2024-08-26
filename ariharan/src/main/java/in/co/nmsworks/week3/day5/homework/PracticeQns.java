package in.co.nmsworks.week3.day5.homework;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.util.*;

public class PracticeQns {

//    practice Questions:
//            1. Write a program that takes an integer as input and prints whether the number is positive, negative, or zero.
//2. Write a program to print the first 10 numbers in the Fibonacci sequence.
//3. Write a program that reads integers from the user until the user enters `0`, then prints the sum of all entered integers.
//            4. Write a program that displays a menu to the user and keeps showing the menu until the user chooses to exit.
//  1. Choose Menu A
//  2. Choose Menu B
//  3. Choose Menu C
//  4. Exit
//5. Create a POJO class for Student with attributes `name`, `age`, and `grade`.
//    Write a program that creates an object of the `Student` class and prints its details.
//6. Write a program that reverses a given string without using built-in reverse methods.
//7. Write a program that removes all spaces from a given string and prints the result.
//8. Write a program to find the longest substring without repeating characters.
//9. Write a program to merge two `ArrayList` objects into a third `ArrayList`.
//10. Write a program that reads a list of names, converts it to a `Set` to remove duplicates, and
//    then stores the unique names in a `Map` where the key is the name and the value is the length of the name.
//11. Write a program that performs the following operations:
//            - Connects to a database.
//            - Uses a `PreparedStatement` to insert a new record.
//     - Uses a `PreparedStatement` to update an existing record.
//     - Uses `executeQuery` to retrieve and print data from the table.
// 12. Write a program that reads a file using `FileReader` and wraps it with `BufferedReader` to efficiently read the content.
//    Count and print the number of lines in the file.
// 13. Write a program that prompts the user for a filename and
//    reads the file content. Handle cases where the file does not exist or cannot be read.



    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        new PracticeQns().longestString();
//        Student ari=new Student();
//        ari.setName("Ariharan");
//        ari.setAge(21);
//        ari.setGrade("A");
//        System.out.println(ari);
    }
    public void positiveOrNegative(){
        System.out.println("enter the number::");
        int val= sc.nextInt();
        if(val>0)
            System.out.println("it is a positive number");
        else if (val<0)
            System.out.println("it is a negative number");
        else
            System.out.println("it is a zero");
    }

    public void Fibonacci(){
        int val1=0,val2=1;
        for (int i = 1; i <11 ; i++) {
            System.out.println(val1);
            int val3=val1+val2;
            val1=val2;
            val2=val3;
        }
    }

    public void sumOfIntegers(){
        int sum=0,val;
        do {
            System.out.println("enter the number::");
            val= sc.nextInt();
            sum+=val;

        }while (val!=0);
        System.out.println("sum of the integers is::"+sum);
    }
    public void menu(){
        int val;
        do {
            System.out.println("\n\nChoose  Menu \n\t 1. Menu 1\n\t 2.Menu 2\n\t 3.Menu 3\n\t4.Exit \nEnter Choice (1/2/3/4) ::");
            val=sc.nextInt();
        }while (val!=4);
    }
    public void reverse(){
        System.out.println("enter the String::");
        String string=sc.nextLine();
        String reverseString="";
        for (int i = string.length()-1; i >=0 ; i--) {
            reverseString=reverseString.concat(String.valueOf(string.charAt(i)));
        }
        System.out.println(reverseString);
    }
    public void removeSpaces(){
        System.out.println("enter the String::");
        String string=sc.nextLine();
        String afterRemoveSpaces=string.replaceAll(" ","");
        System.out.println(afterRemoveSpaces);
    }
    public void longestString(){
//        Write a program to find the longest substring without repeating characters.
        System.out.println("enter the String::");
        String string=sc.nextLine();
        int max=0;
        String res="";
        for (int i = 0; i <string.length() ; i++) {
            for (int j = i+1; j <string.length(); j++) {
                String subString=string.substring(i,j);
                String lonString="";
                for (int k = 0; k <subString.length() ; k++) {
                    if(subString.substring(k+1).contains(String.valueOf(subString.charAt(k)))) {
                        continue;
                    }else {
                        lonString=lonString.concat(String.valueOf(string.charAt(k)));
                    }
                }
                if (subString.equals(lonString)){
                    if(max<lonString.length()){
                        max=lonString.length();
                        res=lonString;
                    }
                }
            }
        }
        System.out.println("the longest subString is::"+res);
    }
    public void mergeArrayList() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(5);
        list1.add(4);
        list1.add(8);
        list1.add(66);
        list1.add(35);
        List<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(12);
        list2.add(13);
        list2.add(14);
        list2.add(15);
        list2.add(16);
        list2.add(17);
        list2.add(18);
        List<Integer> mergeList=new ArrayList<>(list1);
        mergeList.addAll(list2);
        System.out.println(mergeList);
    }
    public void collections(){
        // Write a program that reads a list of names, converts it to a `Set` to remove duplicates, and
//    then stores the unique names in a `Map` where the key is the name and the value is the length of the name.
        List<String> names=new ArrayList<>();
        names.add("ari");
        names.add("muthu");
        names.add("jenish");
        names.add("vijay");
        names.add("abi");
        names.add("ari");
        names.add("abi");
        names.add("aravindh");
        System.out.println("the names store in the list "+names);
        Set<String> namesSet=new HashSet<>(names);
        System.out.println("the names store in the Set "+namesSet);
        Map<String,Integer> nameToNamelen=new HashMap<>();
        for (String name : namesSet) {
            nameToNamelen.put(name,name.length());
        }
        System.out.println("the names store in the map ");
        System.out.println(nameToNamelen);
    }
    public void fileParsing(String path){
//        Write a program that reads a file using `FileReader` and wraps it with `BufferedReader` to efficiently read the content.
////    Count and print the number of lines in the file.
        try (FileReader fr=new FileReader(path);
             BufferedReader br=new BufferedReader(fr)){
            String line = "";
            int count=0;
            while ((line = br.readLine()) != null) {
                count++;
            }
            System.out.println("the number of the lines in the file is::"+count);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void fileParsingHandling(){
        System.out.println("enter the path and filename to read(like:/home/nms/text.txt)::");
        String path= sc.nextLine();
        try (FileReader fr=new FileReader(path);
             BufferedReader br=new BufferedReader(fr)){
            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            };
        }catch (FileNotFoundException e){
            System.err.println("File not found");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
