package in.co.nmsworks.week3.task;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListSorting {
    public static void main(String[] args){
        LinkedList<String> names = new LinkedList<>();
        names.add("Priya");
        names.add("MANI");
        names.add("Oviya");
        names.add("Theju");
        names.add("mk");
       /* int end = names.size()-1;
        String temp;
        int start = 0;
      while(start<end){
          Collections.swap(names,start,end);
          start++;
          end--;
      }*/
        for (int i = names.size()-1; i >=0; i--) {
            names.add(names.get(i));
        }
        int mid = names.size()/2;
       for (int i = 1; i <=mid; i++) {
            String s = names.removeFirst();
        }

        System.out.println(names);
    }
}
