package in.co.nmsworks.week3.day5.homework;



import java.util.*;

public class Practice2 {
    public static void main(String[] args) {
//        removeEvenNums(new ArrayList<>(Arrays.asList(11,21,31,33,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16)));

//        printCommonSetValues(new HashSet<>(Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape")),
//             new HashSet<>(Arrays.asList("cherry", "date", "kiwi", "lemon", "mango", "grape")));

//        Map<String, Integer> nameWithAge = new HashMap<>();
//        nameWithAge.put("Olivia", 25);
//        nameWithAge.put("Liam", 30);
//        nameWithAge.put("Emma", 28);
//        nameWithAge.put("Noah", 32);
//        nameWithAge.put("Ava", 27);
//        nameWithAge.put("Sophia", 26);
//        nameWithAge.put("James", 35);
//        nameWithAge.put("Isabella", 29);

//        getMapWithNameLenght(nameWithAge);

//        new Practice2().sortPerson();

//        reverseLinkedList();
//        occurrenceOfString();
//        System.out.println(replaceNullInsideMap());
        List<List<Integer>> nums = new ArrayList<>(
                Arrays.asList(
                        Arrays.asList(1,2,3,4),
                        Arrays.asList(5,6),
                        Arrays.asList(7,8,9),
                        Arrays.asList(9,10,11,12,13,14,15)
                )
        );

        System.out.println(nums);
        for (Integer i : flattenList(nums)) {
            System.out.println(i);
        }

    }

    private static List<Integer> flattenList(List<List<Integer>> nums) {
        List<Integer> flattenNums = new ArrayList<>();
        for (List<Integer> num : nums) {
            flattenNums.addAll(num);
        }
        return flattenNums;
    }

    private static Map<String, String> replaceNullInsideMap() {

        Map<String, String> rooms = new HashMap<>();
        rooms.put("room1" , null);
        rooms.put("room2" , "5");
        rooms.put("room3" , "3");
        rooms.put("room4" , "6");
        rooms.put("room5" , null);
        rooms.put("room6" , null);
        rooms.put("room7" , null);
        System.out.println("With NULL values :: " + rooms);

        Map<String, String> newRooms = new HashMap<>();

        for(String room : rooms.keySet())
        {
            if (rooms.get(room) == null) {
                newRooms.put(room, "Unknown");
            }
            else{
                newRooms.put(room, rooms.get(room));
            }
        }

        System.out.println("After NULL values replaced ::" + newRooms);

        return newRooms;
    }


    private static void occurrenceOfString() {

        List<String> cars = new ArrayList<>(Arrays.asList("Toyota", "Ford", "Honda", "BMW", "Tesla", "Ford", "Chevrolet", "Toyota", "Mercedes", "Audi",
                "Toyota", "Ford", "BMW", "Nissan", "Honda", "Tesla", "Toyota", "Ford", "Chevrolet", "BMW"));

        Map<String, Integer> carsCount = new HashMap<>();

        for (String car : cars) {

            if(carsCount.containsKey(car))
            {
                carsCount.put(car, carsCount.get(car) + 1);
            }
            else{
                carsCount.put(car, 1);
            }
        }

        System.out.println("car and their counts :: " + carsCount);
    }

    private static void reverseLinkedList() {

        LinkedList<String> nums = new LinkedList<>(Arrays.asList("one","two","three","four","five","six","seven","eight"));
        System.out.println("Before :: " + nums);
        int size = nums.size();
        for (int i = 0; i < size; i++) {
            nums.add(i , nums.removeLast());
        }
        System.out.println("After reversing :: " + nums);
    }


    class AgeComparer implements Comparator<Person>
    {
        @Override
        public int compare(Person o1, Person o2) {

            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }

    class NameComparer implements Comparator<Person>
    {
        @Override
        public int compare(Person o1, Person o2) {
            String name1 = o1.getName();
            String name2 = o2.getName();
            return name1.compareTo(name2);
        }
    }

    private void sortPerson()
    {
        List<Person> personsList = new ArrayList<>();

        Person p = new Person();
        p.setAge(21);
        p.setName("Muthu Raj");
        personsList.add(p);

        p = new Person();
        p.setName("John");
        p.setAge(22);
        personsList.add(p);

        p = new Person();
        p.setName("Ebin");
        p.setAge(22);
        personsList.add(p);

        p = new Person();
        p.setName("Carl");
        p.setAge(21);
        personsList.add(p);

        p = new Person();
        p.setName("Ameen");
        p.setAge(21);
        personsList.add(p);

        System.out.println(personsList);


        Collections.sort(personsList, new NameComparer());
        System.out.println("Sorting by name :: ");
        for (Person person : personsList) {
            System.out.println(person);
        }

        Collections.sort(personsList, new AgeComparer());
        System.out.println("Sorting By Age :: ");
        for (Person person : personsList) {
            System.out.println(person);
        }

    }

    private static Map<String, Integer> getMapWithNameLenght(Map<String,Integer> nameWithAge)
    {
        Map<String, Integer> nameWithLength = new HashMap<>();
        for ( String name : nameWithAge.keySet())
        {
            nameWithLength.put(name, name.length());
        }
        System.out.println(nameWithLength);
        return nameWithAge;
    }

    private static void printCommonSetValues(Set<String> s1, Set<String> s2) {

        if(!(s1.isEmpty() && s2.isEmpty()))
        {
            s1.retainAll(s2);
            System.out.println("The common elements are "+s1);
        }
        else{

            System.out.println("No common elements");
        }
    }
    private static void removeEvenNums(List<Integer> nums)
    {
        nums.removeIf(n->n % 2 == 0);
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);
    }
}
