package in.co.nmsworks.week3.assesment.day4;

public class MinAndMax {
    public void findMinMax(){
        int[] intArray = {3, 5, 6, 7, 12, 56};
        int min = intArray[0];
        int max = 1;
        for (int i = 0; i < intArray.length; i++) {
            if (max < intArray[i]){
                max = intArray[i];
            }
            if (min >= intArray[i]){
                min = intArray[i];
            }
        }
        System.out.println("Minimum element = " +min);
        System.out.println("Maximum element = " +max);
    }
}
