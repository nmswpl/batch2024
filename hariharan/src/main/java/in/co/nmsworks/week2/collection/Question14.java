package in.co.nmsworks.week2.collection;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question14 {

   public static void testList(){

       List<Integer[]> mark= new ArrayList<>();
       Integer[][] arr1 = {{7,8,9},{16,18,20},{25,26,28},{30,31,32},{31,31,32}};
       for (Integer[] i : arr1) {
           mark.add(i);
       }

       for (int i = 0; i < mark.size(); i++) {
           System.out.println(Arrays.toString(mark.get(i)));
       }
   }
    public static void main(String[] args) {
       Question14.testList();


    }
}
