package in.co.nmsworks.week2.collections;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class PQ14 {
    public static void main(String[] args) {
        PQ14 data = new PQ14();
        data.setArray(7,8,9);
        data.setArray(16,18,20);
        data.setArray(25,26,28);
        data.setArray(30,31,32);
        data.setArray(31,31,32);
//        data.displayList();
        data.displayDetails2();
    }

    List<Integer[]> completedStatus = new ArrayList<>();
    List<List<Integer[]>> listInList = new ArrayList<>();
    List<Integer[]> getCompletedStatus = new ArrayList<>();

    Integer[] array1 = new Integer[3];

    private void setArray(Integer i0,Integer i1,Integer i2){
        array1 = new Integer[]{i0, i1, i2};
        completedStatus.add(array1);
        getCompletedStatus.add(array1);
    }


    public void displayDetails2(){
        listInList.add(completedStatus);
        listInList.add(getCompletedStatus);

        for(List<Integer[]> value : listInList){
            for(Integer[] values : value){
                System.out.println("\n");
                for(Integer valuesss : values){
                    System.out.print(valuesss+" ");
                }
                System.out.println();
            }
        }

    }


    private void displayList() {
        for(Integer[] values : completedStatus){
            System.out.print(Arrays.toString(values));
        }
    }
}
