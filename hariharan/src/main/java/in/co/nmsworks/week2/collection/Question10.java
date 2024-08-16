package in.co.nmsworks.week2.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Question10 {
    public Question10(Integer numbers[], Integer numbers2[]){

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(numbers));

        ArrayList<Integer> list2 = new ArrayList<>();
        list.addAll(Arrays.asList(numbers2));

        if(list2.size() == list.size()){
            for(int i = 0;i < list.size();i++){
                if(list2.get(i) != list.get(i)){
                    System.out.println("Not Matched");
                }
            }
        }else{
            System.out.println("Matched");
        }


    }


}
