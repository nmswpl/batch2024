package in.co.nmsworks.week2.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PQ14 {

    public void testList(){

        Integer[][] arr = { {7,8,9,7},
                            {16,18,20},
                            {25,26,28},
                            {30,31,32},
                            {31,31,32}
                            };


        List<Integer[]> marks = new ArrayList<>();
        for (Integer[] integers : arr) {
            marks.add(integers);
        }

        for (Integer[] mark : marks) {
            System.out.println(Arrays.toString(mark));
            System.out.println("size::"+mark.length);

            for (Integer i : mark) {

                System.out.println(i);
            }

        }
    }

}
