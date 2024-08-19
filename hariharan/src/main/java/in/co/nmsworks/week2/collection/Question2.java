package in.co.nmsworks.week2.collection;

import java.util.*;

public class Question2 {
    public Question2(){
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        Integer arr[] = {1,2,3,46,7};

        list.addAll(Arrays.asList(arr));
        set.addAll(Arrays.asList(arr));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }

       Iterator ite = set.iterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }
        System.out.println("\n");


    }
}
