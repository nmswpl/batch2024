package in.co.nmsworks.week3.day5.homework;

import java.util.*;

public class CollectionsPracticeQns {
    public static void main(String[] args) {

        // new CollectionsPracticeQns().setIntersection(new HashSet<>(Arrays.asList("my","name","is","ari")),new HashSet<>(Arrays.asList("my","name","is","ari")));
        new CollectionsPracticeQns().reverseElements();
    }
    public List listOfOddNumbers(List<Integer> listOfIntegers){
//        *Question-1:** Write a method that takes a `List<Integer>` and returns a new list with the even numbers removed and the remaining numbers sorted in ascending order.
//                **Challenge:** Implement this method using only Java’s `List` interface methods and `Collections` utility class.
        List<Integer> removeEvenNumbers=new ArrayList<>();
        for (Integer numbers : listOfIntegers) {
            if(numbers%2!=0)
                removeEvenNumbers.add(numbers);
        }
        Collections.sort(removeEvenNumbers);
        return removeEvenNumbers;
    }
    public void setIntersection(Set<String> set1,Set<String> set2) {
//    Given two `Set<String>` instances, write a method that returns a `Set<String>` containing
//    the elements that are present in both sets (intersection).
//            **Challenge:** Consider edge cases where one or both sets are empty.
        Set<String> intersecValue=new HashSet<>();
        if(set1.isEmpty()||set2.isEmpty()){
            System.out.println("there is no common values because set is empty");
            return;
        }
        else {
            for (String string : set1) {
                if (set2.contains(string))
                    intersecValue.add(string);
            }
            System.out.println("the common values are::"+intersecValue);
        }
    }


//    **Question-3:** Write a method that takes a `Map<String, Integer>` where the keys are names and the values are ages.
//    The method should return a new map with names as keys and the number of letters in each name as values.
//**Challenge:** Ensure that the implementation handles empty maps and provides accurate results.

    public void mapWithNameAndLen(){
        Map<String,Integer> nameToAge=new HashMap<>();
        nameToAge.put("muthu raj",21);
        nameToAge.put("Ariharan",21);
        nameToAge.put("jenish",20);
        nameToAge.put("abi",21);
        Map<String,Integer> nameToLength=new HashMap<>();
        for (String name : nameToAge.keySet()) {
            nameToLength.put(name,name.length());
        }
        for (Map.Entry<String, Integer> entry : nameToLength.entrySet()) {
            System.out.println(entry.getKey()+"::"+entry.getValue());
        }
    }
    //    ** Create a class `Person` with fields `name` (String) and `age` (int). Write a program that sorts a `List<Person>` first by age in ascending order and then by name in alphabetical order if ages are equal.
//**Challenge:** Implement sorting using a custom `Comparator` and the `Collections.sort` method.
    public void sortPerson(){
        Person p1=new Person("ari",21);
        Person p2=new Person("jen",19);
        Person p3=new Person("abi",22);
        Person p4=new Person("muthu",96);
        Person p5=new Person("aravindh",21);
        Person p6=new Person("hari",35);
        List<Person> object=new ArrayList<>();
        object.add(p1);
        object.add(p2);
        object.add(p3);
        object.add(p4);
        object.add(p5);
        object.add(p6);
        Collections.sort(object, new Person.CompareByAge());
        System.out.println(object);
    }

    //    Write a method that reverses the elements of a `LinkedList<String>` without using additional collections.
//    The method should modify the original list in place.
//**Challenge:** Implement this method using only `LinkedList` methods.
    public void reverseElements(){
        List<String> strings=new LinkedList<>();
        strings.add("ari");
        strings.add("abi");
        strings.add("muthu");
        strings.add("jen");
        strings.add("hari");
        strings.add("vijay");
        strings.add("abinash");
        System.out.println(strings);
        int len=strings.size()-1;
        for (int i = 0; i <=len; i++) {
            strings.add(i,strings.get(len));
            strings.remove(strings.size()-1);
        }
        System.out.println(strings);
    }

    //    **Question-6:** Write a method that takes a `List<String>` and returns a `Map<String,
//            Integer>` where each key is a unique string from the list and the corresponding value is the number of
//            occurrences of that string.
//            **Challenge:** Optimize the solution for performance.
    public void stringOccurencesWithMap(){
        List<String> names=new LinkedList<>();
        names.add("ari");
        names.add("ari");
        names.add("ari");
        names.add("ari");
        names.add("abi");
        names.add("abi");
        names.add("muthu");
        names.add("muthu");
        names.add("muthu");
        names.add("muthu");
        names.add("muthu");
        names.add("jen");
        names.add("jen");
        names.add("jen");
        names.add("hari");
        names.add("vijay");
        names.add("vijay");
        names.add("abinash");
        names.add("abinash");
        names.add("abinash");
        names.add("abinash");
        Map<String,Integer> nameWithNoOfOccurences =new HashMap<>();
        for (String name : names) {
            if(nameWithNoOfOccurences.containsKey(name)){
                int value=nameWithNoOfOccurences.get(name)+1;
                nameWithNoOfOccurences.put(name,value);
            }
            else {
                nameWithNoOfOccurences.put(name,1);
            }
        }
        System.out.println(nameWithNoOfOccurences);

    }
//    Design and implement a class that manages a collection of `Student` objects where each student has a unique ID and a name.
//        The class should support efficient searching, insertion, and deletion by student ID.
//            **Challenge:** Choose the appropriate data structure for efficient operations.

