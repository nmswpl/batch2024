package in.co.nmsworks.week3.task;

import java.util.ArrayList;
import java.util.List;

public class NestedListToList {
    List<Integer> flattenedList = new ArrayList<>();
    public List<Integer> getFlattenedList(List<List<Integer>> nestedList){
        System.out.println(nestedList);
        for (List<Integer> list : nestedList) {
            flattenedList.addAll(list);
        }
        return flattenedList;
    }

    public static void main(String[] args) {
        NestedListToList n = new NestedListToList();
        List<List<Integer>> nestedList = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);list1.add(2);list1.add(3);list1.add(4);

        List<Integer> list2 = new ArrayList<>();
        list2.add(5);list2.add(6);

        List<Integer> list3 = new ArrayList<>();
        list3.add(7);list3.add(8);list3.add(9);

        nestedList.add(list1);
        nestedList.add(list2);
        nestedList.add(list3);

        System.out.println(n.getFlattenedList(nestedList));
    }
}
