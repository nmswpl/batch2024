package in.co.nmsworks.week3.homework.seta2;

public class Question2 {
    public void findSumOfElements(int[] nums){
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println("Sum of Elements :: "+sum);
    }

    public static void main(String[] args) {
        Question2 q2 = new Question2();
        q2.findSumOfElements(new int[] {4,3,7,5,2,11,17,16});
    }
}