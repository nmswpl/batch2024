package in.co.nmsworks.week3;

import java.util.*;

public class ListProg {
    List<Integer> list = new ArrayList<>();
    Set<Integer> inter = new HashSet<>();

    public List<Integer> setList(int number) {
        list.add(number);
        return list;
    }

    public void evenList(List<Integer> list) {
        List<Integer> evenList = new ArrayList<>();
        for (Integer i : list) {
            if (i % 2 != 0) {
                evenList.add(i);
            }
        }
   Collections.sort(evenList);
        for (Integer i : evenList)
        {
            System.out.println(i);
        }
    }


    public void intersection() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> inter;
        int a[] = new int[]{1, 5, 7, 3, 9, 4, 0};
        for (Integer i : a) {
            set1.add(i);
        }
        int b[] = new int[]{4, 656, 78, 3, 4, 9, 7, 32, 1, 0};
        for (Integer i : b) {
            //  set2.add(i);
        }
        if (set1.isEmpty() || set2.isEmpty())        //to chevck if there is any empty set !
        {
            System.out.println(" Empty sets are found , can't perform intersection operation since, there is nothing common..");
        }
        else
        {
            set1.retainAll(set2);
            inter = new HashSet<>(set1);

            for (Integer i : inter) {
                System.out.println(i);
            }

        }
    }

    public void nameMap() {
        Map<String, Integer> nameAgeMap = new HashMap<>();
        nameAgeMap.put("Sujaritha", 21);
        nameAgeMap.put("Prems", 20);
        nameAgeMap.put("Uma", 18);

        Map<String, Integer> nameLengthMap = new HashMap<>();
        if (nameAgeMap.isEmpty())                                          //if it doesn't contain empty map
        {
            System.out.println("Contains empty map " + nameAgeMap);
        } else {
            for (String e : nameAgeMap.keySet()) {
                nameLengthMap.put(e, e.length());
            }
            for (Map.Entry<String, Integer> e : nameLengthMap.entrySet()) {
                System.out.println(e.getKey() + " " + e.getValue());
            }
        }


        Map<String, Integer> empty = new HashMap<>();              //empty map
        nameLengthMap.putAll(empty);
        if (empty.isEmpty()) {
            System.out.println("Contains empty map " + empty);
        }
    }

    public void reverseList() {
        List<String> list = new LinkedList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Kiwi");
        list.add("Strawberry");
        list.add("Peach");

        String first = " ";
        String last = " ";
        for (int i = 0; i < list.size() / 2; i++) {
            first = list.get(i);
            last = list.get(list.size() - 1 - i);

            list.set(i, last);
            list.set(list.size() - 1 - i, first);
        }
        for (String s : list) {
            System.out.println(s);
        }
    }

    public void occurenceMap() {
        List<String> list = new ArrayList<>();            //list creation
        list.add("Green");
        list.add("Blue");
        list.add("Red");
        list.add("Violet");
        list.add("Peacock blue");                     //few colors are repeated
        list.add("mauve");
        list.add("Blue");
        list.add("Green");
        list.add("Red");
        list.add("Peacock blue");
        list.add("Peacock blue");
        list.add("Blue");
        list.add("Blue");

        Map<String, Integer> occurence = new HashMap<>();
        for (String s : list) {
            occurence.put(s, occurence.getOrDefault(s, 0) + 1);
        }

        for (Map.Entry<String, Integer> e : occurence.entrySet()) {
            System.out.println("The color " + e.getKey() + " has occured  " + e.getValue() + " times in the list .");
        }
    }

    public void unknownKeyMap() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("Vanilla", "Perfume");
        map1.put("Mango", "Fruit");
        map1.put("India", "Country");
        map1.put("Chocolate", null);
        map1.put("Potato", null);
        map1.put("Burger", null);
        Map<String, String> map = new HashMap<>(map1);

        for (Map.Entry<String, String> e : map.entrySet())
        {
            if (e.getValue() == null)
            {
                e.setValue("Unknown");
            }
        }
        for (Map.Entry<String, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }

    public void nestedList() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(9);
        list1.add(7);
        list1.add(8);

        List<Integer> list2 = new ArrayList<>();
        list1.add(87);
        list1.add(54);
        list1.add(76);

        List<List<Integer>> list = new ArrayList<>();
        list.add(list2);
        list.add(list1);
        for (List<Integer> integers : list) {
            System.out.println(integers);
        }
    }

    public static void main(String[] args)
    {
        ListProg ob = new ListProg();
        List<Integer> list = new ArrayList<>();
        int[] a = new int[]{1, 6, 3, 67, 234, 8, 674};
        for (int i = 0; i < a.length-1; i++)
        {
            list = ob.setList(a[i]);
        }
        ob.evenList(list);
       ob.intersection();
        ob.nameMap();
        ob.reverseList();
        ob.occurenceMap();
       ob.unknownKeyMap();
        ob.nestedList();
    }
}
