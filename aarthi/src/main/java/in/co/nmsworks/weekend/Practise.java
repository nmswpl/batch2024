package in.co.nmsworks.weekend;

import java.sql.*;
import java.util.*;

import static sun.text.normalizer.UCharacter.getAge;
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


    }
}
