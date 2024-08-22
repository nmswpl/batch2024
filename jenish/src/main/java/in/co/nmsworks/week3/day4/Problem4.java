package in.co.nmsworks.week3.day4;

public class Problem4 {
    public void findMinAndMax(int[] numbers){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length ; i++) {
            if(min > numbers[i]){
                min = numbers[i];
            }
            else if(max < numbers[i]){
                max = numbers[i];
            }
        }
        System.out.println("Max element is "+max);
        System.out.println("Min element is "+min);
    }
}