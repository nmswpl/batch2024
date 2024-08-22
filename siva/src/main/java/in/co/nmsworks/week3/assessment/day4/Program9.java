package in.co.nmsworks.week3.assessment.day4;

/**
 * Problem-9: Write a program to find the median of an array.
 *         If the number of elements is odd, the median is the middle element.
 *         If the number of elements is even, the median is the average of the two middle elements.
 */

public class Program9 {
    public static void main(String[] args) {
        int[] nums = {2,23,4,5,6,};
        int a = nums.length;
        int b = 0;


            if(a % 2 == 1){

               b = a/2;
        }
        System.out.println(nums[b]);

    }

}
