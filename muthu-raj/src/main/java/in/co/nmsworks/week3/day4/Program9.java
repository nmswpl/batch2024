package in.co.nmsworks.week3.day4;
/*
Problem-9: Write a program to find the median of an array.
        If the number of elements is odd, the median is the middle element.
        If the number of elements is even, the median is the average of the two middle elements.
 */
public class Program9 {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12};
        findMedian(nums);

    }

    private static void findMedian(int[] nums) {

        int len = nums.length-1;
        int mid = 0;
        if (nums.length % 2 == 0){

            int sum = nums[len/2] + nums[(len/2) + 1];
            mid = sum / 2;
        }
        else {
            mid = nums[len/2];
        }

        System.out.println("The median of the array is " + mid );

    }
}