    public void studentDatabase(){
        Scanner sc=new Scanner(System.in);
        int choice;
        List<StudentDetails> studentList=new ArrayList<>();
        do {
            System.out.println("\n***********************************************\n Welcome to Library");
            System.out.println("1. add a Student");
            System.out.println("2. delete a student by id");
            System.out.println("3. search a student by id");
            System.out.println("4. Quit \n");
            System.out.print("Enter Your Choice (1/2/3/4) :: ");

            choice = sc.nextInt();

            switch (choice){
                case 1:
                    StudentDetails student=new StudentDetails();
                    System.out.println("enter the id of the Student");
                    int id=sc.nextInt();
                    student.setId(id);
                    System.out.println("enter the name of the Student::");
                    sc.nextLine();
                    String name= sc.nextLine();
                    student.setName(name);
                    studentList.add(student);
                    System.out.println("successfully added");
                    break;
                case 2:
                    System.out.println("enter the id of the Student to delete");
                    id=sc.nextInt();
                    int flag=0;
                    for (StudentDetails student1 : studentList) {
                        if(student1.getId()==id) {
                            studentList.remove(student1);
                            flag = 1;
                            break;
                        }
                    }
                    if(flag==1){
                        System.out.println("successfully deleted");
                    }
                    else
                        System.out.println("student not found in our database");
                    break;
                case 3:
                    System.out.println("enter the id of the Student to search");
                    id=sc.nextInt();
                    flag=0;
                    for (StudentDetails student1 : studentList) {
                        if(student1.getId()==id) {
                            System.out.println("name::"+student1.getName());
                            System.out.println("id::"+student1.getId());
                            flag=1;
                            break;
                        }
                    }
                    if(flag==0)
                        System.out.println("student not found in our database");
                    break;
                case 4:
                    System.out.println("Thank You for visiting");
                    for (StudentDetails student1 : studentList) {
                        System.out.println(student1);
                    }
                    break;

                default:
                    System.out.println("Invalid Option !!");


            }
        }while (choice!=4);
    }
    //    **Question-8:** Write a method that processes a `Map<String, String>` and returns a new map where
//        all null values are replaced with the string "Unknown".
//            **Challenge:** Ensure that the original map is not modified during processing.
    public void replaceNullvalueinMap(){
        Map<String,String> stringWithNull=new HashMap<>();
        Map<String,String> res=new HashMap<>();
        stringWithNull.put("apple",null);
        stringWithNull.put("orange","fruit");
        stringWithNull.put("onion","vegetable");
        stringWithNull.put("kiwi",null);
        stringWithNull.put("blue berry",null);
        stringWithNull.put("Tomato",null);
        stringWithNull.put("potato",null);
        for (Map.Entry<String, String> entry : stringWithNull.entrySet()) {
            if(entry.getValue()==null)
                res.put(entry.getKey(),"unknown");
            else
                res.put(entry.getKey(), entry.getValue());
        }
        System.out.println(res);
    }

    //    **Question-9:** Write a method that accepts a `List<List<Integer>>` and returns a flattened `List<Integer>` containing
//    all the integers from the nested lists.
//            **Challenge:** Handle cases where the nested lists are of varying sizes.
    public void listOfList(){
        List<List<Integer>> nestedListOfIntegers=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        list1.add(99);
        list1.add(96);
        list1.add(97);
        list1.add(98);
        List<Integer> list2=new ArrayList<>();
        list2.add(85);
        list2.add(87);
        list2.add(86);
        list2.add(89);
        list2.add(83);
        list2.add(80);
        List<Integer> list3=new ArrayList<>();
        list3.add(5);
        list3.add(7);
        list3.add(6);
        list3.add(9);
        list3.add(3);
        list3.add(15);
        list3.add(13);
        list3.add(11);
        List<Integer> list4=new ArrayList<>();
        list4.add(25);
        list4.add(27);
        list4.add(26);
        nestedListOfIntegers.add(list1);
        nestedListOfIntegers.add(list2);
        nestedListOfIntegers.add(list3);
        nestedListOfIntegers.add(list4);
        for (List<Integer> lists : nestedListOfIntegers) {
            res.addAll(lists);
        }
        System.out.println(res);
    }

}
