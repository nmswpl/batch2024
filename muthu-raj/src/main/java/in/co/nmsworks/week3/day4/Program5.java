package in.co.nmsworks.week3.day4;
/*
Problem-5: Write a program to find the second largest number in an array.
 */
public class Program5 {
    public static void main(String[] args) {
        int[] nums = {9,8,7,10,11,12,5,4,3,2,1,0,-1};
        System.out.println("The second Largest number is " + findSecondLargest(nums));
    }

    private static int findSecondLargest(int[] nums) {
//      sorting
//        for (int i = 0; i < nums.length-1; i++) {
//            for (int j = 0; j < nums.length-1; j++) {
//                int temp;
//                if (nums[j] > nums[j+1]) {
//                    temp = nums[j];
//                    nums[j] = nums[j+1];
//                    nums[j+1] = temp;
//                }
//            }
//        }
//        return nums[nums.length-2];

//        better approach

        int maxi = Integer.MIN_VALUE;
        int secMaxi = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > maxi) {
                secMaxi = maxi;
                maxi = num;
            }

        }
        return secMaxi;

    }
}
