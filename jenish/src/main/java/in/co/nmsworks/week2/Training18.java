package in.co.nmsworks.week2;

public class Training18 {
    public void noOfTimes(int[] arr, int target){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                count++;
            }
        }
        System.out.println("No of times "+target+" occurs is "+count);
    }
}