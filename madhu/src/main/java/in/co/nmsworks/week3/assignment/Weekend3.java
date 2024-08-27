package in.co.nmsworks.week3.assignment;


import java.util.*;

public class Weekend3 {
    public static void main(String[] args){
        Weekend3 w3 = new Weekend3();
        w3.noEven(new ArrayList<>(Arrays.asList(8,7,9,2,1,4,6)));
        w3.sameElements(new HashSet<>(Arrays.asList("Apple", "Banana", "Cherry")),new HashSet<>(Arrays.asList("Apple", "Orange", "Cherry")));
        Map<String,Integer> map = new HashMap<>();
        map.put("Madhu",1);
        map.put("Priya",2);
        w3.details(map);
        w3.numType(-7);
        w3.fibonacci(10);
        System.out.println();
        w3.readInt();
        w3.menu();
        w3.reverseString("Madhu");
        w3.removeSpaces(" Ma dhu");
        w3.mergeArrays(new ArrayList<>(Arrays.asList(8,7,9)),new ArrayList<>(Arrays.asList(1,4,6)));
        w3.uniqueKey();
        w3.listToSetToMap(new ArrayList<>(Arrays.asList("aarthi","madhu","pavi","priya","aarthi","pavi","madhu")));
        w3.longestSubstring("aabbcde");
    }

   /***Question-1:** Write a method that takes a `List<Integer>` and returns a new list with the even numbers removed and the remaining numbers sorted in ascending order.

    **Challenge:** Implement this method using only Java’s `List` interface methods and `Collections` utility class*/

   public List<Integer> noEven(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer oddNum = list.get(i);
            if (oddNum % 2 == 0) {
                newList.add(oddNum);
                list.remove(oddNum);
                Collections.sort(list);
            }
        }
        System.out.println("Sorted list : " + list);
        System.out.println("Even list : " + newList);

        return newList;
    }

     /***Question-2:** Given two `Set<String>` instances, write a method that returns a `Set<String>` containing the elements
       that are present in both sets (intersection).
      **Challenge:** Consider edge cases where one or both sets are empty. */
    public Set<String> sameElements(Set<String> set, Set<String> set2) {
        Set<String> same = new HashSet<>();
        if(set.isEmpty()) {
            System.out.println("set is empty");
        } else if (set2.isEmpty()) {
            System.out.println("Set2 is empty");
        }
        else {
            set.retainAll(set2);
            same.addAll(set);
            System.out.println(same);

        }return set;
    }


    /* Question-3:** Write a method that takes a `Map<String, Integer>` where the keys are names and the values are ages.
    The method should return a new map with names as keys and the number of letters in each name as values.
     **Challenge:** Ensure that the implementation handles empty maps and provides accurate results.*/

    public Map<String,Integer> details(Map<String,Integer> map){
        Map<String,Integer> resultMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String name = entry.getKey();
            resultMap.put(name, name.length());
        }
        System.out.println(resultMap);

        return resultMap;
    }
    /* 1. Write a program that takes an integer as input and prints whether the number is positive, negative, or zero.*/
   public void numType(int num){
        if (num > 0) {
            System.out.println(num+ " is positive");
        } else if (num < 0) {
            System.out.println(num + " is negative");
        } else if (num == 0) {
            System.out.println(num+ " is zero");

        }

    }
    /* Write a program to print the first 10 numbers in the Fibonacci sequence */
    public void fibonacci(int num){
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1 + " , " + num2);
        for(int i = 0; i <= num; i++){
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(" , " + num3);
        }
    }

    /* Write a program that reads integers from the user until the user enters `0`,
     then prints the sum of all entered integers.*/
    public void readInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();
        int sum = 0;
        while (number != 0){
            sum += number;
            System.out.println("Enter a number");
            number = scanner.nextInt();
        }
        System.out.println("The sum of all entered number : " + sum);
    }

    /*Write a program that displays a menu to the user and keeps showing the menu until the user chooses to exit.
	1. Choose Menu A
	2. Choose Menu B
	3. Choose Menu C
	4. Exit*/
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome");
            System.out.println("1. Choose Menu A");
            System.out.println("2. Choose Menu B");
            System.out.println("3. Choose Menu C");
            System.out.println("4. Exit \n");
            System.out.print("Enter Your Choice (1/2/3/4) :: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\n\nChoose Menu  \n\t 1. Menu A\n\t 2. Menu B\n\t 3. Menu C\nEnter Menu (1/2/3) :: ");
                    int menu = scanner.nextInt();
                    if (menu < 1 || menu > 3) {
                        System.out.println("Invalid");
                    }
            }break;



        }
    }
    /*Write a program that reverses a given string without using built-in reverse methods.*/
   public void reverseString(String str) {
       char ch[] = str.toCharArray();
       String reversed = "";
       for (int i = ch.length - 1; i >= 0; i--) {
           reversed = reversed + ch[i];
       }
       System.out.println("The reversed string is " + reversed);


   }

    /*Write a program that removes all spaces from a given string and prints the result.*/
    public void removeSpaces(String str){
        String withoutSpace = str.replace(" ", "");
        System.out.println(withoutSpace);
    }

    /*Write a program to merge two `ArrayList` objects into a third `ArrayList`.*/
    public void mergeArrays(List<Integer> l1, List<Integer> l2){
        List<Integer> l3 = new ArrayList<>();
        l3.addAll(l1);
        l3.addAll(l2);
        System.out.println("Mered array is " +l3);
    }

    /*Write a program that reads a list of names, converts it to a `Set` to remove duplicates,
    and then stores the unique names in a `Map` w
    here the key is the name and the value is the length of the name.*/
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

    /*Write a method that takes a `List<String>` and returns a `Map<String, Integer>`
    where each key is a unique string from the list and the corresponding value is the number of occurrences of that string.
            **Challenge:** Optimize the solution for performance.*/
   public void uniqueKey() {
       List<String> newlist = Arrays.asList("Apple", "Banana", "Apple", "Orange");
       Map<String, Integer> newMap = new HashMap<>();
       for (int i = 0; i < newlist.size(); i++) {
           String value = newlist.get(i);
           newMap.put(value, value.length());
       }
       System.out.println(newMap);
   }
    /*Write a program to find the longest substring without repeating characters.*/

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
}




