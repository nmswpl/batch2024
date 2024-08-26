package in.co.nmsworks.week3.practise;


import java.util.*;

public class PractiseQuestionSet2 {
    /*
Question-1:** Write a method that takes a `List<Integer>` and returns a new list with the even numbers removed and
the remaining numbers sorted in ascending order.
**Challenge:** Implement this method using only Java’s `List` interface methods and `Collections` utility class.
     */
    public void removeEvenNumbers() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);

        List<Integer> oddNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0)
                oddNumbers.remove(number);
            else
                oddNumbers.add(number);
        }
        System.out.println(oddNumbers);
    }

    /*
    **Question-2:** Given two `Set<String>` instances, write a method that returns a `Set<String>`
     containing the elements that are present in both sets (intersection).
    **Challenge:** Consider edge cases where one or both sets are empty.
     */
    public void mergeTwoSets() {
        Set<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Grey");
        colors.add("Black");
        colors.add("Brown");

        Set<String> vehicles = new HashSet<>();
        vehicles.add("Bike");
        vehicles.add("Car");
        vehicles.add("Auto");
        vehicles.add("Bus");
        vehicles.addAll(colors);
        vehicles.retainAll(colors);

        System.out.println(vehicles);
    }

    /*
    **Question-3:** Write a method that takes a `Map<String, Integer>` where the keys are names and the values are ages.
    The method should return a new map with names as keys and the number of letters in each name as values.
    **Challenge:** Ensure that the implementation handles empty maps and provides accurate results.
     */
    public void returnMapValues() {
        Map<String, Integer> namesAndAge = new HashMap<>();
        namesAndAge.put("Atchaya", 21);
        namesAndAge.put("Raji", 22);
        namesAndAge.put("Prema", 21);
        namesAndAge.put("Nasi", 23);
        namesAndAge.put("Dharani", 20);

        System.out.println(namesAndAge);

        Map<String, Integer> namesAndIsLetterCount = new HashMap<>();

        for (Map.Entry<String, Integer> entry : namesAndAge.entrySet()) {
            String name = entry.getKey();
            int charCount = name.length();
            namesAndIsLetterCount.put(name, charCount);
        }
        System.out.println(namesAndIsLetterCount);
    }

    /*
**Question-5:** Write a method that reverses the elements of a `LinkedList<String>` without using additional collections.
The method should modify the original list in place.
**Challenge:** Implement this method using only `LinkedList` methods.
*/
    public void reverseElementsInLinkedList() {
        LinkedList<String> vehicles = new LinkedList<>();
        vehicles.add("Bike");
        vehicles.add("Car");
        vehicles.add("Auto");
        vehicles.add("Bus");
        vehicles.add("Cycle");

        for (int i = vehicles.size() - 1; i >= 0; i--) {
            System.out.println(vehicles.get(i));
        }
    }

    /*
    **Question-6:** Write a method that takes a `List<String>` and returns a `Map<String, Integer>` where
    each key is a unique string from the list and the corresponding value is the number of occurrences of that string.
    **Challenge:** Optimize the solution for performance.
     */
    public void listToMap() {
        List<String> names = new ArrayList<>();
        names.add("Atchaya");
        names.add("Raji");
        names.add("Prema");
        names.add("Nasi");
        names.add("Dharani");
        names.add("Jeni");
        names.add("Raji");
        names.add("Prema");
        names.add("Nasi");

        System.out.println("List of names : " + names);

        Map<String, Integer> nameANdItsOccurrences = new HashMap<>();
        for (String str : names) {

            nameANdItsOccurrences.put(str, nameANdItsOccurrences.get(str) + 1);
        }
        System.out.println(nameANdItsOccurrences);

    }

    /*
    **Question-8:** Write a method that processes a `Map<String, String>` and returns a new map where all null values
    are replaced with the string "Unknown".
    **Challenge:** Ensure that the original map is not modified during processing.
     */
    public void replaceNullValuesInMap() {
        Map<String, String> nameAndDepartment = new HashMap<>();
        nameAndDepartment.put("Raji", "CSE");
        nameAndDepartment.put("Prema", null);
        nameAndDepartment.put("Nasi", "IT");
        nameAndDepartment.put("Dharani", "IT");
        nameAndDepartment.put("Jeni", null);

        Map<String, String> namesAndItsValue = new HashMap<>();
        for (Map.Entry<String, String> entry : nameAndDepartment.entrySet()) {
            entry.getKey();
            String value = entry.getValue();
            if (value == null)
                value = "Unknown";
            namesAndItsValue.put(entry.getKey(), value);
        }
        System.out.println(namesAndItsValue);
    }

    /*
    **Question-9:** Write a method that accepts a `List<List<Integer>>` and returns a flattened `List<Integer>`
    containing all the integers from the nested lists.
    **Challenge:** Handle cases where the nested lists are of varying sizes.
     */
    public void returnSingleList() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);

        List<Integer> num = new ArrayList<>();
        for (int i = 10; i < 20; i++) {
            num.add(i);
        }
        System.out.println(num);

        List<List<Integer>> numberList = new ArrayList<>();
        numberList.add(numbers);
        numberList.add(num);

        List<Integer> finalList = new ArrayList<>();
        for (List<Integer> integers : numberList) {
            for (Integer integer : integers) {
                finalList.add(integer);
            }
        }
        System.out.println(finalList);
    }


    public static void main(String[] args) {

        PractiseQuestionSet2 p = new PractiseQuestionSet2();
        p.removeEvenNumbers();
        p.mergeTwoSets();
        p.returnMapValues();
        p.reverseElementsInLinkedList();
        p.listToMap();
        p.replaceNullValuesInMap();
        p.returnSingleList();
    }
}
