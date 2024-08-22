package in.co.nmsworks.week3.day4;
/*
Write a program to find the median of an array.
        If the number of elements is odd, the median is the middle element.
        If the number of elements is even, the median is the average of the two middle elements.
 */

public class Program9 {
    public void findMedian(){
        int[] array = {2, 4, 5, 7, 8};
        int median = 0;
        int count = array.length;
        if (count % 2 != 0) {
            median = array[count / 2];
            System.out.println("Median = " + median);
        }
        else if (count % 2 == 0)
        {
            median = (count - 1) / 2 + count / 2;
            System.out.println("Median = " + median);
        }
    }
}
