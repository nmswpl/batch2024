package in.co.nmsworks.week3.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OddSortedList {
    public void getOddSortedList(List<Integer> integers) {
        integers.removeIf(integer1 -> integer1 %2==0);
        Collections.sort(integers);
        System.out.println(integers);

    }


    public static void main(String[] args) {
      OddSortedList os = new OddSortedList();
      List<Integer> integers = new ArrayList<>();
      integers.add(1);
      integers.add(10);
      integers.add(8);
      integers.add(6);
      integers.add(9);
      integers.add(11);
      os.getOddSortedList(integers);
    }
}