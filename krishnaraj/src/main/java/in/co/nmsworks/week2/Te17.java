package in.co.nmsworks.week2;

/**
 * Given an array of integer, Write a Program to find the largest element in the given
 * array.
 * For E.g Input : arr[] = {12, 3, 20, 14} Output : Largest element = 20
 */
public class Te17 {
    public void printLargerElement(){
        int array1[]={12, 3, 20, 14};
        int maxValue=array1[0];
        for (int i = 1; i < array1.length-1; i++) {
            if (maxValue < array1[i]) {
                maxValue=array1[i];
            }
            System.out.println("The max value in arrary : "+maxValue);
        }
    }
}
