package in.co.nmsworks.week3.task;

import java.util.ArrayList;
import java.util.List;

public class MergeArrayList {
    public  List<String> mergedList( List<String> nameList, List<String> nameList1){
        List<String> mergedList = new ArrayList<>();
        mergedList.addAll(nameList);
        mergedList.addAll(nameList1);
        return mergedList;
    }

    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>();
        namesList.add("Priya");
        namesList.add("Mani");
        namesList.add("jeni");
        List<String> namesList2 = new ArrayList<>();
        namesList2.add("Kesavan");
        namesList2.add("Sana");
        namesList2.add("Mano");
        MergeArrayList m = new MergeArrayList();
        System.out.println(m.mergedList(namesList,namesList2));

    }
}
