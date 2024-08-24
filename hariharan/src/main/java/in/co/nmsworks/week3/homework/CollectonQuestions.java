package in.co.nmsworks.week3.homework;

import java.util.*;

public class CollectonQuestions {
    public static void main(String[] args) {
         CollectonQuestions collectonQuestions = new CollectonQuestions();

       collectonQuestions.getOddList();

       collectonQuestions.getCommanSet();

       Map<String,Integer> names = new HashMap<String,Integer>();
       names.put("Hari",21);
       names.put("Jenish",22);
       collectonQuestions.mapOfNames(names);

       collectonQuestions.reverseLinkedList();

       List<String> stringList = new ArrayList<String>();
       stringList.addAll(Arrays.asList("hari","ravi","hari","jenish","hari","ravi"));
       collectonQuestions.stringOccurance(stringList);

       Map<String, String> map = new HashMap<String, String>();
       map.put("person1","Hari");
       map.put("person2",null);
       map.put("person3","jenish");
       map.put("person4",null);
       collectonQuestions.mapProcessing(map);

       List<List<Integer>> list = new ArrayList<List<Integer>>();

       List<Integer> list1 = new ArrayList<Integer>();
       list1.addAll(Arrays.asList(3,5,7,1,9));

       List<Integer> list2 = new ArrayList<Integer>();
       list2.addAll(Arrays.asList(12,32,64,17,26));

       List<Integer> list3 = new ArrayList<Integer>();
       list3.addAll(Arrays.asList(20,34,45));

       list.add(list1);
       list.add(list2);
       list.add(list3);

       collectonQuestions.listFlatter(list);


    }

    public void getOddList(){
            List<Integer> numbers = new ArrayList<Integer>();
            numbers.addAll(Arrays.asList(9,6,4,8,2,3));
        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }

        }
        Collections.sort(numbers);
        System.out.println(numbers);
    }

    public  void getCommanSet(){
        Set<String> nameSet = new HashSet<String>();
        nameSet.addAll(Arrays.asList("hari","Jenish","muthu","ravi"));

        Set<String> nameSet2 = new HashSet<String>();
        nameSet2.addAll(Arrays.asList("Jenish", "ravi", "kumar", "Mohan", "Yogesh"));

       nameSet2.retainAll(nameSet);
        System.out.println(nameSet2);
    }

    public void mapOfNames(Map<String, Integer>names ){
        if(!names.isEmpty()){
            Map<String, Integer>mapOfNamesLength = new HashMap<String, Integer>();
            for (String entry : names.keySet()){
                mapOfNamesLength.put(entry,entry.length());
            }

            System.out.println(mapOfNamesLength);
        }else{
            System.out.println("Empty Map");
        }

    }

    public void reverseLinkedList(){
        List<String> list = new LinkedList<>();
        list.addAll(Arrays.asList("hari","ravi","jenish", "kumar", "arjum"));
        for (int i = 0; i < list.size()/2; i++) {
            String temp = list.get(i);
            list.set(i,list.get(list.size()-1-i));
            list.set(list.size() - 1-i,temp);
        }

        System.out.println(list);


    }

    public void stringOccurance(List<String> strings){
        Map<String, Integer> stringOccuranceCounter = new HashMap<String, Integer>();

        for (String string : strings) {
            if (stringOccuranceCounter.containsKey(string)){
                stringOccuranceCounter.put(string,stringOccuranceCounter.get(string)+1);
            }else{
                stringOccuranceCounter.put(string,1);
            }
        }

        System.out.println(stringOccuranceCounter);
    }

    public void mapProcessing(Map<String,String> map) {
        Map<String, String> newMap = new HashMap<String, String>();
        for (String key : map.keySet()) {
            if (map.get(key) == null) {
                newMap.put(key, "Unknown");
            } else {
                newMap.put(key, map.get(key));
            }


        }
        System.out.println(newMap);
    }


    public void listFlatter(List<List<Integer>> list){
        List<Integer> flattenedList = new ArrayList<Integer>();
        for (List<Integer> integers : list) {
            flattenedList.addAll(integers);
        }

        System.out.println(flattenedList);
    }




}



