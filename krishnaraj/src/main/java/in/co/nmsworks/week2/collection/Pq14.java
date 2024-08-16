package in.co.nmsworks.week2.collection;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Pq14 {
    public static void main(String[] args) {
        Pq14 pq14=new Pq14();
        pq14.testList();
    }
    public void testList(){
        Integer[] numberCount1={7,8,9};
        Integer[] numberCount2={16,18,20};
        Integer[] numberCount3={25,26,28};
        Integer[] numberCount4={30,31,32};
        Integer[] numberCount5={31,31,34};

        List<Integer[]> numberCounts=new ArrayList<>();
        numberCounts.add(numberCount1);
        numberCounts.add(numberCount2);
        numberCounts.add(numberCount3);
        numberCounts.add(numberCount4);
        numberCounts.add(numberCount5);

        for (int i = 0; i < numberCounts.size(); i++) {
            //System.out.println(Arrays.toString(numberCounts.get(i)));
        }


        for (int i = 0; i < numberCounts.size(); i++){
            Integer[] arr = numberCounts.get(i);
            for (Integer integer : arr) {
                System.out.print(" " + integer);
            }
            System.out.println();
        }
    }
}
