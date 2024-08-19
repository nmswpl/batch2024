package in.co.nmsworks.week3.day1;
import  java.util.*;

//*Q5:** Write a method that takes a list of lists and returns a single list containing all elements of the nested lists.


public class Q5 {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        for (int i = 1; i <=5; i++) {
            list1.add(i);
        }


        List<Integer> list2=new ArrayList<>(list1);
        for (int i = 11; i <=15; i++) {
           list2.add(i);
        }

        List<Integer> list3=new ArrayList<>(list2);
        for (int i = 20; i <=25; i++) {
            list3.add(i);
        }

        List<List<Integer>> list=new ArrayList<>();
       list.add(list1);
       list.add(list2);
       list.add(list3);



           System.out.println("The final list"+list);
       }


}
