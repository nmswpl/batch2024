package in.co.nmsworks.weekend;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


/*
Question-1:** Write a method that takes a `List<Integer>` and
returns a new list with the even numbers removed and
the remaining numbers sorted in ascending order.
**Challenge:** Implement this method using only Java’s `List` interface methods
and `Collections` utility class.

 */

public class Practise {

    public void listOfInteger (List<Integer> integerList){
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < integerList.size() ; i++) {
            Integer getNum = integerList.get(i);
            if(getNum % 2 == 0) {
                newList.add(getNum);
                integerList.remove(getNum);
            }
        }
        System.out.println(newList);
        System.out.println(integerList);
        Collections.sort(integerList);
        System.out.println(integerList);

    }
    /*
     **Question-2:** Given two `Set<String>` instances,
     * write a method that returns a `Set<String>` containing the elements
     * that are present in both sets (intersection).
     **Challenge:** Consider edge cases where one or both sets are empty.

     */
    public Set<String> setOfString(Set<String> setOfString1,Set<String> setOfString2){
        if(setOfString1 == null || setOfString2 == null) {
            System.out.println("no elements found");
            return new HashSet<>();
        }
        Set<String> setOfIntersection = new HashSet<>(setOfString1);
        setOfIntersection.retainAll(setOfString2);
        System.out.println(setOfIntersection);

        return setOfIntersection;
    }
    /*
     **Question-3:** Write a method that takes a `Map<String, Integer>` where the keys are names and
     * the values are ages. The method should return a new map with names as keys and
     * the number of letters in each name as values.
     **Challenge:** Ensure that the implementation handles empty maps and provides accurate results.
     * */

    public Map<String, Integer> mapOfNameAndAge(Map<String,Integer> nameAgeMap){
        Map<String,Integer> nameLengthMap = new HashMap<>();
        for(Map.Entry<String,Integer> entry : nameAgeMap.entrySet()){
            String name = entry.getKey();
            nameLengthMap.put(name,name.length());
        }
        System.out.println(nameAgeMap);
        System.out.println(nameLengthMap);
        return nameAgeMap;
    }
    /*
    write a program that takes an integer as input and prints whether the number is positive, negative, or zero.
     */

    public void integerType(Integer num){
        if(num<0){
            System.out.println("negative");
        } if (num>0) {
            System.out.println("positive");
        }if(num == 0){
            System.out.println("zero");
        }
    }
    /*
    2. Write a program to print the first 10 numbers in the Fibonacci sequence.
     */
    public void fibonacci(int n){
        int firstNum = 0;
        int secondNum = 1;
        int nextNum = 0;
        System.out.print(firstNum+" , "+secondNum);
        for (int i = 0; i <= n; i++) {
            nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
            System.out.print(" ," +nextNum);
        }
    }

    /*
    3. Write a program that reads integers from the user until the user enters `0`, then prints the sum of all entered integers
     */

    public void sumOfIntegers(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number ::");
        int num = scanner.nextInt();
        int sum = 0;
        while(num !=0){
            sum += num;
            System.out.println("Enter a number ::");
            num = scanner.nextInt();

        } System.out.println("The sum of Integer::"+sum);
    }

    /*
    Write a program that displays a menu to the user and keeps showing the menu until the user chooses to exit.
	1. Choose Menu A
	2. Choose Menu B
	3. Choose Menu C
	4. Exit
     */
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Choose Menu A");
            System.out.println("2. Choose Menu B");
            System.out.println("3. Choose Menu C");
            System.out.println("4. Quit \n");
            System.out.print("Enter Your Choice (1/2/3/4) :: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("\n\nMenu A ::\n\t 1. tea\n\t 2. coffee\n\t 3. Biscuit\n");
                    break;
                case 2:
                    System.out.println("\n\nMenu B \n\t 1. idly\n\t 2. dosa\n\t 3. poori\n ");
                    break;
                case 3:
                    System.out.println("\n\nMenu C \n\t 1. cake\n\t 2. ice cream\n\t 3. rasagula\n");
                    break;
                case 4:
                    System.out.println("there is no other menu");
                    return;
                default:
                    System.out.println("invalid option");
            }
            System.out.println("Enter you choice::");
            int choice = scanner.nextInt();
        }
    }

    /*
    Write a program that removes all spaces from a given string and prints the result.
    */
    public void removeSpaces(String str){
        String result = str.replace(" ","");
        System.out.println(result);
    }

    /*
    9. Write a program to merge two `ArrayList` objects into a third `ArrayList`.
     */
    public void mergeList(ArrayList<Integer> list1,ArrayList<Integer>list2){
        ArrayList<Integer> mergeList = new ArrayList<>();
        mergeList.addAll(list1);
        mergeList.addAll(list2);
        System.out.println(mergeList);
    }

    /*
    Write a program that reads a list of names,
    converts it to a `Set` to remove duplicates,
     and then stores the unique names in a `Map`
     where the key is the name and the value is the length of the nam
     */
    public void listToSetToMap(List<String >listOfName){
        Set<String> setOfName = new HashSet<>(listOfName);
        Map<String ,Integer> nameLengthMap = new HashMap<>();
        for (String name : setOfName) {
            nameLengthMap.put(name,name.length());
        }
        System.out.println(listOfName);
        System.out.println(setOfName);
        System.out.println(nameLengthMap);
    }
    /*
    6. Write a program that reverses a given string without using built-in reverse methods.
     */

    public void  reverseString(String str) {
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        System.out.println(str);
        System.out.println(reversedStr);

    }
    /*
    8. Write a program to find the longest substring without repeating characters.
     */

    public void longestSubstring(String s) {

        Set<Character> charSet = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        int start = 0;
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            while (charSet.contains(currentChar)) {
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(currentChar);
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left;
            }
        }
        System.out.println(s.substring(start, start + maxLength));
    }
    /*
    12. Write a program that reads a file using `FileReader`
    and wraps it with `BufferedReader` to efficiently read the content.
    Count and print the number of lines in the file.
     */
    public void countAndPrintLine(){
        try {
            FileReader fr = new FileReader("/home/nms/Downloads/input.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
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
    /*
     **Question-6:** Write a method that takes a `List<String>` and
     * returns a `Map<String, Integer>` where each key is a unique string from the list
     * and the corresponding value is the number of occurrences of that string.
     **Challenge:** Optimize the solution for performance.
     * */
    public void occurrencesOfStr(List<String> stringList) {
        Map<String, Integer> countMap = new HashMap<>();
        for (String s : stringList) {
            countMap.put(s, countMap.getOrDefault(s, 0) + 1);
        }
        System.out.println(countMap);
    }
    /*
    **Question-7:** Design and implement a class that manages a collection of `Student` objects
    * where each student has a unique ID and a name.
    * The class should support efficient searching, insertion, and deletion by student ID.
    **Challenge:** Choose the appropriate data structure for efficient operations.
    */

    /*
    **Question-8:** Write a method that processes a `Map<String, String>` and
    * returns a new map where all null values are replaced with the string "Unknown".
    **Challenge:** Ensure that the original map is not modified during processing.
    */
    public void replaceNullToUnknown(Map<String,String>stringMap){
        Map<String,String> newMap = new HashMap<>();
        for(Map.Entry<String,String> entry : stringMap.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            if(value == null){
                newMap.put(key, "Unknown");
            } else {
                newMap.put(key, value);
            }
        }
    }





    public static void main(String[] args) {
        Practise p = new Practise();
        p.listOfInteger(new ArrayList<>(Arrays.asList(7,3,4,5,2,9,5,6)));
        System.out.println();

        p.setOfString(new HashSet<>(Arrays.asList("apple","orange","guava","banana")),new HashSet<>(Arrays.asList("plum","banana","grape","apple","orange")));
        System.out.println();

        Map<String,Integer> nameAgeMap = new HashMap<>();
        nameAgeMap.put("aarthi",1);
        nameAgeMap.put("pavi",2);
        nameAgeMap.put("priya",3);
        nameAgeMap.put("madhu",4);
        p.mapOfNameAndAge(nameAgeMap);
        System.out.println();

        p.integerType(-14);
        p.integerType(23);
        p.integerType(0);
        System.out.println();

        p.fibonacci(10);
        System.out.println();

        p.sumOfIntegers();
        System.out.println();

        p.displayMenu();
        System.out.println();

        p.removeSpaces("this is aarthi    from thiruvarur");
        System.out.println();

        p.mergeList(new ArrayList<>(Arrays.asList(1,2,3,4,5)),new ArrayList<>(Arrays.asList(6,7,8,9,10)));
        System.out.println();

        p.listToSetToMap(new ArrayList<>(Arrays.asList("aarthi","madhu","pavi","priya","aarthi","pavi","madhu")));
        System.out.println();

        Student student = new Student("Aarthi",21,'A');
        student.studentDetails();

        p.reverseString("hello! world");
        System.out.println();

        p.longestSubstring("abcabfcd");
        System.out.println();

        p.occurrencesOfStr(new ArrayList<>(Arrays.asList("apple","orange","mango","plum","apple","orange","apple")));
        System.out.println();

        p.countAndPrintLine();
        System.out.println();




    }
}
