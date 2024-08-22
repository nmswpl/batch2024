package in.co.nmsworks.week3.assesment.day4;
/* Write a program to find the median of an array.
        If the number of elements is odd, the median is the middle element.
        If the number of elements is even, the median is the average of the two middle elements.
 */

public class Median {
    public void medianOfElement(){
        int[] array = {1, 2, 3, 4, 5, 8};
        int median = 0;
        for (int i = 0; i < array.length; i++) {
            if (array.length % 2 == 0) {
                median = (array[array.length/2] + array[array.length/2 + 1]) / 2;
            }else {
                median = array[array.length/2];
            }
        }
        System.out.println("Median is : " +median);
    }
}
